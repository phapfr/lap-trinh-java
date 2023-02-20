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
public class TinhToanPS {
    int a, b, c, d;
    void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Nguyen Hong Phap");
        System.out.print("Nhap phan so 1:\n\tTu:");
        a = kb.nextInt();
        System.out.print("\tMau<>0:");
        b = kb.nextInt();
        System.out.print("Nhap phan so 2:\n\tTu:");
        c = kb.nextInt();
        System.out.print("\tMau<>0:");
        d = kb.nextInt();
    }
    void output(){
        System.out.println(+a+ "/" +b+ "+" +c+ "/" +d+" = " +Tong());
        System.out.println(+a+ "/" +b+ "-" +c+ "/" +d+" = " +((a*d)-(b*c))+"/"+(b*d));
        System.out.println(+a+ "/" +b+ "*" +c+ "/" +d+" = " +(a*c)+"/"+(b*d));
        System.out.println(+a+ "/" +b+ ":" +c+ "/" +d+" = " +(a*d)+"/"+(b*c));
    }
    String Tong(){
        return (a*d)+(b*c)+"/"+(b*d);
    }
    public static void main(String[] args) {
        TinhToanPS a = new TinhToanPS();
        a.input();
        a.output();
    }
}
