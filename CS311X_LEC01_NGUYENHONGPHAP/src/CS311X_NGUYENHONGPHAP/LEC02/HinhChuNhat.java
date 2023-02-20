/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC02;

import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class HinhChuNhat {
    double a, b;
    void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Tinh S & P hinh chu nhat");
        System.out.print("Nhap canh 1:");
        a = kb.nextDouble();
        System.out.print("Nhap canh 2:");
        b = kb.nextDouble();
    }
    void output(){
        System.out.println("S=" +a+ " * " +b+ " = " +dienTich());
        System.out.println("P=2*( "+a+ " + " +b+ ") = "+(a+b)*2);
    }
    double dienTich(){
        return a*b;
    }
    public static void main(String[] args) {
        HinhChuNhat a = new HinhChuNhat();
        a.input();
        a.output();
    }
}
