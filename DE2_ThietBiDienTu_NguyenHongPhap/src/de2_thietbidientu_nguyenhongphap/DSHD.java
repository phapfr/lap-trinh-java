/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2_thietbidientu_nguyenhongphap;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PHAP
 */
public class DSHD {

    private ArrayList<HoaDon> a = new ArrayList<HoaDon>();

    public void docFile(String tenFile) {
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    
                }
            }else System.out.println("File ko ton tai");
        } catch (Exception e) {
        }
    }

    public void xuat(String nd) {
        System.out.println(nd);
        for (HoaDon x : a) {
            System.out.println(x);
        }
    }

    public void output() {
        xuat("DSHD");
    }

    public static void main(String[] args) {
        DSHD a = new DSHD();
        a.docFile("");
        a.output();
    }
}