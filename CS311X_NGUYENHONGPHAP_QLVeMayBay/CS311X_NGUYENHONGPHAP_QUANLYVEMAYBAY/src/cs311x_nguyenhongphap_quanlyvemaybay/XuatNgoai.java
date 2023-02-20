/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs311x_nguyenhongphap_quanlyvemaybay;

/**
 *
 * @author PHAP
 */
public class XuatNgoai extends VeMayBay implements IVeMayBay{
    private String chauLuc;

    public XuatNgoai() {
    }

    public XuatNgoai(String chauLuc, String maSanBay, String ngayBay, double donGia, double soLuong) {
        super(maSanBay, ngayBay, donGia, soLuong);
        this.chauLuc = chauLuc;
    }

    public String getChauLuc() {
        return chauLuc;
    }

    public void setChauLuc(String chauLuc) {
        this.chauLuc = chauLuc;
    }
    
    @Override
    public double tinhThanhTien() {
        if(chauLuc.equalsIgnoreCase("A"))
            return donGia*soLuong*1.2;
        return donGia*soLuong*1.6;
    }

    @Override
    public String toString() {
        return "XuatNgoai{" +super.toString()+ " chauLuc=" + chauLuc + '}'+tinhThanhTien();
    }
    public static void main(String[] args) {
        XuatNgoai a= new XuatNgoai("Chau My", "UTJ", "3/2/445", 850,55);
        System.out.println(a);
    }
    
    
}
