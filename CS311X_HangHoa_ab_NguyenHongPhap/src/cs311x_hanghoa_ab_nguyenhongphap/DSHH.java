/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs311x_hanghoa_ab_nguyenhongphap;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class DSHH {
    private ArrayList<HangHoa> a = new ArrayList<HangHoa>();
    public void docFile(String tenFile){
        try {
            File f= new File(tenFile);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String ma, ngay, nsx;
                    double soluong,dongia;
                    ma=line.next();
                    ngay=line.next();
                    ngay=ngay.trim();
                    dongia=line.nextDouble();
                    soluong=line.nextDouble();
                    nsx=line.nextLine().trim();
                    if(nsx.equalsIgnoreCase("TN")||nsx.equalsIgnoreCase("NK"))
                        a.add(new HangDienMay(nsx, ma, ngay, dongia, soluong));
                    else a.add(new HangThuCong(nsx, ma, ngay, dongia, soluong));
                }
            }else System.out.println("File ko ton tai");
        } catch (Exception e) {
        }
    }
    public void xuat(String nd){
        System.out.println(nd);
        for (HangHoa x : a)
            System.out.println(x);
    }
    public void ghiFile(String tenFile){
        try {
            File f= new File(tenFile);
            if (!f.exists()) {
                PrintStream out = new PrintStream(f);
                    for (HangHoa x : a)
                        if (x instanceof HangDienMay)
                            out.println(x.getMaHang()+" "+x.getNgayNhap()+" "+x.getDonGia()+" "+x.getSoLuong()+" "+((HangDienMay) x).getNoiSanXuat());
                        else 
                            out.println(x.getMaHang()+" "+x.getNgayNhap()+" "+x.getDonGia()+" "+x.getSoLuong()+" "+((HangThuCong) x).getNhaSanXuat());
                    out.close();
            } else System.out.println("File da ton tai");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
   
    public boolean themMoi(HangHoa y){
        for(HangHoa x: a)
            if(x.getMaHang().equalsIgnoreCase(y.getMaHang()))
                return false; //ko them dc
        a.add(y);
        return true;
    }
    public boolean xoaTheoMa(String ma){
        for(HangHoa x: a)
            if(x.getMaHang().equalsIgnoreCase(ma)){
                a.remove(x);
                return true; // xoa dc
            }
        return false;
    }
    public HangHoa timTheoMa(String ma){
        for(HangHoa x: a)
            if(x.getMaHang().equalsIgnoreCase(ma))
                return x;
        return null;
    }
    public ArrayList<HangHoa> layDSHH(){
        return a;
    }
    public double tongTienHangDienMay(){
        double s=0;
        for(HangHoa x: a)
            if(x instanceof HangDienMay)
                s=s+((HangDienMay)x).tinhThanhTien();
        return s;
    }
    public double tongTienHangThuCong(){
        double s=0;
        for(HangHoa x: a)
            if(x instanceof HangThuCong)
                s=s+((HangThuCong)x).tinhThanhTien();
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
        System.out.println("Danh sach hang hoa"+layDSHH());
        System.out.println("Tong tien hang dien may ="+tongTienHangDienMay());
        System.out.println("Tong tien hang thu cong ="+tongTienHangThuCong());
    }
    public static void main(String[] args) {
        DSHH a= new DSHH();
        a.docFile("HANGHOA.txt");
        //a.ghiFile("");
        a.output();
    }
}
