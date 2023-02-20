/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC16;

/**
 *
 * @author PHAP
 */
public class SinhVien extends Nguoi{
    private String maSV,email;
    private double diemTB;
    public SinhVien(){
        super();        
    }    
    public SinhVien(String maSV, String email, double diemTB) {
        this.maSV = maSV;
        this.email = email;
        this.diemTB = diemTB;
    }    
    public SinhVien(String ten, String diaChi, String ngaySinh, boolean gioiTinh, 
            String maSV, String email, double diemTB ) {
        super(ten, diaChi, ngaySinh, gioiTinh);
        this.maSV = maSV;
        this.email = email;
        this.diemTB = diemTB;
    }
    public String getMaSV() {
        return maSV;
    }
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getDiemTB() {
        return diemTB;
    }
    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }    
    @Override
    public String toString() {
        return maSV+" "+super.toString()+" "+email+" "+diemTB;
    }
    public static void main(String[] args) {        
        SinhVien a=new SinhVien("Phap","Da Nang","1/1/2000",true,"01","123@gmail.com",8.0);
        System.out.println(a);
    }
}
