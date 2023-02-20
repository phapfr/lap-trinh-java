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
public class ChenTangArrayList {
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
    void sapXep(){
        for(int i=0; i<a.size()-1;i++)
            for(int j=i+1; j<a.size(); j++)
                if(a.get(i)>a.get(j)){
                    int t = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, t);
                }
    }
    void chenTang(int x){
        int i;
        for(i=0;i<a.size(); i++)
            if(a.get(i)>=x) break;
        a.add(i,x);
    }
    void output(){
        xuat("Mang vua tao ngau nhien: ");
        int x;
        Collections.sort(a);
        xuat("\nMang sau sap xep: ");        
        Scanner kb = new Scanner(System.in);
        System.out.print("\nNhap gia tri va chi so can chen: ");
        x=kb.nextInt();
        chenTang(x);
        xuat("\nMang sau chen tang: ");
    }
    public static void main(String[] args) {
        ChenTangArrayList a = new ChenTangArrayList();
        a.input();
        a.output();
    }
}
