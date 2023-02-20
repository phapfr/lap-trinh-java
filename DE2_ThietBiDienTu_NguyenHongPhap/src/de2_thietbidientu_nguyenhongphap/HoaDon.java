/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2_thietbidientu_nguyenhongphap;

/**
 *
 * @author PHAP
 */
public abstract class HoaDon {
    protected String maHoaDon, maThietBi,hangSanXuat, model, loai, doPhanGiai;
    protected int namSanXuat;
    protected double kichThuoc, donGia, soLuong;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String maThietBi, String hangSanXuat, String model, String loai, String doPhanGiai, int namSanXuat, double kichThuoc, double donGia, double soLuong) {
        this.maHoaDon = maHoaDon;
        this.maThietBi = maThietBi;
        this.hangSanXuat = hangSanXuat;
        this.model = model;
        this.loai = loai;
        this.doPhanGiai = doPhanGiai;
        this.namSanXuat = namSanXuat;
        this.kichThuoc = kichThuoc;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaThietBi() {
        return maThietBi;
    }

    public void setMaThietBi(String maThietBi) {
        this.maThietBi = maThietBi;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getDoPhanGiai() {
        return doPhanGiai;
    }

    public void setDoPhanGiai(String doPhanGiai) {
        this.doPhanGiai = doPhanGiai;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public double getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(double kichThuoc) {
        this.kichThuoc = kichThuoc;
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
        return maHoaDon + ", maThietBi=" + maThietBi + ", hangSanXuat=" + hangSanXuat + ", model=" + model + ", loai=" + loai + ", doPhanGiai=" + doPhanGiai + ", namSanXuat=" + namSanXuat + ", kichThuoc=" + kichThuoc + ", donGia=" + donGia + ", soLuong=" + soLuong + ' ';
    }
    public abstract double tinhThanhTien();
    
}
