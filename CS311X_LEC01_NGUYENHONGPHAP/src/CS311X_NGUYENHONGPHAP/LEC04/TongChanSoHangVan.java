/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC04;

import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class TongChanSoHangVan {
    int x;
    void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Nguyen Hong Phap");
        System.out.println("Tinh tong cac chu so chan cua mot so nguyen hang van");
        System.out.print("Nhap so hang van (9999<n<=99999):");
        x = kb.nextInt();
    }                    
    void output(){
        if(x<=9999||x>99999) 
            System.out.println("Khong xu ly");
        else{
            int e, a, b, c, d, s=0;            
            d = x%10;
            c = (x/10) %10;
            b = (x/100) %10;
            a = (x/1000) %10;
            e = x/10000;
            String st="Tong =";
            if(e%2==0){
                s=s+e;
                st = st + e +"+";
            }
            if(a%2==0){
                s=s+a;
                st = st + a +"+";
            }
            if(b%2==0){
                s=s+b;
                st = st + b +"+";
            }
            if(c%2==0){
                s=s+c;
                st = st + c +"+";
            }
            if(d%2==0) {
                s=s+d;
                st = st + d +"+";
            }
        System.out.println("\b="+s);
        }
    }
     public static void main(String[] args) {
        TongChanSoHangVan a = new TongChanSoHangVan();
        a.input();
        a.output();
    }
 }
