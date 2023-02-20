/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC04;

import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class Cong2MocTG {
    int h1,m1,s1,h2,m2,s2,s3,m3,h3;
    void intput(){
        Scanner kb=new Scanner(System.in);
        System.out.println("Nguyen Hong Phap");
        System.out.println("Cong 2 moc thoi gian");        
        System.out.print("Nhap moc 1(h m s):");
        h1=kb.nextInt();
        m1=kb.nextInt();
        s1=kb.nextInt();  
        System.out.print("Nhap moc 2(h m s):");
        h2=kb.nextInt();
        m2=kb.nextInt();
        s2=kb.nextInt(); 
    }
    void output(){
        int h3,m3,s3,du=0;
        s3=s1+s2;
        if(s3>=60){
            s3=s3-60;
            du=1;
        }
        m3=m1+m2+du;
        if(m3>=60){
            m3=m3-60;
            du=1;
        }
        else du=0;
        h3=h1+h2+du;
        if(h3>=24)h3=h3-24;
        System.out.printf("\t%2dh:%2dm:%2ds",h1,m1,s1);
        System.out.printf("\n\t%2dh:%2dm:%2ds",h2,m2,s2);
        System.out.printf("\t--------");
        System.out.printf("\n\t%2dh:%2dm:%2ds",h3,m3,s3);
    }
public static void main(String[] args){
            Cong2MocTG a=new Cong2MocTG();
            a.intput();
            a.output();
    }
}
