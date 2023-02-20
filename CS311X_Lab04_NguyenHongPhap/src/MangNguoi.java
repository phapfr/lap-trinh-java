
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PHAP
 */
public class MangNguoi {
    private ArrayList<Nguoi> a = new ArrayList<Nguoi>();
    public void docFile(String tenFile){
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String ma,ht="",ns;
                    boolean gt;
                    double m1,m2;
                    ma=line.next();
                    while(!line.hasNextBoolean())
                        ht=ht+line.next()+" ";
                    gt=line.nextBoolean();
                    ns=line.next();
                    m1=line.nextDouble();
                    m2=line.nextDouble();
                    if (line.hasNextDouble()) {
                        double m3=line.nextDouble();
                        SinhVien x = new SinhVien(m1, m2, m3, ma, ht, ns, gt);
                        a.add(x);
                    }else{
                        String mon=line.nextLine();
                        GiangVien x=new GiangVien(mon, m1, m2, ma, ht, ns, gt);
                        a.add(x);
                    }
                }
            }else System.out.println("File ko ton tai");
        } catch (Exception e) {
        }
    }
    public void xuat(String nd){
        System.out.println(nd);
        for(Nguoi x:a)
            System.out.println(x);
    }
    public void xuatSV(){
        System.out.println("\n3. DSSV");
        for(Nguoi x: a)
            if(x instanceof SinhVien)
                System.out.println(x);
    }
    public void xuatGV(){
        System.out.println("\n4. DSGV");
        for(Nguoi x: a)
            if(x instanceof GiangVien)
                System.out.println(x);
    }
    public SinhVien maxDTB(){
        SinhVien y=null;
        for(Nguoi x: a)
            if(x instanceof SinhVien)
                if(y==null) y=(SinhVien)x;
                else if(y.tinhDTB()<((SinhVien)x).tinhDTB())
                     y=(SinhVien)x;
        return y;
    }
    public double diemTBCtheoGT(boolean gt){
        double s=0, dem=0;
        for(Nguoi x: a)
            if(x instanceof SinhVien)
                if(x.isGioiTinh()==gt){
                    s=s+((SinhVien)x).tinhDTB();    
                    dem++;
                }
        if(dem==0) return 0; 
        else return s/dem;
    }
    public double diemTBC(){
        double s=0, dem=0;
        for(Nguoi x: a)
            if(x instanceof SinhVien){
                    s=s+((SinhVien)x).tinhDTB();
                    dem++;
                }
        if(dem==0) return 0;
        else return s/dem;
    }
    public void loaiSV(double can){
        int i=0;
        while(i<a.size()){
            if(a.get(i) instanceof SinhVien){
                if(((SinhVien)a.get(i)).tinhDTB()<can){
                    a.remove(i);
                }else i++;
            }else i++;
        }
    }
    public GiangVien minTienDay(){
        GiangVien y=null;
        for(Nguoi x: a)
            if(x instanceof GiangVien)
                if(y==null) y=(GiangVien)x;
                else if(y.tinhThanhTien()>((GiangVien)x).tinhThanhTien())
                    y=(GiangVien)x;
        return y;
    }
    public double tongTienDay(){
        double s=0;
        for(Nguoi x: a)
            if(x instanceof GiangVien)
                s=s+((GiangVien)x).tinhThanhTien();
        return s;
    }
    public void output(){
        xuat("DS vua doc tu file");
        xuatSV();
        xuatGV();
        System.out.println("\n5. Sinh vien cao diem nhat:"+maxDTB());
        System.out.println("\n6. DTB chung nam = "+diemTBCtheoGT(true));
        System.out.println("DTB chung nu = "+diemTBCtheoGT(false));
        double diemTB=diemTBC();
        System.out.println("\nDiem TBC="+diemTBC());
        loaiSV(diemTB);
        xuat("\n7. Danh sach sau khi loai");
        System.out.println("\n8. GV co thanh tien nho nhat: "+minTienDay());
        System.out.println("\n9. Tong tien day cua giang vien: "+tongTienDay());
    }
    public static void main(String[] args) {
        MangNguoi a=new MangNguoi();
        a.docFile("SV_GV.txt");
        a.output();
    }
}
