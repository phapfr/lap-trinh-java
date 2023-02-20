/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thietbidientu_nguyenhongphap;

/**
 *
 * @author PHAP
 */
public class MayTinh extends ThietBiDT implements IThietBiDT{
    private String chip, ram;

    public MayTinh() {
    }

    public MayTinh(String chip, String ram, String maSanPham, String thuongHieu, double soLuong, double donGia) {
        super(maSanPham, thuongHieu, soLuong, donGia);
        this.chip = chip;
        this.ram = ram;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "MayTinh{" +super.toString()+ "chip=" + chip + ", ram=" + ram + '}'+chietKhau();
    }

    @Override
    public double chietKhau() {
        if (soLuong>=100) {
            return soLuong*donGia*0.1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        MayTinh a= new MayTinh("Intel", "Corsair", "3242", "LG", 100, 70);
        System.out.println(a);
    }
}
