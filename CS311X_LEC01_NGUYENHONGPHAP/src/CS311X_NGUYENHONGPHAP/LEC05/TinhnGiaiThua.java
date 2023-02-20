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
public class TinhnGiaiThua {
    int n;
    void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Tinh n! = 1*2*3*...*n");
        do{
            System.out.print("Nhap n>0: ");
            n = kb.nextInt();
        }while(n<=0);
    }
    double giaiThua(int n){
        double s=1;
        for(int i=1; i<=n; i++)
            s=s*i;
        return s;
    }
    void output(){
        System.out.print(n+"!=");
        for(int i=1; i<=n; i++)
            System.out.print(i+"*");
        System.out.print("\b = "+giaiThua(n));        
    }
    public static void main(String[] args) {
        TinhnGiaiThua a = new TinhnGiaiThua();
        a.input();
        a.output();
    }
}
