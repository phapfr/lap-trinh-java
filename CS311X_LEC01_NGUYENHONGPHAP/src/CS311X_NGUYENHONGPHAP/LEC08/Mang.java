/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC08;

import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class Mang {
    int a[]=new int[100];
    int n;
    void nhapMang(){
        Scanner kb=new Scanner(System.in);
        System.out.println("Nguyen Hong Phap");
        do{
            System.out.print("Nhập số phần tử mảng >0:");
            n=kb.nextInt();
        }while(n<=0);
         for(int i=0;i<n;i++){
           a[i]=(int)(Math.random()*100);
        }
    }
     void xuatMang(String nd){
         System.out.print(nd);
         for(int i=0;i<n;i++){            
            System.out.print(a[i]+" ");
         }         
    }
    int max(int a[],int n){
	int max = a[0];
	for(int i=0;i<n;i++){
		if(max < a[i]) max = a[i];
	}
	return max;
    }
    int min(int a[],int n){
	int min = a[0];
	for(int i=0;i<n;i++){
		if(min>a[i]) min = a[i];
	}
	return min;
    }
    int tinhHieumaxmin(int a[],int n){
        return max(a,n)-min(a,n);
    }
    int tong2solonnhat(int a[], int n)
    {
	int m1=0, m2;
	for(int i=0;i<=n;i++){
		if(a[m1]<a[i]) m1=i;
	}
	m2=0;
	for(int i=0;i<=n;i++){
		if(a[m2]<a[i] && i!=m1) m2=i;
	} 
	return a[m1]+a[m2];
    }
    int kiemTrasonguyenTo(int y){
	int dem=0;
	for(int i=1;i<=y;i++){
		if(y%i==0) dem++;
	}
	if(dem==2) return 1;
	else return 0;
    }
    void tbcSonguyento(int a[],int n){
	int tong=0;
	int dem=0;
        System.out.print("\nTrung binh cong so nguyen to:(");
	for(int i=0;i<n;i++){
            if(kiemTrasonguyenTo(a[i])==1)
                {
                    System.out.print(a[i]+"+");
                    tong = tong + a[i];
                    dem++;
		}
	}
        System.out.print("\b)/"+dem+"="+1.0*(tong/dem));
    }
    int soDao(int y){
        int s=0;
        while(y!=0){
           int du=y%10;
           s=s*10+du;
           y=y/10;
        }
       return s;
    }
    boolean doiXung (int y){
       return y>10 && soDao(y)==y;
    }
    void tbcSodoixung(int a[],int n){
        int s=0,dem=0;
        System.out.print("\nTrung binh cong so doi xung:(");
        for(int i=1;i<=n;i++){
            if(doiXung(a[i])){                
                System.out.print(+a[i]+"+");
                s=s+a[i];
                dem++;
            }
        }
        System.out.print("\b)/"+dem+"="+1.0*(s/dem));       
    }
    int tong(int y){
	int s = 0;
	while(y!=0){
		s = s + y%10;
		y = y/10;
	}
	return s;
}
    void tongLonhon10(int a[],int n){
	System.out.print("\nCac so co tong chu so lon hon 10: ");
	for(int i=0;i<n;i++){
		if(tong(a[i])>10) 
                    System.out.print(a[i]+",");
	}
	System.out.print("\b");
}
    void output(){
        xuatMang("Các phần tử vừa nhập: ");
        System.out.print("\nHieu max min: "+max(a,n)+"-"+min(a,n)+"="+tinhHieumaxmin(a,n));
        System.out.print("\nTong lon nhat cua 2 gia tri lien tiep: "+tong2solonnhat(a,n));
        tbcSonguyento(a,n); 
        tbcSodoixung(a,n);
        tongLonhon10(a,n);
    }         
public static void main(String[] args){
        Mang a= new Mang();
        a.nhapMang();
        a.output();
    }   
}
