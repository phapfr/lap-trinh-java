/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC10;

import java.util.Scanner;


/**
 *
 * @author PHAP
 */
public class TinhToanTrenPhanSo {
    private PhanSo a,b;
    private char pt;
    public PhanSo nhap1PhanSo(){
        int x,y;
        Scanner kb=new Scanner(System.in);
        System.out.print("\tTu: ");
        x  = kb.nextInt();
        do{
            System.out.print("\tMau<>0: ");
            y  = kb.nextInt();
        }while(y<=0);
        PhanSo z= new PhanSo(x,y);
        return z;
        //return (new PhanSo(x,y);
    } 
    public void input(){
        System.out.println("Nhap phan so 1:");
        a=nhap1PhanSo();
        System.out.println("Nhap phan so 2:");
        b=nhap1PhanSo();
        Scanner kb=new Scanner(System.in);
        do {
            System.out.print("Nhap phep toan (+,-,*,/):");
            pt=kb.next().charAt(0);
        } while (pt!='+'&&pt!='-'&&pt!='*'&&pt!='/');
    }       
    void output (){
        switch(pt){
            case '+': System.out.println(a +" + "+ b + " = " +a.cong(b));break;
            case '-': System.out.println(a +" - "+ b + " = " +a.tru(b));break;
            case '*': System.out.println(a +" * "+ b + " = " +a.nhan(b));break;
            case '/':
                if(b.getTu()==0) System.out.println("Khong chia 0");
                else System.out.println(a +" / "+ b + " = " +a.chia(b));
                break;
        }
    }
    public static void main(String []arg){
       TinhToanTrenPhanSo a=new TinhToanTrenPhanSo();
        a.input();
        a.output();
    }    
}