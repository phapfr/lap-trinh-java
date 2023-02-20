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
public class MaxSo_While {
    int n;
    void input(){
        System.out.println("Tim chu so lon nhat cua 1 so nguyen duong");
        Scanner kb = new Scanner(System.in);
        do{
            System.out.print("Nhap so >0:");
            n = kb.nextInt();
        }while(n<=0);
    }
    int max(int x){
        int du, max=0;
        while(x!=0){
            du=x%10;
            x=x/10;
            if(du>max)
                max = du;
        }
        return max;
    }
    void output(){
        System.out.println("==>"+max(n));
    }
    public static void main(String[] args) {
        MaxSo_While a = new MaxSo_While();
        a.input();
        a.output();
    }
}
