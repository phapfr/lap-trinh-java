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
public class TongDXArrayList {
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
    int daoSo(int x){
        int s=0;
        while (x>0) {
            s=s*10 + x%10;
            x=x/10;
        }
        return s;
    }
    boolean DX(int x){
        return x>0 && daoSo(x)==x;
    }
    int tongDX(){
        int s=0;
        for(int i=0; i<a.size(); i++)
            if(DX(a.get(i))) s=s+a.get(i);
        return s;
    }
    void output(){
        xuat("Mang vua tao ra ngau nhien: ");
        System.out.println("");
        System.out.println("Tong cac so doi xung: "+tongDX());
    }
    public static void main(String[] args) {
        TongDXArrayList a=new TongDXArrayList();
        a.input();
        a.output();
    }
}
    