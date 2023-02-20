/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.MangHinh;

/**
 *
 * @author PHAP
 */
public class HinhVuong {
    protected double canh;
    public HinhVuong() {
    }
    public HinhVuong(double canh) {
        this.canh = canh;
    }
    public double getCanh() {
        return canh;
    }
    public void setCanh(double canh) {
        this.canh = canh;
    }
    @Override
    public String toString() {
        return "HinhVuong{" + "canh=" + canh + "} P="+chuVi()+" S="+dienTich();
    }
    public double chuVi(){
        return canh*4;
    }
    public double dienTich(){
        return canh*canh;
    }
    public static void main(String[] args) {
        HinhVuong a=new HinhVuong(2);
        System.out.println(a);
    }
}
