/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC11;

/**
 *
 * @author PHAP
 */
public class HinhTron {
    private DiemOxy tam;
    private double banKinh;
    public HinhTron() {
    }
    public HinhTron(DiemOxy tam, double banKinh) {
        this.tam = tam;
        this.banKinh = banKinh;
    }
    public DiemOxy getTam() {
        return tam;
    }
    public void setTam(DiemOxy tam) {
        this.tam = tam;
    }
    public double getBanKinh() {
        return banKinh;
    }
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    @Override
    public String toString() {
        return "tam=" + tam + ", banKinh=" + banKinh+" P= "+chuvi()+" S= "+dientich();
    }
    double chuvi(){
        return 2*banKinh*Math.PI;
    }
    double dientich(){
        return banKinh*banKinh*Math.PI;
    }
    public static void main(String[] args) {
        HinhTron a = new HinhTron();
        System.out.println(a);
    }
}