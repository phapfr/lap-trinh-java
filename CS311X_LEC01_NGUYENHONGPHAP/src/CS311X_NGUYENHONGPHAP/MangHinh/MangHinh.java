/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.MangHinh;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class MangHinh {
    private ArrayList<HinhVuong> a=new ArrayList<HinhVuong>();
    public void docFile(String tenFile){
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    double c1,c2;
                    c1=line.nextDouble();
                    if (line.hasNext()) {
                        c2=line.nextDouble();
                        a.add(new HinhChuNhat(c1,c2));
                    }a.add(new HinhVuong(c1));
                }
            }else System.out.println("File ko ton tai");
        } catch (Exception e) {
        }
    }
    public void xuat(){
        for (HinhVuong x : a)
            System.out.println(x);
    }
    public HinhVuong maxDienTich(){
        HinhVuong x=a.get(0);
        for (int i = 1; i < a.size(); i++) 
            if(x.dienTich()<a.get(i).dienTich())
                x=a.get(i);
        return x;
    }
    public HinhChuNhat maxDienTichHCN(){
        HinhChuNhat x=null;
        int i=0;
        for ( i = 0; i < a.size(); i++) 
            if(a.get(i) instanceof HinhChuNhat){
                x=(HinhChuNhat)a.get(i);break;
            }
        for ( i = i+1; i < a.size(); i++) 
            if(a.get(i) instanceof HinhChuNhat)
                if(x.dienTich()<((HinhChuNhat)a.get(i)).dienTich())
                    x=(HinhChuNhat)a.get(i);
        return x;
    }
    public void demHinh(){
        int demCN=0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) instanceof HinhChuNhat) demCN++;
        }
        System.out.println("So HV:" + (a.size() - demCN));
        System.out.println("So HCN:" + demCN);
    }
    public void tangDienTich(){
        for(int i=0; i<a.size()-1; i++)
            for(int j=i+1; j<a.size(); j++)
                if(a.get(i).dienTich()>a.get(j).dienTich()){
                    HinhVuong x=a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, x);
                }
    }
    public void output(){
        System.out.println("Noi dung File");
        xuat();
        System.out.println("Max dien tich = "+maxDienTich());
        demHinh();
        System.out.println("Max hinh chu nhat = "+maxDienTichHCN());
        tangDienTich();
        System.out.println("Tang dan theo dien tich");
        xuat();
    }
    public static void main(String[] args) {
        MangHinh a=new MangHinh();
        a.docFile("C:\\Users\\phapn\\Downloads\\Lập Trình Hướng Đối Tượng\\Lập Trình Hướng Đối Tượng TXT\\Hinh.txt");
        a.output();
    }
}