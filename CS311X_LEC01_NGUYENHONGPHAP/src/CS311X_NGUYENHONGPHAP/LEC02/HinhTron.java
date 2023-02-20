/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC02;

import java.util.Scanner;


public class HinhTron {
    double r;
    void input(){ // nhap du lieu tu thuoc tinh
        System.out.println("Tinh S & P hinh tron");
        System.out.print("Nhap ban kinh:");
        Scanner kb = new Scanner(System.in);
        r = kb.nextDouble();
    }
    void output(){ // xuat ket qua ra man hinh nhu mong muon
        System.out.println("S=" +Math.PI+ " * " +r+ " * " +r+ " = " +dienTich());
        System.out.println("P=2* "+Math.PI+" * "+r+" = "+2*Math.PI*r);
    }
    double dienTich(){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        HinhTron a = new HinhTron();
        a.input();
        a.output();
    }
}
