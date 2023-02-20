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
public class TBCDoiXungNhapVao {
    int n;
    void input(){
        System.out.println("Nguyen Hong Phap");
        System.out.println("TBC cac so doi xung trong n so nguyen duong duoc nhap vao");
        Scanner kb = new Scanner(System.in);
        do{
            System.out.print("Nhap 1 so >0: ");
            n = kb.nextInt();
        }while(n<=0);
    }
    int daoSo(int x){
        int s=0;
        while(x!=0){
            int du = x%10;
            s=s*10+du;
            x=x/10;
	}
	return s;
    }
    int doiXung(int x){
        if(x>10 && daoSo(x)==x)
            return 1;
        return 0;
    }
    void output(){
        double s=0;
        int dem=0;
        System.out.print("Nhap " +n+" so nguyen :");
        Scanner kb = new Scanner(System.in);       
        for(int i=1; i<=n; i++){
            int x = kb.nextInt();   
            if(i==1) System.out.print("(");
            if(doiXung(x)==1){
                System.out.print(x+"+");
                s=s+x;
                dem++;
            }
        }
        if(dem==0) System.out.println("TBC=0");
        else System.out.printf("\b)/%d = %.2f \n",dem,1.0*s/dem);
    }
    public static void main(String[] args) {
        TBCDoiXungNhapVao a = new TBCDoiXungNhapVao();
        a.input();
        a.output();
    }
}
