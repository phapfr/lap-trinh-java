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
public class MaxLienTiepArrayList {
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
        for(int i=0; i<a.size(); i++)
            System.out.print(a.get(i)+" ");
    }
    int MaxLienTiep(){
        int x=a.get(0)+a.get(1);
        for(int i=1; i<a.size()-1; i++)
            if(x<a.get(i)+a.get(i+1)) x=a.get(i)+a.get(i+1);
        return x;                   
    }
    void output(){
        xuat("Mang vua tao ra ngau nhien: ");
        System.out.println("");
        System.out.println("Tong max lien tiep: "+MaxLienTiep());
    }
    public static void main(String[] args) {
        MaxLienTiepArrayList a=new MaxLienTiepArrayList();
        a.input();
        a.output();
    }
}
    