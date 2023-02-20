/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC15;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class Test {
    private ArrayList<Circle> a=new ArrayList<Circle>();
    public void docFile(String tenFile){
        try {
            File f=new File(tenFile);
            if (f.exists()) {
                Scanner read=new Scanner(f);
                while (read.hasNext()) {
                    Scanner line=new Scanner(read.nextLine()); //doc nguyen
                    double r=line.nextDouble(); //doc 1 so
                    if (line.hasNext()) { //con 1 so khac => tr
                        double h=line.nextDouble();
                        a.add(new Cylinder(h,r));
                    }else a.add(new Circle(r));
                }
            }else System.out.println("File khong ton tai");
        } catch (Exception e) {
        }
    }
    public void xuat(String noiDung){
        System.out.println(noiDung);
        for (Circle x : a) 
            System.out.println(x);
    }
    
    public Circle maxDienTichTron(){
        Circle x=null;
        int i=0;
        for(i=0; i<a.size(); i++)
            if(!(a.get(i) instanceof Cylinder)){
                x=a.get(i);break;   //hinh tron dau tien trong mang
            }
        for(i=i+1; i<a.size(); i++)
            if(!(a.get(i) instanceof Cylinder)){
                if(x.getArea()<a.get(i).getArea())
                    x=a.get(i);
            }
        return x;
    }
    public Cylinder maxTheTichTru(){
        Cylinder x=null;
        int i=0;
        for(i=0; i<a.size(); i++)
            if((a.get(i) instanceof Cylinder)){
                x=(Cylinder) a.get(i);break; //hinh tron dau tien trong mang
            }
        for(i=i+1; i<a.size(); i++)
            if ((a.get(i) instanceof Cylinder)) {
                if(x.getVolume()<((Cylinder)a.get(i)).getVolume())
                    x=(Cylinder)a.get(i);
            }
        return x;
    }
    /*public void sapXep(){
        Circle x;
        for (int i=0;i<a.size();i++)
            for (int j=i+1;j<a.size();j++)
                if (a.get(i).getArea()> a.get(j).getArea()){
                    x = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,x);
                }
    }*/
    /*public double dienTichTrungBinh(){
        double s=0;
        for(Circle x: a)
            s=s+x.getArea();
        return s/a.size();
    }
    public void loaiDienTichNho(double can){
        int i=0;
        while(i<a.size())
            if(a.get(i).getArea()<can)
                a.remove(i);
            else i++;
    }*/
    /*public int demTron(){
        int dem=0;
        for(Circle x: a)
            if(!(x instanceof Cylinder))
                dem++;
        return dem;
    }
    public int demTru(){
        int dem=0;
        for(Circle x: a)
            if((x instanceof Cylinder))    
                dem++;
        return dem;
    }*/
    public void output(){
        xuat("Danh sach cac hinh vua doc tu file");
        System.out.println("");
//        System.out.println("3. So hinh tron = "+demTron());
//        System.out.println("4. So hinh tru = "+demTru());
        System.out.println("6. Max dien tich tron = "+maxDienTichTron());
        System.out.println("7. Max the tich tru = "+maxTheTichTru());
//        sapXep();
        xuat("Tang dan theo dien tich ");  
        /* System.out.println("9. Dien tich trung binh = "+dienTichTrungBinh());
        double dttb = dienTichTrungBinh();
        loaiDienTichNho(dttb);
        xuat("10. DS cac hinh co dien tich > "+dttb);*/
    }
    public static void main(String[] args) {
        Test a=new Test();
        a.docFile("C:\\Users\\phapn\\Downloads\\Lập Trình Hướng Đối Tượng\\Lập Trình Hướng Đối Tượng TXT\\Test.txt");
        a.output();
    }
}