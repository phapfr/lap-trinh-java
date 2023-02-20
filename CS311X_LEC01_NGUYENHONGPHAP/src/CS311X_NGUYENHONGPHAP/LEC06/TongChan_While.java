/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC06;

import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class TongChan_While {
    int n;
    void input(){
        System.out.println("Tong cac chu so chan cua 1 so nguyen duong");
        Scanner kb = new Scanner(System.in);
        do{
            System.out.print("Nhap so >0:");
            n = kb.nextInt();
        }while(n<=0);
    }
    int tong(int x){
        int s=0,du;
        while(x!=0){
            du=x%10;
            x=x/10;
            if(du%2==0){
                s=s+du;
                System.out.print(du+"+");
            }          
        }
        return s;
    }
    void output(){
        System.out.println("\b="+tong(n));
    }
    public static void main(String[] args) {
        TongChan_While a = new TongChan_While();
        a.input();
        a.output();
    } 
}
