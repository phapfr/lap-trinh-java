/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC15;

/**
 *
 * @author PHAP
 */
public class Test0 {
    public static void main(String[] args) {
       Circle a=new Circle(1);
        System.out.println("a="+a);
        System.out.println(a instanceof Circle); //=>true
        System.out.println(a instanceof Cylinder); //=>true
        Cylinder b=new Cylinder(2,3);
        System.out.println("b="+b);
        a=b; //cha = con
        System.out.println("a="+a);
        // b=a; lỗi
        a=new Cylinder(3,5);
        System.out.println("a="+a);
        System.out.println(a instanceof Circle); //=>true
        System.out.println(a instanceof Cylinder); //=>true
        // obj instanceof class => true, false
    }
}
