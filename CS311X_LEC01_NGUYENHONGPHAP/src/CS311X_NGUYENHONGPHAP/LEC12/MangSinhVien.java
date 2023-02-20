/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC12;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class MangSinhVien {
    private ArrayList<SinhVien> a=new ArrayList<SinhVien>();
    public void docFile(String tenFile){
        try {
            File f=new File(tenFile);
            if(f.exists()){
                Scanner read=new Scanner(f);
                while (read.hasNext()) {
                    Scanner line=new Scanner(read.nextLine());
                    String ma, ht, ns, qq;
                    boolean gt;
                    double diem;
                    ma=line.next();
                    ht="";
                    while(!line.hasNextBoolean())
                        ht=ht+line.next()+" ";
                    gt=line.nextBoolean();
                    ns=line.next();
                    qq="";
                    while(!line.hasNextDouble())
                        qq=qq+line.next();
                    diem=line.nextDouble();
                    SinhVien x=new SinhVien(ma, ht, ns, qq, gt, diem);
                    a.add(x);
                }
            }else System.out.println("Khong doc duoc file");
        } catch (Exception e) {
        }
    }
    public void xuat(String noiDung){
        System.out.println(noiDung);
        for(SinhVien x:a)
            System.out.println(x);
    }
    public double trungBinhChung(){
        double s=0;
        for(SinhVien x:a)
            s=s+x.getDiem();
        return s/a.size();
    }
    public double trungBinhChungGioiTinh(boolean gt){
        double s=0, d=0;
        for(SinhVien x:a)
            if(x.isGioiTinh()==gt){
                s=s+x.getDiem();
                d++;
            }
        if(d==0) return 0;
        else return s/d;
    }
    public void congDiem(String que){
        for(SinhVien x:a)
            if(x.getQueQuan().equalsIgnoreCase(que))
                x.setDiem(x.getDiem()+0.5);
    }
    public void loai(double can){
        int i=0;
        while(i<a.size())
            if(a.get(i).getDiem()<can)
                a.remove(i);
            else i++;
    }
    public void sapXep(){
        for(int i=0; i<a.size()-1; i++)
            for(int j=i+1; j<a.size(); j++)
                if(a.get(i).getDiem()<a.get(j).getDiem()){
                    SinhVien x=a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, x);
                }
    }
    public void xacDinhViThu(){
        System.out.println("");
        for (int i = 0; i < a.size(); i++) {
            int dem=0;
            for (int j = 0; j < a.size(); j++)
                if(a.get(j).getDiem()>a.get(i).getDiem())
                    dem++;
            System.out.println(a.get(i)+" Vi Thu "+(dem+1));
        }
    }
    public void output(){
        /*xuat("DSSV vua doc tu file");
        System.out.println("b. Diem TBC = "+trungBinhChung());
        System.out.println("c. Diem TBC Nam = "+trungBinhChungGioiTinh(true));
        System.out.println("Diem TBC Nu = "+trungBinhChungGioiTinh(false));
        congDiem("NgheAn");
        xuat("d. DSSV sau cong diem:");
        double diem=trungBinhChung();
        System.out.println("Diem TBC Chung = "+diem);
        loai(diem);
        xuat("e. DSSV sau loai: ");*/
        sapXep();
        xuat("f. DSSV giam dan theo diem: ");
        System.out.print("g. Vi thu cua moi sinh vien: ");
        xacDinhViThu();
    }
    public static void main(String[] args) {
        MangSinhVien a=new MangSinhVien();
        a.docFile("C:\\Users\\phapn\\Downloads\\Lập Trình Hướng Đối Tượng\\Lập Trình Hướng Đối Tượng TXT\\SV.txt");
        a.output();
    }
}
