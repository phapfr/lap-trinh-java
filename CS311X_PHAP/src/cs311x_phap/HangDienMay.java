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
public class HangDienMay extends HangHoa implements IHangHoa{
    private String noiSX;

    public HangDienMay() {
    }

    public HangDienMay(String noiSX, String maHang, String ngayNhap, double donGia, double soLuong) {
        super(maHang, ngayNhap, donGia, soLuong);
        this.noiSX = noiSX;
    }

    public String getNoiSX() {
        return noiSX;
    }

    public void setNoiSX(String noiSX) {
        this.noiSX = noiSX;
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
        if(noiSX.equals("TN")) return soLuong*donGia;
       return soLuong*donGia*1.2;
    }

    @Override
    public String toString() {
        return "HangDienMay{" +super.toString()+" " +"noiSX=" + noiSX + '}';
    }
    public static void main(String[] args) {
        HangDienMay a= new HangDienMay("Duy Tan", "3432", "11/2/456", 50000, 40);
        System.out.println(a);
    }
    
}
