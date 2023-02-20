package CS311X_NGUYENHONGPHAP.LEC05;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PHAP
 */
public class TinhSn11213 {
    int n;
    void input(){
    Scanner kb = new Scanner(System.in);
    System.out.println("Tinh S(n) = 1 + 1/2 + 1/3+...");
    System.out.print("Nhap n>0:");
    n = kb.nextInt();
    }
    double tinhTong(){
        double s=0;
        for(int i=1; i<=n; i++)
            s = s + 1.0/i;
        return s;
    }
    void output(){
        System.out.print("S("+n+")=");
        for(int i=1; i<=n; i++)
            System.out.print("1/" +i +" +");
        System.out.println("\b =" +tinhTong());
        }
    public static void main(String[] args) {
        TinhSn11213 a = new TinhSn11213();
        a.input();
        a.output();
    }
}