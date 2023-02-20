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
public class TongCacChuSo {
    int n;
    void input(){
        Scanner kb = new Scanner(System.in);
        do{
            System.out.print("Nhap so >0:");
            n = kb.nextInt();
        }while(n<0);
    }
    int tong(int x){
        int s=0;
        while(x!=0){
            s = s + x%10;
            x = x/10;
        }
        return s;
    }
    void output(){
        System.out.print("Tong cac chu so = "+ tong(n));
    }
    public static void main(String[] args) {
        TongCacChuSo a = new TongCacChuSo();
        a.input();
        a.output();
    }
}
