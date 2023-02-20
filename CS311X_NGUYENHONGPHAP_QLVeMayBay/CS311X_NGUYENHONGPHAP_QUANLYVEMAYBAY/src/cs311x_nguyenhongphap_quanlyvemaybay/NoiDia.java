/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs311x_nguyenhongphap_quanlyvemaybay;

/**
 *
 * @author PHAP
 */
public class NoiDia extends VeMayBay implements IVeMayBay{
    private String tinh;

    public NoiDia() {
    }

    public NoiDia(String tinh, String maSanBay, String ngayBay, double donGia, double soLuong) {
        super(maSanBay, ngayBay, donGia, soLuong);
        this.tinh = tinh;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    @Override
    public double tinhThanhTien() {
        return donGia*soLuong;
    }
    
    @Override
    public String toString() {
        return "NoiDia{" +super.toString()+ " tinh=" + tinh + '}'+tinhThanhTien();
    }
    public static void main(String[] args) {
        NoiDia a=new NoiDia("HCM", "GHJ", "1/2/343", 500, 65);
        System.out.println(a);
    }
}
