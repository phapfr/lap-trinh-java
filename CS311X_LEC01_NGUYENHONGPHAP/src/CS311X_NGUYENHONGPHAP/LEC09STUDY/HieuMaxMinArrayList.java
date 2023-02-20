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
public class HieuMaxMinArrayList {
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
    int max(){
        int x=a.get(0);
        for(int i=1; i<a.size(); i++)
            if(x<a.get(i)) x=a.get(i);
        return x;        
    }
    int min(){
        int x=a.get(0);
        for(int i=1; i<a.size(); i++)
            if(x>a.get(i)) x=a.get(i);
        return x;
    }
    void output(){
        xuat("Mang vua tao ra ngau nhien: ");
        System.out.println("");
        System.out.println("Max-min="+max()+"-"+min()+"="+(max()-min()));
    }
    public static void main(String[] args) {
        HieuMaxMinArrayList a=new HieuMaxMinArrayList();
        a.input();
        a.output();
    }
}
    