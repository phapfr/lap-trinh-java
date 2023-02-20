/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC11;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class MangDiem {
    private ArrayList<DiemOxy> a=new ArrayList<DiemOxy>();
    void docFile(String tenFile){   
        try{
            File f=new File(tenFile);
            if(f.exists()){
                Scanner read=new Scanner(f);
                while (read.hasNext()) {
                    Scanner line=new Scanner(read.nextLine()); //đọc 1 dòng
                    // đọc dữ liệu trên 1 dòng
                    int x=line.nextInt();
                    int y=line.nextInt();
                    a.add(new DiemOxy(x,y));
                }
            }else System.out.println(" Khong ton tai file");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    void xuatMangDiem(String noiDung){
        System.out.print(noiDung);
        for(DiemOxy x: a)
            System.out.print(x);
        System.out.println("");
    }
    public DiemOxy xaTamNhat(){
        DiemOxy x =a.get(0);
        for(int i=0;i<a.size();i++)
            if(x.modul()<a.get(i).modul()) 
                x=a.get(i);
        return x;
    }
    public void maxTamGiac(){
        DiemOxy x=a.get(0), y=a.get(1), z=a.get(2);
        TamGiac g=new TamGiac(x,y,z);
        for (int i=0; i<a.size()-2; i++)
            for (int j=i+1; j<a.size()-1; j++)
                for (int k=j+1; k<a.size(); k++){
                    TamGiac gl =new TamGiac(a.get(i),a.get(j),a.get(k));
                    if(g.getDienTich()<gl.getDienTich())
                        g=gl;
                }
        System.out.println("4. Tam giac co dien tich lon nhat: "+g.getA()+g.getB()+g.getC()+ " S = "+g.getDienTich());
    }
    void minHCN(){
        int maxOx=0 ,maxOy=0, minOx =0, minOy=0;
        for (int i=0;i<a.size();i++){
            if (maxOx<a.get(i).getOx())
                maxOx=a.get(i).getOx();
            if (maxOy<a.get(i).getOy())
                maxOy=a.get(i).getOy();
            if (minOx>a.get(i).getOx())
                minOx=a.get(i).getOx();
            if (minOy>a.get(i).getOy())
                minOy=a.get(i).getOy();
        }        
        DiemOxy d1=new DiemOxy(minOx,maxOy);
        DiemOxy d2=new DiemOxy(maxOx,minOy);
        System.out.println("HCN co cac canh song 2 truc chua tat ca cac diem: "+d1+"&"+d2);
    }
    void giamTheoOx(){
        DiemOxy x ;
        for (int i=0;i<a.size();i++)
            for (int j=i+1;j<a.size();j++)
                if (a.get(i).getOx()< a.get(j).getOx()){
                   x = a.get(i);
                   a.set(i,a.get(j));
                   a.set(j,x);
               }
        xuatMangDiem("Sap xep giam dan theo truc hoanh: "); 
    }
    /*public int minOx(){
        int x=a.get(0).getOx();
        for (int i = 1; i < a.size(); i++)
            if(x>a.get(i).getOx())
                x=a.get(i).getOx();
        return x;    
    }
    public int maxOx(){
        int x=a.get(0).getOx();
        for (int i = 1; i < a.size(); i++)
            if(x<a.get(i).getOx())
                x=a.get(i).getOx();
        return x;    
    }
    public int minOy(){
        int x=a.get(0).getOy();
        for (int i = 1; i < a.size(); i++)
            if(x>a.get(i).getOy())
                x=a.get(i).getOy();
        return x;    
    }
    public int maxOy(){
        int x=a.get(0).getOy();
        for (int i = 1; i < a.size(); i++)
            if(x<a.get(i).getOy())
                x=a.get(i).getOy();
        return x;    
    }*/
    /*public void input(){
        Scanner kb=new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap so diem >0: ");
            n=kb.nextInt();
        } while (n<=0);
        for(int i=1; i<=n; i++){
            System.out.print("Nhap diem thu "+i+" : ");
            int x=kb.nextInt();
            int y=kb.nextInt();
            a.add(new DiemOxy(x,y));
        }
    }*/
    
    /*public DiemOxy ganTamNhat(){
        DiemOxy x =a.get(0);
        for(int i=0; i<a.size(); i++)
            if(x.modul()>a.get(i).modul()) 
                x=a.get(i);
        return x;
    }*/
    
    
    /*void maxKhoangCach(){
        DiemOxy x=a.get(0), y=a.get(1);
        for (int i=0; i<a.size()-1; i++)
            for (int j=i+1;j<a.size();j++)
                if(x.khoangCach(y)<a.get(i).khoangCach(a.get(j))){
                    x=a.get(i); y=a.get(j);
                }
        System.out.println("3. 2 diem co khoang cach lon nhat: "+x+y+"->"+x.khoangCach(y));
    }*/
    
    
    
    void output(){        
        xuatMangDiem("Cac diem vua doc: ");
        //System.out.println("1. Diem gan tam nhat: "+ganTamNhat()+"="+ ganTamNhat().modul());
        System.out.println("2. Diem xa tam nhat: "+xaTamNhat()+"="+ xaTamNhat().modul());
        //maxKhoangCach();
        maxTamGiac();
        giamTheoOx();
        minHCN();
    }
    public static void main(String[] args) {
        MangDiem a=new MangDiem();
        a.docFile("C:\\Users\\phapn\\Downloads\\Lập Trình Hướng Đối Tượng\\Lập Trình Hướng Đối Tượng TXT\\Diem.txt");
        a.output();
    }
}
