/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs311x_phap;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DanhSachHangHoa {
    private ArrayList<HangHoa> a = new ArrayList<HangHoa>();
    public void docFile(String tenFile){
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                try (Scanner read = new Scanner(f)) {
                    while (read.hasNext()) {
                        Scanner line = new Scanner(read.nextLine());
                        String ma,ngay,sx;
                        double soluong, dongia;
                        ma=line.next();
                        ngay=line.next();
                        dongia=line.nextDouble();
                        soluong=line.nextDouble();
                        sx=line.next();
                        if (line.hasNext()) {
                            sx=sx+" "+line.next();
                            HangThuCong x=new HangThuCong(sx, ma, ngay, dongia, soluong);
                            a.add(x);
                        }
                        else{
                            HangDienMay x=new HangDienMay(sx, ma, ngay, dongia, soluong);
                            a.add(x);
                        }
                    }
                }
            }else System.out.println("File ko ton tai");
        } catch (Exception e) {
        }
    }
    public void xuat(String nd){
        System.out.println(nd);
        for (HangHoa x : a) {
            System.out.println(x);
        }
    }
    
    public void output(){
        xuat("");
    }
    public static void main(String[] args) {
        DanhSachHangHoa a= new DanhSachHangHoa();
        a.docFile("TH.txt");
        a.output();
    }
}
