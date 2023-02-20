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
public class TimMaxChuSo {
    int x,max;
    void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Nguyen Hong Phap");
        System.out.println("Tim chu so lơn nhat trong so hang van");
        System.out.print("Nhap so co 5 chu so:");
        x = kb.nextInt();
        }
    void output(){
        if(x<100||x>99999) System.out.println("Khong tim");
        else{
            int a, b, c, d, e;
            e = x%10;
            d = x/10%10;
            c = x/100%10;
            b = x/1000%10;
            a = x/10000;
	max=a;
            if(b>max) max=b;
            if(c>max) max=c;
            if(d>max) max=d;
            if(e>max) max=e;
            System.out.println("So lon nhat trong 5 chu so:" +max);
        }
    }
    public static void main(String[] args) {
        TimMaxChuSo a = new TimMaxChuSo();
        a.input();
        a.output();
    }
 }
