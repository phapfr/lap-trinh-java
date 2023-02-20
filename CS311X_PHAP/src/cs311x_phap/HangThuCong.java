/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs311x_phap;

/**
 *
 * @author Administrator
 */
public class HangThuCong extends HangHoa implements IHangHoa{
    private String nhaSX;

    public HangThuCong() {
    }

    public HangThuCong(String nhaSX, String maHang, String ngayNhap, double donGia, double soLuong) {
        super(maHang, ngayNhap, donGia, soLuong);
        this.nhaSX = nhaSX;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
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
    public double tinhThanhTien() {
        return soLuong*donGia;
    }
    
    @Override
    public String toString() {
        return "HangThuCong{" +super.toString()+" "+ "nhaSX=" + nhaSX + '}';
    }
    public static void main(String[] args) {
        HangThuCong a = new HangThuCong("Dien Luc", "54643f", "3/7/234", 30000, 35);
        System.out.println(a);
    }
}
