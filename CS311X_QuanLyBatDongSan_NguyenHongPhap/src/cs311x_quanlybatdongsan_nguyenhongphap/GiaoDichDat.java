/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs311x_quanlybatdongsan_nguyenhongphap;

/**
 *
 * @author PHAP
 */
public class GiaoDichDat extends GiaoDich{
    private String loaiDat;
    public GiaoDichDat() {
    }
    public GiaoDichDat(String loaiDat, String maGD, String ngayGD, double donGia, double dienTich) {
        super(maGD, ngayGD, donGia, dienTich);
        this.loaiDat = loaiDat;
    }
    public String getLoaiDat() {
        return loaiDat;
    }
    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    @Override
    public String toString() {
        return "GiaoDichDat{" +super.toString()+ "loaiDat=" + loaiDat + '}'+tinhThanhTien();
    }
    @Override
    public double tinhThanhTien() {
        if (loaiDat.equalsIgnoreCase("A"))
            return dienTich*donGia*1.5;
        return dienTich*donGia;
    }
    
}
