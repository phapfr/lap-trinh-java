/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs311x_nguyenhongphap_quanlyvemaybay;

/**
 *
 * @author PHAP
 */
public abstract class VeMayBay {
    protected String maSanBay, ngayBay;
    protected double donGia, soLuong;

    public VeMayBay() {
    }

    public VeMayBay(String maSanBay, String ngayBay, double donGia, double soLuong) {
        this.maSanBay = maSanBay;
        this.ngayBay = ngayBay;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaSanBay() {
        return maSanBay;
    }

    public void setMaSanBay(String maSanBay) {
        this.maSanBay = maSanBay;
    }

    public String getNgayBay() {
        return ngayBay;
    }

    public void setNgayBay(String ngayBay) {
        this.ngayBay = ngayBay;
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
    public String toString() {
        return maSanBay + ", " + ngayBay + ", donGia=" + donGia + ", soLuong=" + soLuong;
    }
    
}
