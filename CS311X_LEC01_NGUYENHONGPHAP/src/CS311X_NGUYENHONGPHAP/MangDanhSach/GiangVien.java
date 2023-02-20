/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.MangDanhSach;

/**
 *
 * @author PHAP
 */
public class GiangVien extends Nguoi{
    private  String monDay;
    private  double soGio,donGia;
    public GiangVien() {
    }
    public GiangVien(String monDay, double soGio, double donGia, String ma, String hoTen, String ngaySinh, boolean gioiTinh) {
        super(ma, hoTen, ngaySinh, gioiTinh);
        this.monDay = monDay;
        this.soGio = soGio;
        this.donGia = donGia;
    }
    public String getMonHoc() {
        return monDay;
    }
    public void setMonHoc(String monDay) {
        this.monDay = monDay;
    }
    public double getSoGio() {
        return soGio;
    }
    public void setSoGio(double soGio) {
        this.soGio = soGio;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    @Override
    public String toString() {
        return "GiangVien{" + super.toString() + monDay + " " + soGio + " " + donGia + '}'+tinhThanhTien();
    }
    public double tinhThanhTien(){
       return soGio*donGia;
    }
    public static void main(String[] args) {
        GiangVien a=new GiangVien("Toan roi rac",45,150,"002","Phap","1/2/2001",true);
        System.out.println(a);
    }
}
