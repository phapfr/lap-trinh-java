/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC15;

/**
 *
 * @author PHAP
 */
public class Circle {
    private double radius;
    public Circle(){
        radius=0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumn(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "Circle r="+radius+" ,P="+
                getCircumn()+" ,S="+getArea();
    }
    public static void main(String[] args) {
        Circle a=new Circle(1);
        System.out.println(a);
    }
}
