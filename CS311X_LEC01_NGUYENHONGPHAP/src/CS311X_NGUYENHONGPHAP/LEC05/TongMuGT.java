package CS311X_NGUYENHONGPHAP.LEC05;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PHAP
 */
public class TongMuGT {
    int n;
    void intput(){                   
        Scanner kb=new Scanner(System.in);
        System.out.println("Nguyen Hong Phap");
        System.out.println("Tinh S(n)=1-1^2/2!+2^3/3!-3^4/4!+...+((-1)^n+1)*n*(n+1)/(n+1)!");                
        do{
            System.out.print("Nhap n>0:");
            n=kb.nextInt();
        }while(n<0);
    }
    double giaiThua(int n){
        double s=1;
        for(int i=1; i<=n; i++){
            s=s*i;
        }
        return s;
    }
    double tinhTong(){
        double s=1;
        for(int i=1;i<=n;i++)
            s= s + Math.pow(-1,i)*Math.pow(i,i+1)/giaiThua(i+1);
        return s;
        }            
    void output(){
        System.out.print("S("+n+")=1");
        for(int i=1;i<=n;i++)
            System.out.print(((i%2==0)? "+":"-")+i+"^"+(i+1)+"/"+(i+1)+"!");
        System.out.println("="+tinhTong());
    }
    public static void main(String[] args){
        TongMuGT a=new TongMuGT();
        a.intput();
        a.output();
    }
}
        
        
        
        
