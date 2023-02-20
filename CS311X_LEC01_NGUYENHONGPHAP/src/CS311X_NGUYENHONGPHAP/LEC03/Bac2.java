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
public class Bac2 {
    double a, b, c;
    void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Nguyen Hong Phap");
        System.out.println("Giai Ax^2 + Bx + C = 0");
        System.out.print("Nhap A: "); a=kb.nextDouble();
        System.out.print("Nhap B: "); b=kb.nextDouble();
        System.out.print("Nhap C: "); c=kb.nextDouble();
}
    String giai(){
        if(a==0)
                if(b==0)
                    if(c==0) return "Vo so no";
                    else return "Vo no"; 
                else return "x = "+-c/b;
        else{
            double d = b*b-4*a*c;
            if(d<0) return "Vo no";
            if(d==0) return "x =" +(-b/2/a);
            if(d>0){
                double t1=(-b+Math.sqrt(d))/(2*a);
                double t2=(-b-Math.sqrt(d))/(2*a);
                return "x1 = " +t1+ "; x2 = " +t2;   
        }
        return "";
        }
    }
    void output(){
        System.out.println(a+"x^2"+((b>=0) ? "+" : "") +b +"x"+((c>=0) ? "+" : "") +c+"=0");
        System.out.println(giai());
    }
    public static void main(String[] args){
        Bac2 a = new Bac2();
        a.input();
        a.output();
    } 
}