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
public class XoaArrayList {
    ArrayList<Integer> a=new ArrayList<Integer>();
    void input(){
        Scanner kb = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap so phan tu mang >0:");
            n=kb.nextInt();
        }while(n<=0);
        for(int i=0; i<n; i++){
            int x=(int) (Math.random()*10);
            a.add(x);
        }
    }
    void xuat(String nd){
        System.out.print(nd);
        for(int i=0; i<a.size(); i++)
           System.out.print(a.get(i)+" ");
    }   
    void xoaAllx(int x){
        while (a.contains(x))
            a.remove((Object)x);
    }
    void output(){
        xuat("Mang vua tao ngau nhien: ");
        int x;              
        Scanner kb = new Scanner(System.in);
        System.out.print("\nNhap gia tri can xoa: ");
        x=kb.nextInt();     
        xoaAllx(x);
        xuat("\nMang sau xoa: ");
    }
    public static void main(String[] args) {
        XoaArrayList a = new XoaArrayList();
        a.input();
        a.output();
    }
}
