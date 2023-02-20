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
public class BPTBac2NhoBang0 {
    double a, b, c;
    void input(){           
        Scanner kb = new Scanner(System.in);
        System.out.println("Giai Ax^2 + Bx + C <= 0");
        System.out.print("Nhap A<>0: "); a=kb.nextDouble();
        System.out.print("Nhap B: "); b=kb.nextDouble();
        System.out.print("Nhap C: "); c=kb.nextDouble();
    }
    String giai(){
        double d = b*b-4*a*c;
        if(d<0)
            if(a>0) return "Vo no";
            else return "voi moi x";
        if(d==0)
            if(a>0) return "x = "+ -b/2/a;  
            else return "(--,++)";
        if(d>0){
            double x1 = (-b-Math.sqrt(d))/(2*a);
            double x2 = (-b+Math.sqrt(d))/(2*a);
            if(a>0) return "["+x1+","+x2+"]";
            else return "(--,"+x2+"]v["+x1+",++)";
        }
        return "";
    }
    void output(){
        System.out.println(a+"x^2"+((b>=0) ? "+" : "") +b +"x"+((c>=0) ? "+" : "") +c+"<=0");
        System.out.println(giai());
    }
    public static void main(String[] args){
        BPTBac2NhoBang0 a = new BPTBac2NhoBang0();
        a.input();
        a.output();
    } 
}