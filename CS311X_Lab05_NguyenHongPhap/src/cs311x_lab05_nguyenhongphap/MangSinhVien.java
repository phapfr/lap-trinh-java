/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs311x_lab05_nguyenhongphap;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class MangSinhVien {
    private ArrayList<SV> a = new ArrayList<SV>();
    public void docFile(String tenFile){
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String ma,ht="";
                    boolean gt;
                    double c1,c2;
                    ma=line.next();
                    while (!line.hasNextBoolean()) 
                        ht=ht+line.next()+" ";
                    gt=line.nextBoolean();
                    c1=line.nextDouble();
                    c2=line.nextDouble();
                    if (line.hasNextDouble()) {
                        double c3=line.nextDouble();
                        CNTT x = new CNTT(c1, c2, c3, ma, ht, gt);
                        a.add(x);
                    }else{
                        KinhTe x = new KinhTe(c1, c2, ma, ht, gt);
                        a.add(x);
                    }
                }
            }else System.out.println("File ko ton tai");
        } catch (Exception e) {
        }
    }
    public void xuat(String nd){
        System.out.println(nd);
        for(SV x: a)
            System.out.println(x);
    }
    public void xuatCNTT(){
        System.out.println("\n2. DSSV CNTT");
        for(SV x: a)
            if(x instanceof CNTT)
                System.out.println(x);
    }
    public void xuatKT(){
        System.out.println("\nDSSV Kinh Te");
        for(SV x: a)
            if(x instanceof KinhTe)
                System.out.println(x);
    }
    public void demSV(){
        double dem=0;
        for(SV x:a){
            if(x instanceof CNTT)
                dem++;
        }
        System.out.println("\n3. So SV CNTT: "+dem);
        System.out.println("So SV Kinh Te: "+(a.size()-dem));
    }
    public double tinhDTBChung(){
        double s=0;
        for(SV x:a){
            s=s+x.tinhDTB();
        }
        return s/a.size();
    }
    public SV maxDiemTrungBinh(){
        SV y=null;
        for(SV x:a){
            if(y==null) y=x;
            else
                if(y.tinhDTB()<x.tinhDTB())
                    y=x;
        }
        return y;
    }
    public void demSVGioi(){
        double dem=0;
        for (SV x : a) {
            if(x.hocLuc()=="Gioi")
                dem++;
        }
        System.out.println("\n6. So SV Gioi: "+dem);
    }
    public void output(){
        xuat("DSSV vua doc tu file");
        xuatCNTT();
        xuatKT();
        demSV();
        System.out.println("\n4. Diem trung binh chung = "+tinhDTBChung());
        System.out.println("\n5. Sinh vien co diem trung binh lon nhat: "+maxDiemTrungBinh());
        demSVGioi();
    }
    public static void main(String[] args) {
        MangSinhVien a= new MangSinhVien();
        a.docFile("CNTT_KT.txt");
        a.output();
    }
}