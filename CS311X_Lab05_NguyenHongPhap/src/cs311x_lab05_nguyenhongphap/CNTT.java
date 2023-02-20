/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs311x_lab05_nguyenhongphap;

/**
 *
 * @author PHAP
 */
public class CNTT extends SV{
    private double java, css, html;

    public CNTT() {
    }

    public CNTT(double java, double css, double html, String ma, String hoTen, boolean gioiTinh) {
        super(ma, hoTen, gioiTinh);
        this.java = java;
        this.css = css;
        this.html = html;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    @Override
    public double tinhDTB() {
        return (java*2+css+html)/4;
    }
    @Override
    public String toString() {
        return "CNTT{" + super.toString()+" " + java + " " + css + " " + html + '}';
    }
    public static void main(String[] args) {
       CNTT a= new CNTT(9, 8, 9, "001", "Phap", true);
        System.out.println(a);
    }
}
