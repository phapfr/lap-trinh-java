/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC07;

import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class TongHoanThienNhapVao {
    int n;
    void input(){
        System.out.println("Nguyen Hong Phap");
        System.out.println("Tong cac so hoan thien trong n so nhap tu ban phim");
        Scanner kb = new Scanner(System.in);
        do{
            System.out.print("Nhap 1 so >0: ");
            n = kb.nextInt();
        }while(n<=0);
    }
    int hoanThien(int x){
        int s=0,a,i;
	for(i=1; i<=x/2; i++){
                a=x%i;
                if(a==0) s=s+i;
	}
	if(s==x) return 1;
        return 0;
    }
    void output(){
        double s=0;
        System.out.print("Nhap " +n+" so nguyen :");
        Scanner kb = new Scanner(System.in);
        for(int i=1; i<=n; i++){
            int x = kb.nextInt();
            if(hoanThien(x)==1){
                s=s+x;
                System.out.print(x+"+");
            }
        }
        System.out.println("\b="+s);
    }
    public static void main(String[] args) {
        TongHoanThienNhapVao a = new TongHoanThienNhapVao();
        a.input();
        a.output();
    }
}
