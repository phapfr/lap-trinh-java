/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs311x_quanlybatdongsan_nguyenhongphap;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class DSGD {
    private ArrayList<GiaoDich> a = new ArrayList<GiaoDich>();
    public void docFile(String tenFile){
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String ma,ngay, loai;
                    double dg,s;
                    ma=line.next();
                    ngay=line.next();
                    dg=line.nextDouble();
                    s=line.nextDouble();
                    loai=line.next();
                    if (loai.equalsIgnoreCase("TK") || loai.equalsIgnoreCase("MP")) {
                        a.add(new GiaoDichNha(loai, ma, ngay, dg, s));
                    }else
                        a.add(new GiaoDichDat(loai, ma, ngay, dg, s));
                }
            }else System.out.println("File ko ton tai");
        } catch (Exception e) {
        }
    }
    public void xuat(String nd){
        System.out.println(nd);
        for (GiaoDich x : a) {
            System.out.println(x);
        }
    }
    public void ghiFile(String tenFile){
        try {
            File f= new File(tenFile);
            if (!f.exists()) {
                PrintStream out = new PrintStream(f);
                    for (GiaoDich x : a)
                        if (x instanceof GiaoDichDat)
                            out.println(x.getMaGD()+" "+x.getNgayGD()+" "+x.getDonGia()+" "+x.getDienTich()+" "+((GiaoDichDat) x).getLoaiDat());
                        else    
                            out.println(x.getMaGD()+" "+x.getNgayGD()+" "+x.getDonGia()+" "+x.getDienTich()+" "+((GiaoDichNha) x).getLoaiNha());
                    out.close();
            } else System.out.println("File da ton tai");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public boolean themMoi(GiaoDich y){
        for(GiaoDich x: a)
            if(x.getMaGD().equalsIgnoreCase(y.getMaGD()))
                return false; //ko them dc
        a.add(y);
        return true;
    }
    public boolean xoaTheoMa(String ma){
        for(GiaoDich x: a)
            if(x.getMaGD().equalsIgnoreCase(ma)){
                a.remove(x);
                return true; // xoa dc
            }
        return false;
    }
    public GiaoDich timTheoMa(String ma){
        for(GiaoDich x: a)
            if(x.getMaGD().equalsIgnoreCase(ma))
                return x;
        return null;
    }
    public ArrayList<GiaoDich> layDSGD(){
        return a;
    }
    public void output(){ 
        xuat("");
        Scanner kb =new Scanner(System.in);
        System.out.print("Nhap ma can xoa:");
        String maxoa=kb.nextLine();
        xoaTheoMa(maxoa);
        xuat("DSGD sau khi xoa:");
        System.out.print("Nhap ma can tim:");
        String matim=kb.nextLine();
        System.out.println("Ma da tim:\n"+timTheoMa(matim));
        System.out.println("");
        System.out.println("Danh sach giao dich"+layDSGD());
    }
    public static void main(String[] args) {
        DSGD a = new DSGD();
        a.docFile("batdongsan.txt");
        a.output();
    }
}
