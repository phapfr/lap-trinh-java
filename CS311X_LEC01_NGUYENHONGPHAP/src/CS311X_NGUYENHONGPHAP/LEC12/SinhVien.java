/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC12;

/**
 *
 * @author PHAP
 */
public class SinhVien {
    private String ma, hoTen, ngaySinh, queQuan;
    private boolean gioiTinh;
    private double diem;
    public SinhVien(){
        ma=hoTen=queQuan="";
        ngaySinh="1/1/2000";
        gioiTinh=false;
        diem=0;
    }
    public SinhVien(String ma, String hoTen, String ngaySinh, String queQuan, boolean gioiTinh, double diem){
        this.ma=ma;
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
        this.queQuan=queQuan;
        this.gioiTinh=gioiTinh;
        this.diem=diem;
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
    public String getQueQuan() {
        return queQuan;
    }
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public boolean isGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public double getDiem() {
        return diem;
    }
    public void setDiem(double diem) {
        this.diem = diem;
    }   
    public String xepLoai(){
        if(diem<3.5) return " Kem ";
        if(diem<5) return " Yeu ";
        if(diem<6.5) return " Trung Binh ";
        if(diem<8) return " Kha ";
        if(diem<9) return " Gioi ";
        return " Xuat Sac ";
    }
    public String toString(){
        return ma+" "+hoTen+" "+ngaySinh+" "+queQuan+" "+(gioiTinh ? " Nam ":" Nu ")+diem+xepLoai();
    }
    public static void main(String[] args) {
        SinhVien a=new SinhVien("001"," Le Van Long","21/3/2002"," Da Nang ",true, 8.9);
        System.out.println(a);
    }
}
