/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class NewClass {
   private  int tu;
   private  int mau;
 // phuong thuc 
 // nhap phan so
   public void nhapPS(){
       System.out.println("nhap tu so : ");
       tu = doiInt(nhapXau());//doiInt(nhapXau()): chuyen chuoi ve so
       System.out.println("nhap mau so : ");
   do{
       mau = doiInt(nhapXau());
       if(mau==0)
           System.out.println("mau so = 0 --> nhap lai : ");
   }while(mau==0); 
   }
   // xuat phan so
   public void xuatPS(){
       System.out.print(tu + "\\" + mau);
   }
 // phuong thuc nhap loi
   public String nhapXau(){
       String str;
       Scanner br = new Scanner(System.in);
        str = br.nextLine();
       return str;
   }
 // phuong thuc chuyen chuoi sang so nguyen
   public int doiInt(String st){
       int so;
       so = Integer.parseInt(st);
       return so;
   }
   int UCLN(int a, int b){
       while(a!=b){
           if(a>b) a-=b;
           else b-=a;
       }
        return a;
   }
    public void toigianPS(){
        int ucln=(UCLN(tu,mau));
        tu/=ucln;
        mau/=ucln;
    } 
    public static void main(String[] args){
        NewClass ps= new NewClass();
        System.out.println("\n ==== Nhap phan so ====");
        ps.nhapPS();
        System.out.println("\n ==== Phan so da nhap ====");
        ps.xuatPS();
        System.out.println("\n ==== Phan so toi gian ====");
        ps.toigianPS();
        ps.xuatPS();
    }  
}
