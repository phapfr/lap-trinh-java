/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC06STUDY;

import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class LietKeSoNguyenTo {
    int n;
    void input(){
        Scanner kb = new Scanner(System.in);
        do{
            System.out.print("Nhap 1 so >0: ");
            n = kb.nextInt();
        }while(n<=0);
    }
    boolean nguyenTo(int x){
        int dem=0;
        for(int i=1; i<=x; i++)
                if(x%i==0)dem++;
        return dem==2;
    }
    void output(){
        for(int i=1; i<=n; i++)
            if(nguyenTo(i)==true)
                System.out.print(i+" ");
    }
    public static void main(String[] args) {
        LietKeSoNguyenTo a = new LietKeSoNguyenTo();
        a.input();
        a.output();
    }
}
