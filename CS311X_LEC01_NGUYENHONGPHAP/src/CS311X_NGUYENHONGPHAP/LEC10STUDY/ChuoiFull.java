/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC10STUDY;

import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class ChuoiFull {
    String st;
    void input(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Nhap chuoi van ban: ");
        st = kb.nextLine();
    }
    int demTu(String s){
        int dem=0;
        if(s.charAt(0) != ' ') dem=1;
        for (int i = 1; i < s.length(); i++) 
            if (s.charAt(i)!=' '&&s.charAt(i-1)==' ') 
                dem++;
        return dem;
    }
    int demKyTuSo(String s){
        int dem=0;
        for (int i = 0; i < s.length(); i++) 
            if (s.charAt(i)>='0' && s.charAt(i)<='9') 
                dem++;
        return dem;
    }
    int demKyTuTrang(String s){
        int dem=0;
        for (int i = 0; i < s.length(); i++) 
            if (s.charAt(i)==' ') 
                dem++;
        return dem;
    }
    int demKyTuTA(String s){
        int dem=0;
        for (int i = 0; i < s.length(); i++) 
            if ((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122))
                dem++;
        return dem;
    }
    
    void output(){
        System.out.println("chuoi :"+st+": co "+demTu(st)+" tu");
        System.out.println("chuoi :"+st+": co "+demKyTuSo(st)+" so");
        System.out.println("chuoi :"+st+": co "+demKyTuTrang(st)+" ky tu trang");
        System.out.println("chuoi :"+st+": co "+demKyTuTA(st)+" ky tu tieng anh");
        
//        Count();
    }
    public static void main(String[] args) {
        ChuoiFull a=new ChuoiFull();
        a.input();
        a.output();
    }
}
/*void Count() {
        int s_kta = 0, s_ktt = 0, s_kts = 0, s_ktdb = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' ')
                s_ktt++;
            if (st.charAt(i) >= 48 && st.charAt(i) <= 57) 
                s_kts++;
            if ((st.charAt(i) >= 65 && st.charAt(i) <= 90) || (st.charAt(i) >= 97 && st.charAt(i) <= 122)) 
                s_kta++;
        }
        s_ktdb = (st.length() - s_kta - s_ktt - s_kts);
        System.out.println("so ky tu cua chuoi: " + st.length() 
                + "\nso ky tu alphabe: " + s_kta 
                + "\nso ky tu so:" + s_kts 
                + "\nso ky tu trang: " + s_ktt 
                + "\nso ky tu dac biet: " + s_ktdb);
    }*/
