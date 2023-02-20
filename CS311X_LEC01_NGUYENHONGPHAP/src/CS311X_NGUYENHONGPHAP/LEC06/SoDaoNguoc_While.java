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
public class SoDaoNguoc_While {
    int n;
    void input(){
        System.out.println("Tim so dao nguoc cua 1 so nguyen duong");
        Scanner kb = new Scanner(System.in);
        do{
            System.out.print("Nhap so >0:");
            n = kb.nextInt();
        }while(n<=0);
    }
    int daoNguoc(int x){
        int du, s=0, s1=0;
        while(x!=0){
            du=x%10;
            x=x/10;
            s=s+du;
            s1=s1*10+du;
        }
        return s1;
    }
    void output(){
        System.out.println("==>"+daoNguoc(n));
    }
    public static void main(String[] args) {
        SoDaoNguoc_While a = new SoDaoNguoc_While();
        a.input();
        a.output();
    }
}
