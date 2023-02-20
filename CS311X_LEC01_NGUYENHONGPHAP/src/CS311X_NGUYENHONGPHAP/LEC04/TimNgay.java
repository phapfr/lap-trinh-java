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
public class TimNgay {
    int d1,m1,y1,d2,m2,y2;
    void input(){
        Scanner kb=new Scanner(System.in);
        System.out.print("Tim ngay tiep theo\nNhap ngay (h m s) :");
        d1=kb.nextInt();
        m1=kb.nextInt();
        y1=kb.nextInt();
    }
    void xuLy(){
        int dmax=0;
        if(m1==1||m1==3||m1==5||m1==7||m1==8||m1==10||m1==12)
            dmax=31;
        else if(m1==4||m1==6||m1==9||m1==11)
            dmax=30;
        else if(y1%4==0 && y1%100!=0) //nam nhuan
            dmax=29;
        else dmax=28;
        m2=m1; y2=y1;
        if(d1<dmax) d2=d1+1;
        else{
            d2=1;
            if(m1==12){
                m2=1;
                y2++;
            }else m2++;
        }
    }
    void ouput(){
        xuLy();
        System.out.println("Ngay tiep sau ngay :"+d1+"/"+m1+"/"+y1+" ==> "+d2+"/"+m2+"/"+y2);
    }
    public static void main(String[] args) {
        TimNgay a=new TimNgay();
        a.input();
        a.ouput();
    }
}
