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
public class TT2SoSw {
    double a, b;
    char pt;
    void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Nguyen Hong Phap");
        System.out.println("Tinh Toan Tren 2 So Nguyen");
        System.out.print("Nhap a: "); a=kb.nextDouble();
        System.out.print("Nhap b: "); b=kb.nextDouble();
        System.out.print("Nhap phep tinh(+,-,*,/): "); pt=kb.next().charAt(0);
    }
    void output(){
        double kq=0;
        switch(pt){
            case '+': kq=a+b;break;
            case '-': kq=a-b;break;
            case '*': kq=a*b;break;
            case '/':
                if(b==0){
                    System.out.println("Khong chia cho 0");
                    System.exit(0);
                }
                else kq= 1.0*a/b;
                break;
            default: 
                System.out.println("Khong phai phep toan"); 
                System.exit(0);// dung ngang chuong trinh
        }
        System.out.println(a+" "+pt+" "+b +" =" +kq);
    }
    public static void main(String[] args){
        TT2SoSw a = new TT2SoSw();
        a.input();
        a.output();
    }
}
