/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this dlate
 */
package CS311X_NGUYENHONGPHAP.LEC11;

/**
 *
 * @author PHAP
 */
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MangHinhTron {
    private ArrayList<HinhTron> a = new ArrayList<HinhTron>();
    void docFile(String tenFile) {
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    DiemOxy tam = new DiemOxy();
                    double bankinh;
                    Scanner line = new Scanner(read.nextLine());
                    tam.setOx(line.nextInt());
                    tam.setOy(line.nextInt());
                    bankinh = line.nextDouble();
                    HinhTron x = new HinhTron(tam, bankinh);
                    a.add(x);
                }
            } else {
                System.out.println("khong ton tai file");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void maxDienTich() {
        double max = a.get(0).dientich();
        int x = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).dientich() > max) {
                max = a.get(i).dientich();
                x = i;
            }
        }
        System.out.println("b hinh tron co dien tich lon nhat: " + a.get(x) + " dien tich=" + a.get(x).dientich());
    }

    void lietke() {
        DiemOxy d = new DiemOxy();
        int x = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("e nhap goc phan tu can liet ke: ");
            x = sc.nextInt();
        } while (x < 1 || x > 4);
        switch (x) {
            case 1: {
                System.out.println("goc phan tu 1");
                for (int i = 0; i < a.size(); i++) {
                    d = a.get(i).getTam();
                    if (d.getOx() >= 0 && d.getOy() >= 0) 
                        System.out.println(a.get(i));
                }
                break;
            }
            case 2: {
                System.out.println(" goc phan tu 2");
                for (int i = 0; i < a.size(); i++) {
                    d = a.get(i).getTam();
                    if (d.getOx() <= 0 && d.getOy() >= 0) 
                        System.out.println(a.get(i));
                }
                break;
            }
            case 3: {
                System.out.println(" goc phan tu 3");
                for (int i = 0; i < a.size(); i++) {
                    d = a.get(i).getTam();
                    if (d.getOx() <= 0 && d.getOy() <= 0) 
                        System.out.println(a.get(i));
                }
                break;
            }
            case 4: {
                System.out.println("4 goc phan tu 4");
                for (int i = 0; i < a.size(); i++) {
                    d = a.get(i).getTam();
                    if (d.getOx() >= 0 && d.getOy() <= 0)
                        System.out.println(a.get(i));
                }
                break;
            }
        }
    }

    void loai() {
        DiemOxy d = new DiemOxy();
        int x = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("e nhap goc phan tu can loai: ");
            x = sc.nextInt();
        } while (x < 1 || x > 4);
        switch (x) {
            case 1: {
                System.out.println("goc phan tu 1");
                for (int i = 0; i < a.size(); i++) {
                    d = a.get(i).getTam();
                    if (d.getOx() >= 0 && d.getOy() >= 0) {
                        a.remove(a.get(i));
                        i--;
                    }
                }
                break;
            }
            case 2: {
                System.out.println(" goc phan tu 2");
                for (int i = 0; i < a.size(); i++) {
                    d = a.get(i).getTam();
                    if (d.getOx() <= 0 && d.getOy() >= 0) {
                        a.remove(a.get(i));
                        i--;
                    }
                }
                break;
            }
            case 3: {
                System.out.println(" goc phan tu 3");
                for (int i = 0; i < a.size(); i++) {
                    d = a.get(i).getTam();
                    if (d.getOx() <= 0 && d.getOy() <= 0) {
                        a.remove(a.get(i));
                        i--;
                    }
                }
                break;
            }
            case 4: {
                System.out.println("4 goc phan tu 4");
                for (int i = 0; i < a.size(); i++) {
                    d = a.get(i).getTam();
                    if (d.getOx() >= 0 && d.getOy() <= 0) {
                        a.remove(a.get(i));
                        i--;
                    }
                }
                break;
            }
        }
        xuatMang("mang sau khi loai: ");
    }

    void sapxep() {
        HinhTron x;
        for (int i = 0; i < a.size(); i++)
            for (int j = i + 1; j < a.size(); j++)
                if (a.get(i).dientich() < a.get(j).dientich()) {
                    x = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, x);
                }
        xuatMang("f mang sau khi loai sap xep:");
    }

    void xuatMang(String nd) {
        System.out.println(nd);
        for (HinhTron x : a) 
            System.out.print(x + "\n");
        System.out.println();
    }

    void output() {
        xuatMang("Mang hinh tron:");
        maxDienTich();
        lietke();
        loai();
        sapxep();
    }

    public static void main(String[] args) {
        MangHinhTron a = new MangHinhTron();
        a.docFile("HT.txt");
        a.output();
    }
}
