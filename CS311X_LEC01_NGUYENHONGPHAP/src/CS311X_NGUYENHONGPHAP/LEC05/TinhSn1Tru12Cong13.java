/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC05;

import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class TinhSn1Tru12Cong13 {
    int n;
    void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Tinh S(n)= 1-1/2+1/3-...");
        do{
            System.out.print("Nhap n>0: ");
            n = kb.nextInt();
        }while(n<=0);
    }
    double tinhTong(){
        double s=0;
        for(int i=1; i<=n; i++)
            s = s + Math.pow(-1,i+1)/i;
        return s;
    }
    void output(){
        System.out.print("S("+n+")=");
        for(int i=1; i<=n; i++){
            if(i%2==0) System.out.print("1/"+i +" +");
            else System.out.print(" 1/"+i +" -");
        }
        System.out.println("\b = "+tinhTong());        
    }
    public static void main(String[] args) {
        TinhSn1Tru12Cong13 a = new TinhSn1Tru12Cong13();
        a.input();
        a.output();
    }
}
