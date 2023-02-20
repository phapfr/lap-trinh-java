/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs311x_quanlybatdongsan_nguyenhongphap;

/**
 *
 * @author PHAP
 */
public class GiaoDichNha extends GiaoDich{
    private String loaiNha;
    public GiaoDichNha() {
    }
    public GiaoDichNha(String loaiNha, String maGD, String ngayGD, double donGia, double dienTich) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiNha = loaiNha;
    }
    public String getLoaiNha() {
        return loaiNha;
    }
    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }
    @Override
    public double tinhThanhTien() {
        if (loaiNha.equalsIgnoreCase("TK")) 
            return dienTich*donGia*0.9;
        return dienTich*donGia;
    }
    @Override
    public String toString() {
        return "GiaoDichNha{" +super.toString()+ "loaiNha=" + loaiNha + '}'+tinhThanhTien();
    }
}
