/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circle2;

/**
 *
 * @author PMYLS
 */
public class Circle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.setradius(10);
        System.out.println("The Radius of circle is :"+c1.getradius());
        System.out.println("The area is of circle is :"+c1.getArea());
        System.out.println("The circumference is :"+c1.getcircumference());
    }
    
}
