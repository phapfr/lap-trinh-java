/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC07STUDY;

import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class LietKeSoDoiXung {
    int n;
    void input(){
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
        if(x>10 && daoSo(x)==x) return 1;
        return 0;
    }
    void output(){
        for(int i=1; i<=n; i++)
            if(doiXung(i)==1)
                System.out.printf(" %d ",i);
    }
    public static void main(String[] args) {
        LietKeSoDoiXung a = new LietKeSoDoiXung();
        a.input();
        a.output();
    }
}
