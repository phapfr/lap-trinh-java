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
public class TBCSoLe_While {
    int n;
    void input(){
        System.out.println("Nguyen Hong Phap");
        System.out.println("Tinh TBC cac chu so le cua 1 so nguyen duong");
        Scanner kb = new Scanner(System.in);
        do{
            System.out.print("Nhap so >0:");            
            n = kb.nextInt();
        }while(n<0);
    }
    int tong(int x){
        int s=0,du,dem=0;
        while(x!=0){
            du=x%10;            
            if(du%2!=0){                
                s=s+du;
                dem++;
            }
            x=x/10;
        }
        if(dem==0) return 0;
        else return s/dem;
    }
    void output(){
            System.out.print(tong(n));
    }
    public static void main(String[] args) {
        TBCSoLe_While a = new TBCSoLe_While();
        a.input();
        a.output();
    }
}