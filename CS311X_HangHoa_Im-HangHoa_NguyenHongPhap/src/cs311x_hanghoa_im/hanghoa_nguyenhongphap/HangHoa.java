/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs311x_hanghoa_im.hanghoa_nguyenhongphap;

/**
 *
 * @author PHAP
 */
public abstract class HangHoa implements IHangHoa{
    protected String maHang, ngayNhap;
    protected double donGia,soLuong;
    public HangHoa() {
    }
    public HangHoa(String maHang, String ngayNhap, double donGia, double soLuong) {
        this.maHang = maHang;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    public String getMaHang() {
        return maHang;
    }
    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }
    public String getNgayNhap() {
        return ngayNhap;
    }
    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }
    @Override
    public abstract double tinhThanhTien();
    @Override
    public String toString() {
        return maHang + ", ngayNhap=" + ngayNhap + ", donGia=" + donGia + ", soLuong=" + soLuong + '}';
    }
    
}
