/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC16;
/**
 *
 * @author PHAP
 */
public class Nguoi {
    private String ten,diaChi,ngaySinh;
    private boolean gioiTinh;
    public Nguoi(){
        }
    public Nguoi(String ten, String diaChi, String ngaySinh, boolean gioiTinh) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
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
    public String toString(){
        return ten +" "+diaChi+" "+ngaySinh+" "+(gioiTinh?" Nam ":" Nu ") ;
    }
    public static void main(String[] args) {        
        Nguoi a=new Nguoi("Phap","Da Nang","1/1/2000",true);
        System.out.println(a);
    }
}
