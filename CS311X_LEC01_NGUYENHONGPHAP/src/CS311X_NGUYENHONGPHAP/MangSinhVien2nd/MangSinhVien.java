/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.MangSinhVien2nd;

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
            if (f.exists()) {
                Scanner read=new Scanner(f);
                while (read.hasNext()) {
                    Scanner line=new Scanner(read.nextLine());
                    String ma, ht="", ns, qq="";
                    boolean gt;
                    double diem;
                    ma=line.next();
                    while (!line.hasNextBoolean())
                        ht=ht+line.next()+" ";
                    ht=ht.trim();
                    gt=line.nextBoolean();
                    ns=line.next();
                    while (!line.hasNextDouble())
                        qq=qq+line.next()+" ";
                    qq=qq.trim();
                    diem=line.nextDouble();
                    SinhVien x=new SinhVien(ma,ht,ns,qq,gt,diem);
                    a.add(x);
                }
            }else System.out.println("File ko ton tai");
        } catch (Exception e) {
        }
    }
    public void xuat(String nd){
        System.out.println(nd);
        for (SinhVien x : a) 
            System.out.println(x);
    }
    public double TBC(){
        double s=0;
        for (SinhVien x : a)
            s=s+x.getDiem();
        return s/a.size();
    }
    public double TBCgt(boolean gt){
        double s=0,d=0;
        for (SinhVien x : a)
            if (x.isGioiTinh()==gt) {
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
    public void sapXep() {
        for (int i = 0; i < a.size() - 1; i++) 
            for (int j = i + 1; j < a.size(); j++)
                if(a.get(i).getDiem()<a.get(j).getDiem()){
                    SinhVien x = a.get(i);
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
            System.out.println(a.get(i)+" Vi thu "+(dem+1));
        }
    }
    public void output(){
        xuat("DSSV vua doc tu file");
        System.out.println("Trung binh chung = "+TBC());
        System.out.println("TBC nam="+TBCgt(true));
        System.out.println("TBC nu="+TBCgt(false));
        congDiem("Nghe An");
        xuat("DSSV sau khi cong diem:");
        double diem=TBC();
        System.out.println("Diem tbc = "+diem);
        loai(diem);
        xuat("DSSV sau loai ");
        sapXep();
        xuat("DSSV giam dan theo diem");
        xacDinhViThu();
    }
    public static void main(String[] args) {
        MangSinhVien a=new MangSinhVien();
        a.docFile("C:\\Users\\phapn\\Downloads\\Lập Trình Hướng Đối Tượng\\Lập Trình Hướng Đối Tượng TXT\\sv.txt");
        a.output();
    }
}
