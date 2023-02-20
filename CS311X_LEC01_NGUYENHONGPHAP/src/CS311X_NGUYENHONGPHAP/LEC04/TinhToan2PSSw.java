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
public class TinhToan2PSSw {
    double tu1, mau1, tu2, mau2;
    char pt;
    void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Tinh Toan Tren 2 Phan So");
        System.out.print("Nhap phan so 1:\n\tTu:");
        tu1 = kb.nextInt();
        System.out.print("\tMau<>0:");
        mau1 = kb.nextInt();
        System.out.print("Nhap phan so 2:\n\tTu:");
        tu2 = kb.nextInt();
        System.out.print("\tMau<>0:");
        mau2 = kb.nextInt();
        System.out.print("Nhap phep tinh(+,-,*,/): "); 
        pt=kb.next().charAt(0);
    }       
    void output(){
        switch(pt){
            case'+': System.out.println(tu1 +"/" +mau1 +"+" +tu2 +"/" +mau2 +"=" +(tu1*mau2+tu2*mau1) +"/"+(mau1*mau2));break;
            case'-': System.out.println(tu1 +"/" +mau1 +"-" +tu2 +"/" +mau2 +"=" +(tu1*mau2-tu2*mau1) +"/"+(mau1*mau2));break;
            case'*': System.out.println(tu1 +"/" +mau1 +"*" +tu2 +"/" +mau2 +"=" +(tu1*tu2) +"/"+(mau1*mau2));break;
            case '/':
                if(tu2==0) System.out.println("Khong chia cho 0");
                else System.out.println(tu1 +"/" +mau1 +"/" +tu2 +"/" +mau2 +"=" +(tu1*mau2) +"/"+(mau1*tu2));
                break;
            default: System.out.println("Khong phai phep toan");
        }
    }
    public static void main(String[] args){
        TinhToan2PSSw a = new TinhToan2PSSw();
        a.input();
        a.output();
    }
}
