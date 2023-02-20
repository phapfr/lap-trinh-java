/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs331x_hoadon_nguyenhongphap;

/**
 *
 * @author PHAP
 */
public class HoaDonTheoGio extends HoaDon {
    private int soGioThue;
    public HoaDonTheoGio() {
    }
    public HoaDonTheoGio(int soGioThue, String maHD, String tenKhach, String ngayHD, double donGia) {
        super(maHD, tenKhach, ngayHD, donGia);
        this.soGioThue = soGioThue;
    }
    public int getSoGioThue() {
        return soGioThue;
    }
    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }
    @Override
    public double tinhThanhTien() {
        return soGioThue*donGia;
    }
    @Override
    public String toString() {
        return "HoaDonTheoGio{" +super.toString()+ " soGioThue=" + soGioThue + '}';
    }
//    public static void main(String[] args) {
////        HoaDonTheoGio a= new HoaDonTheoGio(3, "34", "Phap", "2/5/654", 5000);
////        System.out.println(a);
//    }
}
