/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC16;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class DanhSachSinhVien {
    private ArrayList<SinhVien> a = new ArrayList<SinhVien>();
    public void docFile(String tenFile) {
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
//	            01 Trien Chieu true  trienchieu@gmail.com 1/1/2000 Khai Phong Phu 9.2
                    String ma, ten, ns, dc, mail;
                    boolean gt;
                    double diem;
                    ma = line.next();//System.out.println(ma);
                    ten = " ";
                    while (!line.hasNextBoolean())
                        ten = ten + line.next() + " ";
                    ten = ten.trim();//System.out.println(ten);
                    gt = line.nextBoolean();//System.out.println(gt);
                    mail = line.next();
                    ns = line.next();
                    ns = ns.trim();
                    dc = " ";
                    while (!line.hasNextDouble())
                        dc = dc + line.next() + " ";
                    dc = dc.trim();
                    diem = line.nextDouble();
                    SinhVien x = new SinhVien(ten, dc, ns, gt, ma, mail, diem);
                    a.add(x);//System.out.println(a[0][ma]);
                }
            } else {
                System.out.println("Khong ton tai file");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void xuatDS(String noiDung) {
        System.out.println(noiDung);
        for (SinhVien x : a)
            System.out.println(x);
    }

    public String diemMax() {
        SinhVien x = null;
        int i = 0;
        for (i = 0; i < a.size(); i++)
            if (a.get(i) instanceof SinhVien) {
                x = (SinhVien) a.get(i);
                break;
            }
        for (i = i + 1; i < a.size(); i++) {
            if (a.get(i) instanceof SinhVien) 
                if (x.getDiemTB() < ((SinhVien) a.get(i)).getDiemTB()) 
                    x = ((SinhVien) a.get(i));
        }
        return x.getTen() + " = " + x.getDiemTB();
    }

    public void loaiSVKem() {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) instanceof SinhVien) 
                if (((SinhVien) a.get(i)).getDiemTB() < 3) 
                    a.remove(((SinhVien) a.get(i)));
        }
        xuatDS("d. Loai cac sinh vien co hoc luc kem: ");
    }

    public double DTBChung() {
        double s = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) instanceof SinhVien)
                s = s + ((SinhVien) a.get(i)).getDiemTB();
        }
        return s / a.size();
    }

    public void hocBong() {
        int dem = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) instanceof SinhVien)
                if (((SinhVien) a.get(i)).getDiemTB() > 8)
                    dem++;
                //else  a.remove(((SinhVien)a.get(i)));     
        }
        System.out.println("f. Co " + dem + " sinh vien nhan hoc bong");
    }
    public void sapXep() {
        for (int i = 0; i < a.size() - 1; i++) 
            for (int j = i + 1; j < a.size(); j++) 
                if (a.get(i) instanceof SinhVien)
                    if (((SinhVien) a.get(i)).getDiemTB() < ((SinhVien) a.get(j)).getDiemTB()) {
                        SinhVien t = (SinhVien) a.get(i);
                        a.set(i, a.get(j));
                        a.set(j, t);
                    }
        xuatDS("g. Sap xep cac sinh vien giam dan theo diem:");
    }

    public void viThu() {
        for (int i = 0; i < a.size(); i++) {
            int dem = 0;
            for (int j = 0; j < a.size(); j++) {
                if (a.get(i) instanceof SinhVien)
                    if (i != j)
                        if (((SinhVien) a.get(i)).getDiemTB() < ((SinhVien) a.get(j)).getDiemTB())
                            dem++;
            }
            System.out.println(((SinhVien) a.get(i)).getTen() + " " + ": Vi thu " + (dem + 1));
        }
    }

    public void output() {
        xuatDS("DSSV vua doc tu file ");
        System.out.println("c. Sinh vien co diem lon nhat: " + diemMax());
        loaiSVKem();
        System.out.println("e. Diem TBC:" + DTBChung());
        hocBong();
        sapXep();
        System.out.println("h. Vi thu cac sinh vien");
        viThu();
    }
    public static void main(String[] args) {
        DanhSachSinhVien a = new DanhSachSinhVien();
        a.docFile("C:\\Users\\phapn\\Downloads\\Lập Trình Hướng Đối Tượng\\Lập Trình Hướng Đối Tượng TXT\\SV1.txt");
        a.output();
    }
}
