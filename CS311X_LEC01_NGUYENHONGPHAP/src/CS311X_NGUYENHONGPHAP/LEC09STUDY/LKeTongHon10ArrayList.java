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
public class LKeTongHon10ArrayList {
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
    int tongCacChuSo(int x){
        int s=0;
        while (x>0) {
            s=s+x%10;
            x=x/10;
        }
        return s;
    }
    void lietKe(){
        System.out.println("Tong cac chu so >10: ");
        for(Integer x:a)
            if(tongCacChuSo(x)>10)
                System.out.print(x+" ");
    }
    void output(){
        xuat("Mang vua tao ra ngau nhien: ");
        System.out.println("");
        lietKe();
    }
    public static void main(String[] args) {
        LKeTongHon10ArrayList a=new LKeTongHon10ArrayList();
        a.input();
        a.output();        
    }
}
