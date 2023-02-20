/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC10;

/**
 *
 * @author PHAP
 */
public class PhanSo {
    private int tu,mau;
    public PhanSo(){
        tu=0; mau=1;
    }
    public PhanSo(int m){
        tu=1; mau=m;
    }
    public PhanSo(int t, int m){
        tu=t; mau=m;
    }
    public int getTu() {
        return tu;
    }
    public void setTu(int tu) {
        this.tu = tu;
    }
    public int getMau() {
        return mau;
    }
    public void setMau(int mau) {
        this.mau = mau;
    }
    public String toString(){
        return tu+"/"+mau;
    }
    public void rutGon(){
        if(tu*mau!=0){
            int a = Math.abs(tu);
            int b = Math.abs(mau);
            while(a!=b)
                if(a>b) a = a-b;
                else b = b-a;
            tu=tu/a; 
            mau=mau/a;
        }
    }
    public PhanSo cong(PhanSo b){
        PhanSo c = new PhanSo();
        c.tu = tu*b.mau + mau*b.tu;
        c.mau = mau*b.mau;
        c.rutGon();
        return c;
    }    
    public PhanSo tru(PhanSo b){
        PhanSo c = new PhanSo();
        c.tu = tu*b.mau - mau*b.tu;
        c.mau = mau*b.mau;
        c.rutGon();
        return c;
    }    
    public PhanSo nhan(PhanSo b){
        PhanSo c = new PhanSo();
        c.tu = tu*b.tu;
        c.mau = mau*b.mau;
        c.rutGon();
        return c;
    }    
    public PhanSo chia(PhanSo b){
        PhanSo c = new PhanSo();
        c.tu = tu*b.mau;
        c.mau = mau*b.tu;
        c.rutGon();
        return c;
    }    
    public static void main(String[] args) {
        PhanSo b=new PhanSo(1,2);
        PhanSo c=new PhanSo(3,4);
        System.out.println("Nguyen Hong Phap");
        System.out.println(b+"+"+c+"="+b.cong(c));
        System.out.println(b+"-"+c+"="+b.tru(c));
        System.out.println(b+"*"+c+"="+b.nhan(c));
        System.out.println(b+"/"+c+"="+b.chia(c));
    }
}
