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
public class TBCNguyenTo {
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
            if(x%i==0) dem++;
        return dem==2;
    }
    void output(){    
        System.out.printf("Trung binh cong cac so nguyen to nho hon hoac bang %d:\n(",n);
        int dem = 0, s = 0;
        for(int i=1; i<=n; i++)
            if(nguyenTo(i)==true){
                System.out.print(i+"+");
                s = s + i;
                dem++;
            }
        System.out.printf("\b)/%d = %.2f \n",dem,1.0*s/dem);
    }
    public static void main(String[] args) {
        TBCNguyenTo a = new TBCNguyenTo();
        a.input();
        a.output();
    }
}
