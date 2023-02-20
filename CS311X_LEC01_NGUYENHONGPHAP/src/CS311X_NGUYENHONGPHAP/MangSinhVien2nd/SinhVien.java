/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.MangSinhVien2nd;

/**
 *
 * @author PHAP
 */
public class SinhVien {
    private String maSV, hoTen, ngaySinh, queQuan;
    private boolean gioiTinh;
    private double diem;
    public SinhVien() {
    }
    public SinhVien(String maSV, String hoTen, String ngaySinh, String queQuan, boolean gioiTinh, double diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.diem = diem;
    }
    public String getMaSV() {
        return maSV;
    }
    public void setMaSV(String maSV) {
        this.maSV = maSV;
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
    @Override
    public String toString() {
        return maSV + " " + hoTen + " " + ngaySinh + " " + queQuan + " " + (gioiTinh?"Nam":"Nu") + " " + diem +" " + xepLoai();
    }
    public String xepLoai(){
        if(diem<3.5) return "Kem";
        if(diem<5) return "Yeu";
        if(diem<6.5) return "Trung binh";
        if(diem<8) return "Kha";
        if(diem<9) return "Gioi";
        return "Xuat sac";
    }
    public static void main(String[] args) {
        SinhVien a=new SinhVien("001","Phap","1/1/2121","Da Nang",true,9.2);
        System.out.println(a);
    }
}
    
