/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2_thietbidientu_nguyenhongphap;

/**
 *
 * @author PHAP
 */
public class TiVi extends HoaDon implements IHoaDon{

    public TiVi() {
    }

    public TiVi(String maHoaDon, String maThietBi, String hangSanXuat, String model, String loai, String doPhanGiai, int namSanXuat, double kichThuoc, double donGia, double soLuong) {
        super(maHoaDon, maThietBi, hangSanXuat, model, loai, doPhanGiai, namSanXuat, kichThuoc, donGia, soLuong);
    }

    @Override
    public double tinhThanhTien() {
        if (soLuong>=3) 
            return soLuong*donGia*0.25;
        return donGia*soLuong;
    }

    @Override
    public String toString() {
        return "TiVi{" +super.toString()+ '}'+tinhThanhTien();
    }
    public static void main(String[] args) {
        TiVi a= new TiVi("4523", "T74", "Samsung", "FHHJB342", "Smart", "FHD", 1990, 75, 3000, 15);
        System.out.println(a);
    }
}
