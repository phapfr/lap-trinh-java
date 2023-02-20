/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC07;

import java.util.Scanner;

/**
 *
 * @author PHAPSSS
 */
public class UCLNvsBCNN {
    int a,b;
    void input(){
        System.out.println("Tim UCLN va BCNN cua 2 so nguyen duong");
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap A : ");
        a = kb.nextInt();
        System.out.print("Nhap B : ");
        b = kb.nextInt();
    }
    int UCLN(int x){
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }
    int BCNN(int x){
        if (a == 0 || b == 0){
            return a+b;
        }
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }
    void output(){
        int bc=a*b/BCNN(a);
        System.out.println("UCLN = "+ UCLN(a));
        System.out.println("BCNN = "+ bc);
    }
    public static void main(String[] args) {
        UCLNvsBCNN a = new UCLNvsBCNN();
        a.input();
        a.output();
    }
}
