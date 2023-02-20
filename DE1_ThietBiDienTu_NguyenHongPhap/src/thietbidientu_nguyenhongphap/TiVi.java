/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thietbidientu_nguyenhongphap;

/**
 *
 * @author PHAP
 */
public class TiVi extends ThietBiDT implements IThietBiDT{
    private String mau;
    private double kichThuoc;
    private int namSX;

    public TiVi() {
    }

    public TiVi(String mau, double kichThuoc, int namSX, String maSanPham, String thuongHieu, double soLuong, double donGia) {
        super(maSanPham, thuongHieu, soLuong, donGia);
        this.mau = mau;
        this.kichThuoc = kichThuoc;
        this.namSX = namSX;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public double getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(double kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }
    
    @Override
    public double chietKhau() {
        if (soLuong>=150)
            return soLuong*donGia*0.2;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "TiVi{" +super.toString()+ "mau=" + mau + ", kichThuoc=" + kichThuoc + ", namSX=" + namSX + '}'+chietKhau();
    }
    public static void main(String[] args) {
        TiVi a= new TiVi("Den", 49, 1995, "342", "Samsung", 80, 32);
        System.out.println(a);
    }
    
}
