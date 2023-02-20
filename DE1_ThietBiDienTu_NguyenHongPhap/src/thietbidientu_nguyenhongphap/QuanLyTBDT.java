/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thietbidientu_nguyenhongphap;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class QuanLyTBDT {
    private ArrayList<ThietBiDT> a = new ArrayList<ThietBiDT>();
    public void docFile(String tenFile){
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String ma, thuonghieu, chip, ram, mau="";
                    int nam;
                    double kichthuoc, dg, sl;
                    ma=line.next();
                    thuonghieu=line.next();
                    dg=line.nextDouble();
                    sl=line.nextDouble();
                    if (ma.charAt(0)=='M') {
                        chip=line.next();
                        ram=line.next();
                        a.add(new MayTinh(chip, ram ,ma, thuonghieu, sl, dg));
                    }else{
                        mau=line.next();
                        kichthuoc=line.nextDouble();
                        nam=line.nextInt();
                        a.add(new TiVi(mau, kichthuoc, nam, ma, thuonghieu, sl, dg));
                    }
                }
            }else System.out.println("File ko ton tai");
        } catch (Exception e) {
        }
    }
    public void xuat(String nd){
        System.out.println(nd);
        for (ThietBiDT x : a) {
            System.out.println(x);
        }
    }
    public void output(){
        xuat("");
    }
    public static void main(String[] args) {
        QuanLyTBDT a= new QuanLyTBDT();
        a.docFile("tbdt.txt");
        a.output();
    }
}
