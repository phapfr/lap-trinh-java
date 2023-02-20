/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thietbidientu_nguyenhongphap;

/**
 *
 * @author PHAP
 */
public abstract class ThietBiDT {
    protected String maSanPham, thuongHieu;
    protected double soLuong, donGia;

    public ThietBiDT() {
    }

    public ThietBiDT(String maSanPham, String thuongHieu, double soLuong, double donGia) {
        this.maSanPham = maSanPham;
        this.thuongHieu = thuongHieu;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return maSanPham + ", thuongHieu=" + thuongHieu + ", soLuong=" + soLuong + ", donGia=" + donGia;
    }
    
}
