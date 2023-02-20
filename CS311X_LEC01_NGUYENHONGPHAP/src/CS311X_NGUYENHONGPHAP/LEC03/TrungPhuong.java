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
public class TrungPhuong { //ax^4 + bx^2 + c = 0
    double a, b, c; // khai bao bien
    void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Giai Ax^4 + Bx^2 + C = 0");
        System.out.print("Nhap A<>0: "); a=kb.nextDouble();
        System.out.print("Nhap B: "); b=kb.nextDouble();
        System.out.print("Nhap C: "); c=kb.nextDouble();
    }
    /* Dat t = x^2 (t>0) => at^2 +bt +c=0, chi lay nghiem t>0 ( TH t: vo no, 1 no, 2 no)
    B1: nhap a,b,c
    B2: d = bb - 4ac
    B3: TH(d<0) => vo no, ket thuc // 1
    B4: Th ( d=0){
        B4.1: t = -b/2a
        B4.2: TH (t>0) => -+ Can (t) // 4
        B4.2: TH (t<0) => vo no // 2
        Ket thuc
    }
    B5: TH (d=0){
        B5.1: t1=(-b-Can(d))/2a
        B5.2: t1=(-b+Can(d))/2a
        B5.3:TH(t1<0 && t2<0) => VO no //3
    `   B5.4:TH(t1>0 && t2<0) => -+Can (t1) //5
        B5.5:TH(t1<0 && t2>0) => -+Can (t2) //5
        B5.6:TH(t1>0 && t2>0) => -+Can (t1),-+Can (t2)//6
    */
    String giai(){
        double d = b*b-4*a*c;
        if(d<0) return "Vo no";
        if(d==0){
            double t = -b/2/a;
            if(t>0) return "-"+Math.sqrt(t) + "+"+Math.sqrt(t);
            else return "vo no";
        }
        if(d>0){
            double t1 = (-b-Math.sqrt(d)/2/a);
            double t2 = (-b+Math.sqrt(d)/2/a);
            if(t1<0 && t2 <0) return "vo no";
            if(t1>0 && t2 <0) return "-"+Math.sqrt(t1) + "+" +Math.sqrt(t1);
            if(t1<0 && t2 >0) return "-"+Math.sqrt(t2) + "+" +Math.sqrt(t2);
            if(t1>0 && t2 >0) return "-"+Math.sqrt(t1) + "+" +Math.sqrt(t1) + "-"+Math.sqrt(t2) + "+" +Math.sqrt(t2);
        }
        return "";
    }
    void output(){
        System.out.println(giai());
    }
    public static void main(String[] args){
        TrungPhuong a = new TrungPhuong();
        a.input();
        a.output();
    } 
}
