/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC03;

import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class TinhToan2So {
    double a, b;
    char pt;
    void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Nguyen Hong Phap");
        System.out.println("Tinh Toan Tren 2 So Nguyen");
        System.out.print("Nhap so 1: "); a=kb.nextDouble();
        System.out.print("Nhap so 2: "); b=kb.nextDouble();
        System.out.print("Nhap phep tinh(+,-,*,/): "); pt=kb.next().charAt(0);
}
    void output(){
        if(pt== '+') System.out.println(a + "+" + b + "=" +(a+b));
        else if(pt== '-') System.out.println(a + "-" + b + "=" +(a-b));
        else if(pt == '*') System.out.println(a + "*" + b + "=" +(a*b));
        else if(pt == '/')
            if(b==0) System.out.println("Khong chia cho 0");
            else System.out.println(a +" / " +b +" =" +1.0*a/b);
        else System.out.println("Khong phai phep toan");
    }
    public static void main(String[] args){
        TinhToan2So a = new TinhToan2So();
        a.input();
        a.output();
    }
}
