/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs311x_hanghoa_ab_nguyenhongphap;

/**
 *
 * @author PHAP
 */
public class HangThuCong extends HangHoa{
    private String nhaSanXuat;
    public HangThuCong() {
    }
    public HangThuCong(String nhaSanXuat, String maHang, String ngayNhap, double donGia, double soLuong) {
        super(maHang, ngayNhap, donGia, soLuong);
        this.nhaSanXuat = nhaSanXuat;
    }
    public String getNhaSanXuat() {
        return nhaSanXuat;
    }
    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
    @Override
    public double tinhThanhTien() {
        return donGia*soLuong;
    }
    @Override
    public String toString() {
        return "HangThuCong{" +super.toString()+ "nhaSanXuat=" + nhaSanXuat + '}';
    }
}
