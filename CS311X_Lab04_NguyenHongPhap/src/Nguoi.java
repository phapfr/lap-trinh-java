/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PHAP
 */
public class Nguoi {
    private String ma,hoTen, ngaySinh;
    private boolean gioiTinh;

    public Nguoi() {
    }

    public Nguoi(String ma, String hoTen, String ngaySinh, boolean gioiTinh) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + ngaySinh + " " + (gioiTinh?" Nam ":" Nu ");
    }
    public static void main(String[] args) {
        Nguoi a = new Nguoi("001", "Phap", "1/1/234", true);
        System.out.println(a);
    }
    
}
