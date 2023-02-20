/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS311X_NGUYENHONGPHAP.LEC15;

/**
 *
 * @author PHAP
 */
public class Cylinder extends Circle{
    private double height;
    public Cylinder(){
        super();
        height=0;
    }
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea() {
        return 2*super.getArea()+super.getCircumn()*height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    public String toString(){
        return "Cylinder , r="+getRadius()+" ,h="+height+" , Stp="+ getArea()+" ,V="+getVolume();
    }
    public static void main(String[] args) {
        Cylinder a=new Cylinder(2,3);
        System.out.println(a);
    }
}
