/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC06STUDY;

import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class TrungBinhNSoNguyenTo {
    int n;
    void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("TBC cac so nguyen to trong n so nhap tu ban phim");
        System.out.print("Nhap n>0:");
        n = kb.nextInt();
    }
    boolean nguyenTo(int x){
        int dem=0;
        for(int i=1; i<=x; i++)
                if(x%i==0)dem++;
        return dem==2;
    }
    void output(){
        double s=0, dem=0;
        System.out.print("Nhap " +n+" so nguyen :");
        Scanner kb = new Scanner(System.in);
        for(int i=1; i<=n; i++){
            int x = kb.nextInt();
            if(nguyenTo(x)){
                s=s+x;
                dem++;
            }
        }
        if(dem==0) System.out.println("TBC=0");
        else System.out.print("TBC ="+s/dem);
    }
    public static void main(String[] args) {
        TrungBinhNSoNguyenTo a = new TrungBinhNSoNguyenTo();
        a.input();
        a.output();
    }
}
