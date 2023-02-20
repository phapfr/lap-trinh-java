/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC11;

import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class TamGiac {
    private DiemOxy a,b,c;
    public TamGiac(){
    }
    public TamGiac(DiemOxy a, DiemOxy b, DiemOxy c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public DiemOxy getA() {
        return a;
    }
    public void setA(DiemOxy a) {
        this.a = a;
    }
    public DiemOxy getB() {
        return b;
    }
    public void setB(DiemOxy b) {
        this.b = b;
    }
    public DiemOxy getC() {
        return c;
    }
    public void setC(DiemOxy c) {
        this.c = c;
    }
    public DiemOxy nhap1Diem(String cauNhac){
        Scanner kb=new Scanner(System.in);
        System.out.print(cauNhac);
        int x, y;
        x=kb.nextInt();
        y=kb.nextInt();
        return new DiemOxy(x,y);
    }
    public void input(){
        a=nhap1Diem("Nhap diem A:");
        b=nhap1Diem("Nhap diem B:");
        c=nhap1Diem("Nhap diem C:");
    }
    
    public boolean laTamGiac(){
        double ab, ac, bc;
        ab=a.khoangCach(b);
        ac=a.khoangCach(c);
        bc=b.khoangCach(c);
        if(ab+ac>bc && ab+bc>ac && ac+bc>ab) return true;
        return false;
    }
    public double getChuVi(){
        double ab,ac,bc;
        ab=a.khoangCach(b);
        ac=a.khoangCach(c);
        bc=b.khoangCach(c);
        return ab+ac+bc;
    }
    
    public double getDienTich(){
        if(!laTamGiac()) return 0;
        double ab,ac,bc;
        ab=a.khoangCach(b);
        ac=a.khoangCach(c);
        bc=b.khoangCach(c);
        double p=(ab+ac+bc)/2;
        return Math.sqrt(p*(p-ab)*(p-ac)*(p-bc));
    }
    public void output(){
        if(laTamGiac()){
            System.out.println(""+ a + b + c + " la tam giac co:");
            System.out.println("P="+getChuVi());
            System.out.println("S="+getDienTich());
        }else System.out.println("Khong tao thanh tam giac");
    }
    public static void main(String[] args) {
        TamGiac a=new TamGiac();
        a.input();
        a.output();
    }
}
