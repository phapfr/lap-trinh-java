/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs311x_quanlybatdongsan_nguyenhongphap;

/**
 *
 * @author PHAP
 */
public abstract class GiaoDich implements IGiaoDich{
    protected String maGD, ngayGD;
    protected double donGia, dienTich;
    public GiaoDich() {
    }
    public GiaoDich(String maGD, String ngayGD, double donGia, double dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }
    public String getMaGD() {
        return maGD;
    }
    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }
    public String getNgayGD() {
        return ngayGD;
    }
    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getDienTich() {
        return dienTich;
    }
    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    @Override
    public abstract double tinhThanhTien();
    @Override
    public String toString() {
        return maGD + ", " + ngayGD + ", donGia=" + donGia + ", dienTich=" + dienTich+" ";
    }    
}
