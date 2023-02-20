/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC09STUDY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class DungArrayList {
    ArrayList<Integer> a=new ArrayList<Integer>();
    void input(){
        Scanner kb = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap so phan tu mang >0:");
            n=kb.nextInt();
        }while(n<=0);
        for(int i=0; i<n; i++){
            int x=(int) (Math.random()*100);
            a.add(x);
        }
    }
    void xuat(String nd){
        System.out.print(nd);
        for(int i=0; i<a.size(); i++)
           System.out.print(a.get(i)+" ");    
    }
    //
    int timMax(){
        int x=a.get(0);
        for(int i=1; i<a.size(); i++)
            if(x<a.get(i)) x = a.get(i);
        return x;
    }
    int timMin(){
        int x=a.get(0);
        for(int i=1; i<a.size();i++)
            if(x>a.get(i)) x = a.get(i);
        return x;
    }
    //
    int timMaxLienTiep(){
        int x=a.get(0)+a.get(1);                
        for(int i=1; i<a.size()-1;i++)
            if(x<a.get(i)+a.get(i+1)) x = a.get(i)+a.get(i+1);
        return x;
    }
    //
    boolean laNguyenTo(int x){
        int dem=0;
        for(int i=1; i<=x;  i++)
            if(x%i==0) dem++;
        return dem==2;
    }
    double tBCNT(){
        double s=0, d=0;
        for(Integer x : a)
            if(laNguyenTo(x)){
                s=s+x;
                d++;
            }
        if(d==0) return 0;
        else return s/d;
    }
    //
    int daoSo(int x){
        int s=0;
        while(x>0){
            s=s*10+x%10;
            x=x/10;
        }
        return s;
    }
    boolean laDoiXung(int x){
        return x>0 && daoSo(x)==x;
    }
    int tongDX(){
        int s=0;
        for(int i=0; i<a.size(); i++)
            if(laDoiXung(a.get(i))) 
                s=s+ a.get(i);
        return s;
    }
    //
    int tongCacChuSo(int x){
        int s=0;
        while(x>0){
            s=s+x%10;
            x=x/10;
        }
        return s;
    }
    void lietKe(){
        System.out.println("\nCac so co tong chu so >10: ");
        for(Integer x: a)
            if(tongCacChuSo(x)>10)
                System.out.print(x+" ");
    }
    //
    void sapXep(){
        for(int i=0; i<a.size()-1;i++)
            for(int j=i+1; j<a.size(); j++)
                if(a.get(i)>a.get(j)){
                    int t = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, t);
                }
    }
    //
    void chenTang(int x){
        int i;
        for(i=0;i<a.size(); i++)
            if(a.get(i)>=x) break;
        a.add(i,x);
    }
    //
    void xoaAll(int x){
        while(a.contains(x))
            a.remove((Object)x);
    }
    //
    void output(){
        xuat("Mang vua tao ngau nhien: ");
        System.out.println("");
        System.out.println("Max-min="+timMax()+"-"+timMin()+"="+(timMax()-timMin()));
        System.out.println("Max 2 so lien tiep = "+timMaxLienTiep());
        System.out.println("TBC nguyen to = "+tBCNT());
        System.out.println("Tong cac so doi xung = "+tongDX());
        lietKe();
        Collections.sort(a);
        xuat("\nMang sau sap xep: ");
        int x,k;
        Scanner kb = new Scanner(System.in);
        //System.out.print("\nNhap gia tri va chi so can chen: ");
        System.out.print("\nNhap gia tri can xoa: ");
        x=kb.nextInt();
        //k=kb.nextInt();
        //a.add(k, x);
        //xuat("\nMang sau chen: ");
        //chenTang(x);
        //xuat("\nMang sau chen tang: ");
        xoaAll(x);
        xuat("\nMang sau xoa: ");
    }
    public static void main(String[] args) {
        DungArrayList a = new DungArrayList();
        a.input();
        a.output();
    }
}
