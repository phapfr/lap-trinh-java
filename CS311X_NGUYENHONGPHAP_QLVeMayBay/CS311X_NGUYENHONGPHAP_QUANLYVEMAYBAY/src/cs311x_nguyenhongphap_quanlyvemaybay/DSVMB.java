/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs311x_nguyenhongphap_quanlyvemaybay;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class DSVMB {
    private ArrayList<VeMayBay> a = new ArrayList<VeMayBay>();
    public ArrayList<VeMayBay> getA() {
        return a;
    }

    public void setA(ArrayList<VeMayBay> a) {
        this.a = a;
    }
    
    public void docFile(String tenFile){
        try {
            File f= new File(tenFile);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String ma, ngay, dd;
                    double soluong,dongia;
                    ma=line.next();
                    ngay=line.next();
                    ngay=ngay.trim();
                    dongia=line.nextDouble();
                    soluong=line.nextDouble();
                    dd=line.nextLine().trim();
                    if(dd.equalsIgnoreCase("A")||dd.equalsIgnoreCase("My"))
                        a.add(new XuatNgoai(dd, ma, ngay, dongia, soluong));
                    else
                        a.add(new NoiDia(dd, ma, ngay, dongia, soluong));
                }
            }else System.out.println("File ko ton tai");
        } catch (Exception e) {
        }
    }
    public void xuat(String nd){
        System.out.println(nd);
        for (VeMayBay x : a) {
            System.out.println(x);
        }
    }
    public void ghiFile(String tenFile){
        try {
            File f= new File(tenFile);
            if (!f.exists()) {
                PrintStream out = new PrintStream(f);
                    for (VeMayBay x : a)
                        if (x instanceof NoiDia)
                            out.println(x.getMaSanBay()+" "+x.getNgayBay()+" "+x.getDonGia()+" "+x.getSoLuong()+" "+((NoiDia) x).getTinh());
                        else 
                            out.println(x.getMaSanBay()+" "+x.getNgayBay()+" "+x.getDonGia()+" "+x.getSoLuong()+" "+((XuatNgoai) x).getChauLuc());
                    out.close();
            } else System.out.println("File da ton tai");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
   
    public boolean themMoi(VeMayBay y){
        for(VeMayBay x: a)
            if(x.getMaSanBay().equalsIgnoreCase(y.getMaSanBay()))
                return false; //ko them dc
        a.add(y);
        return true;
    }
    public boolean xoaTheoMa(String ma){
        for(VeMayBay x: a)
            if(x.getMaSanBay().equalsIgnoreCase(ma)){
                a.remove(x);
                return true; // xoa dc
            }
        return false;
    }
    public VeMayBay timTheoMa(String ma){
        for(VeMayBay x: a)
            if(x.getMaSanBay().equalsIgnoreCase(ma))
                return x;
        return null;
    }
    public ArrayList<VeMayBay> layDSVMB(){
        return a;
    }
    public double TongTienVeNoiDia(){
        double s=0;
        for(VeMayBay x: a)
            if(x instanceof NoiDia)
                s=s+((NoiDia)x).tinhThanhTien();
        return s;
    }
    public double TongTienVeXuatNgoai(){
        double s=0;
        for(VeMayBay x: a)
            if(x instanceof XuatNgoai)
                s=s+((XuatNgoai)x).tinhThanhTien();
        return s;
    }
    public void output(){
        xuat("");
        Scanner kb =new Scanner(System.in);
        System.out.print("Nhap ma can xoa:");
        String maxoa=kb.nextLine();
        xoaTheoMa(maxoa);
        xuat("DSHD sau khi xoa:");
        System.out.print("Nhap ma can tim:");
        String matim=kb.nextLine();
        System.out.println("Ma da tim:\n"+timTheoMa(matim));
        System.out.println("");
        System.out.println("Danh sach ve may bay"+layDSVMB());
        System.out.println("Tong tien ve noi dia ="+TongTienVeNoiDia());
        System.out.println("Tong tien ve xuat ngoai ="+TongTienVeXuatNgoai());
    }
    public static void main(String[] args) {
        DSVMB a= new DSVMB();
        a.docFile("vemaybay.txt");
        a.output();
    }
}
