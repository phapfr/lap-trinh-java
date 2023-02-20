/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC09STUDY;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class TBCNguyenToArrayList {
    ArrayList<Integer> a=new ArrayList<Integer>();
    void input(){
        Scanner kb=new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so phan tu mang >0: ");
            n=kb.nextInt();
        } while (n<=0);
        for(int i=0; i<n; i++){
            int x=(int)(Math.random()*100);
            a.add(x);
        }
    }
    void xuat(String nd){
        System.out.println(nd);
        for(int i=0; i<a.size(); i++){
            System.out.print(a.get(i)+" ");
        }
    }
    boolean nguyenTo(int x){
        int dem=0;
        for(int i=1; i<=x; i++)
            if(x%i==0) dem++;
        return dem==2;
    }
    double TBCNT(){
        double s=0, d=0;
        for(Integer x:a)
            if(nguyenTo(x)){
                s=s+x;
                d++;
            }
        if(d==0) return 0;
        else return s/d;
    }
    void output(){
        xuat("Mang vua tao ra ngau nhien: ");
        System.out.println("");
        System.out.println("TBC nguyen to: "+TBCNT());
    }
    public static void main(String[] args) {
        TBCNguyenToArrayList a=new TBCNguyenToArrayList();
        a.input();
        a.output();
    }
}
    