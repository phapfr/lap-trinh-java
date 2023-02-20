/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs331x_hoadon_nguyenhongphap;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class DSHD {
    private ArrayList<HoaDon> a = new ArrayList<HoaDon>();
    public void docFile(String tenFile){
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String ma, ht="", ngay;
                    int snt,sgt;
                    double dongia;
                    ma=line.next();
                    HoaDon x;
                    while (!line.hasNextInt())
                        ht=ht+line.next()+" ";                   
                    if (ma.charAt(0)=='N') {
                        snt=line.nextInt();
                        ngay=line.next();
                        dongia=line.nextDouble();
                        x= new HoaDonTheoNgay(snt, ma, ht, ngay, dongia);
                    }
                    else{
                        sgt=line.nextInt();
                        ngay=line.next();
                        dongia=line.nextDouble();
                        x= new HoaDonTheoGio(sgt, ma, ht, ngay, dongia);
                    }
                    a.add(x);
                }
            }else System.out.println("File ko ton tai");
        } catch (Exception e) {
        }
    }
    public void xuat(String noiDung){
        System.out.println(noiDung);
        for (HoaDon x : a)
            System.out.println(x);
    }
    public void ghiFile(String tenFile){
        try {
            File f= new File(tenFile);
            if (!f.exists()) {
                PrintStream out = new PrintStream(f);
                    for (HoaDon x : a)
                        if (x instanceof HoaDonTheoGio)
                            out.println(x.getMaHD()+" "+x.getTenKhach()+" "+((HoaDonTheoGio) x).getSoGioThue()+" "+x.getNgayHD()+" "+x.getDonGia());
                        else 
                            out.println(x.getMaHD()+" "+x.getTenKhach()+" "+((HoaDonTheoNgay) x).getSoNgayThue()+" "+x.getNgayHD()+" "+x.getDonGia());
                    out.close();
            } else System.out.println("File da ton tai");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public boolean themMoi(HoaDon y){
        for(HoaDon x: a)
            if(x.getMaHD().equalsIgnoreCase(y.getMaHD()))
                return false; //ko them dc
        a.add(y);
        return true;
    }
    public ArrayList<HoaDon> layDSHH(){
        return a;
    }
    public boolean xoaTheoMa(String ma){
        for(HoaDon x: a)
            if(x.getMaHD().equalsIgnoreCase(ma)){
                a.remove(x);
                return true; // xoa dc
            }
        return false;
    }
    public HoaDon timTheoMa(String ma){
        for(HoaDon x: a)
            if(x.getMaHD().equalsIgnoreCase(ma))
                return x;
        return null;
    }
    public double tongTien(){
        double s=0;
        for(HoaDon x: a)
            s=s+((HoaDon)x).tinhThanhTien();
        return s;
    }
    public void output(){
        xuat("DSHD");
        Scanner kb =new Scanner(System.in);
        System.out.print("Nhap ma can xoa:");
        String maxoa=kb.nextLine();
        xoaTheoMa(maxoa);
        xuat("DSHD sau khi xoa:");
        System.out.print("Nhap ma can tim:");
        String matim=kb.nextLine();
        System.out.println("Ma da tim:\n"+timTheoMa(matim));
        System.out.println("");
        System.out.println("Danh sach hoa don"+layDSHH());
        System.out.println("Tong tien hoa don ="+tongTien());        
    }
    public static void main(String[] args) {
        DSHD a= new DSHD();
        a.docFile("HOADON.txt");
        a.output();
    }
}
