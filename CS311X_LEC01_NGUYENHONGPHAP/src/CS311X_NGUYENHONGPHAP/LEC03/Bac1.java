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
public class Bac1 {
    double a, b;
    void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Giai Ax + B = 0");
        System.out.print("Nhap A<>0: "); a=kb.nextDouble();
        System.out.print("Nhap B: "); b=kb.nextDouble();
    }
    String giai(){
        if(a==0)
            if(b==0) return "Vo so no";
            else return "Vo no"; 
        else return "\nx = "+-b/a;
    }
    void output(){
        System.out.print(a+"x"+((b>=0) ? "+" : "") +b +"=0");
        System.out.println(giai());
    }
    public static void main(String[] args){
        Bac1 a = new Bac1();
        a.input();
        a.output();
    }
}
