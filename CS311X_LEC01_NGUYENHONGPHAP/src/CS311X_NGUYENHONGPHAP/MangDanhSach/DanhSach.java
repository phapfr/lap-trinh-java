/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.MangDanhSach;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class DanhSach {
    private ArrayList<Nguoi> a = new ArrayList<Nguoi>();
    public void docFile(String tenFile) {
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String ma, ht = " ", ns;
                    boolean gt;
                    double c1, c2;
                    ma = line.next();
                    while (!line.hasNextBoolean())
                        ht = ht + line.next();
                    gt = line.nextBoolean();
                    ns = line.next();
                    c1 = line.nextDouble();
                    c2 = line.nextDouble();
                    if (line.hasNextDouble()) {
                        double c3 = line.nextDouble();
                        SinhVien x = new SinhVien(c1, c2, c3, ma, ht, ns, gt);
                        a.add(x);
                    } else {
                        String mon = line.nextLine();
                        GiangVien x = new GiangVien(mon, c1, c2, ma, ht, ns, gt);
                        a.add(x);
                    }
                }
            } else {
                System.out.println("Khong ton tai File");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void xuatDS(String noiDung) {
        System.out.println(noiDung);
        for (Nguoi x : a)
            System.out.println(x);
    }

    public void demSV() {
        int demGV = 0;
        for (Nguoi x : a) {  
            if (x instanceof GiangVien)
                demGV++;
        }
        System.out.println("c. Sinh Vien:" + (a.size() - demGV));
        System.out.println("d. Giang Vien:" + demGV);
    }
    public void maxDTB() {
        double maxDTB = 0;
        Nguoi diem = null;
        for (Nguoi x : a)
            if (x instanceof SinhVien)
                if (maxDTB < ((SinhVien) x).tinhDTB()) {
                    maxDTB = ((SinhVien) x).tinhDTB();
                    diem = x;
                }
        System.out.println("e. Sinh vien co diem trung binh cao nhat:" + diem);
    }
    public double tongThanhTien() {
        double s = 0;
        for (Nguoi x : a)
            if (x instanceof GiangVien)
                s = s + ((GiangVien) x).tinhThanhTien();
        return s;
    }
    public void sapxep() {
        for (int i = 0; i < a.size(); i++)
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i) instanceof SinhVien && a.get(j) instanceof SinhVien) {
                    if (((SinhVien) a.get(i)).tinhDTB() > ((SinhVien) a.get(j)).tinhDTB()) {
                        SinhVien t1 = (SinhVien) a.get(i);
                        a.set(i, a.get(j));
                        a.set(j, t1);
                    }
                }
                if (a.get(i) instanceof GiangVien && a.get(j) instanceof GiangVien) {
                    if (((GiangVien) a.get(i)).tinhThanhTien() < ((GiangVien) a.get(j)).tinhThanhTien()){
                        GiangVien t2 = (GiangVien) a.get(i);
                        a.set(i, a.get(j));
                        a.set(j, t2);
                    }
                }
            }
        xuatDS("g. Sap xep cac SV tang dan theo diem trung binh va giang vien giam dan theo thanh tien :");
    }

    public void output() {
        xuatDS("Noi dung File:");
        demSV();
        maxDTB();
        System.out.println("f. Tong thanh tien cua giang vien:" + tongThanhTien());
        sapxep();
    }

    public static void main(String[] args) {
        DanhSach a = new DanhSach();
        a.docFile("C:\\Users\\phapn\\Downloads\\Lập Trình Hướng Đối Tượng\\Lập Trình Hướng Đối Tượng TXT\\sv_gv.txt");
        a.output();
    }
}
