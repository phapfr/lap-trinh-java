/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs311x_hanghoa_im.hanghoa_nguyenhongphap;

/**
 *
 * @author PHAP
 */
public class HangDienMay extends HangHoa{
    private String noiSanXuat;
    public HangDienMay() {
    }
    public HangDienMay(String noiSanXuat, String maHang, String ngayNhap, double donGia, double soLuong) {
        super(maHang, ngayNhap, donGia, soLuong);
        this.noiSanXuat = noiSanXuat;
    }
    public String getNoiSanXuat() {
        return noiSanXuat;
    }
    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }
    @Override
    public double tinhThanhTien() {
        if (noiSanXuat.equalsIgnoreCase("TN"))
            return donGia*soLuong;
        else return soLuong*donGia*1.2;
    }
    @Override
    public String toString() {
        return "HangDienMay{" +super.toString()+ "noiSanXuat=" + noiSanXuat + '}'+tinhThanhTien();
    }
    
}
