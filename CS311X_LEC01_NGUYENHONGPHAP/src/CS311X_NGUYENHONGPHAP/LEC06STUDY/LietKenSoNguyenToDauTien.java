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
public class LietKenSoNguyenToDauTien {
    int n,Dem;
 void input(){
     Scanner kb = new Scanner(System.in);
     System.out.print("Nhap so >0 :");
     n=kb.nextInt();
    }
boolean kiemtra(int x){
        int b = (int) Math.sqrt(x);
        for (int i = 2; i <= b; i++)
            if (x % i == 0) 
                return false;
        return true;
    }
void lietke(){ 
    for(int i =2; i!=0 ; i++){
        if(kiemtra(i)){
            System.out.print(i+" ");
            Dem++;
        }
    if (Dem==n)
        break;
    }
}
void output(){
    System.out.print( n+" so nguyen to dau tien la: ");
    lietke();
    }
public static void main(String[] args){
    LietKenSoNguyenToDauTien a = new LietKenSoNguyenToDauTien();
    a.input();
    a.output();
    }
}    
 
