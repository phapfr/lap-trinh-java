/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2_thietbidientu_nguyenhongphap;

/**
 *
 * @author PHAP
 */
public class LapTop extends HoaDon implements IHoaDon{
    private String chipXuLy;
    private double ram, dungLuongOCung;

    public LapTop() {
    }

    public LapTop(String chipXuLy, double ram, double dungLuongOCung, String maHoaDon, String maThietBi, String hangSanXuat, String model, String loai, String doPhanGiai, int namSanXuat, double kichThuoc, double donGia, double soLuong) {
        super(maHoaDon, maThietBi, hangSanXuat, model, loai, doPhanGiai, namSanXuat, kichThuoc, donGia, soLuong);
        this.chipXuLy = chipXuLy;
        this.ram = ram;
        this.dungLuongOCung = dungLuongOCung;
    }

    public String getChipXuLy() {
        return chipXuLy;
    }

    public void setChipXuLy(String chipXuLy) {
        this.chipXuLy = chipXuLy;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public double getDungLuongOCung() {
        return dungLuongOCung;
    }

    public void setDungLuongOCung(double dungLuongOCung) {
        this.dungLuongOCung = dungLuongOCung;
    }

    @Override
    public String toString() {
        return "LapTop{" +super.toString()+ "chipXuLy=" + chipXuLy + ", ram=" + ram + ", dungLuongOCung=" + dungLuongOCung + '}'+tinhThanhTien();
    }
    
    @Override
    public double tinhThanhTien() {
        if(soLuong>=3)
            return soLuong*donGia*0.35;
        return donGia*soLuong;
    }
    public static void main(String[] args) {
        LapTop a = new LapTop("i7", 8, 512, "4547", "FYN543", "Apple", "HUB", "SSD", "8K", 1999, 14, 4000, 35);
        System.out.println(a);
    }
}
