/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.MangHinh;

/**
 *
 * @author PHAP
 */
public class HinhChuNhat extends HinhVuong{
    private double canh2;
    public HinhChuNhat() {
    }
    public HinhChuNhat(double canh2) {
        this.canh2 = canh2;
    }
    public HinhChuNhat(double canh2, double canh) {
        super(canh);
        this.canh2 = canh2;
    }
    public double getCanh2() {
        return canh2;
    }
    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }
    @Override
    public String toString() {
        return "HinhChuNhat{"+"canh1="+getCanh() + " canh2=" + canh2 + "} P="+chuVi()+" S="+dienTich();
    }
    @Override
    public double chuVi(){
        return (canh+canh2)*2;
    }
    @Override
    public double dienTich(){
        return canh*canh2;
    }
    public static void main(String[] args) {
        HinhChuNhat a=new HinhChuNhat(2,3);
        System.out.println(a);
    }
}