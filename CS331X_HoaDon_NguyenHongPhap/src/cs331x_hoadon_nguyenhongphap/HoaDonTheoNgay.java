/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs331x_hoadon_nguyenhongphap;

/**
 *
 * @author PHAP
 */
public class HoaDonTheoNgay extends HoaDon{
    private int soNgayThue;
    public HoaDonTheoNgay() {
    }
    public HoaDonTheoNgay(int soNgayThue, String maHD, String tenKhach, String ngayHD, double donGia) {
        super(maHD, tenKhach, ngayHD, donGia);
        this.soNgayThue = soNgayThue;
    }
    public int getSoNgayThue() {
        return soNgayThue;
    }
    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }    
    @Override
    public double tinhThanhTien() {
        if (soNgayThue>7)
            return soNgayThue*(donGia*0.2);
        return donGia*soNgayThue;
    }
    @Override
    public String toString() {
        return "HoaDonTheoNgay{" +super.toString()+ " soNgayThue=" + soNgayThue + '}';
    }
//    public static void main(String[] args) {
////        HoaDonTheoNgay a= new HoaDonTheoNgay(7, "42", "Phap", "2/3/54", 40000);
////        System.out.println(a);
//    }
}
