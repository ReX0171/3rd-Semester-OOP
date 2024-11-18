/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package testcircle;

/**
 *
 * @author PMYLS
 */
import java.util.Scanner;
public class Testcircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // TODO code application logic here
        Circle circle1=new Circle();
        double x=input.nextDouble();
        
        
        circle1.set_radius(x);
        System.out.printf("The area of the circle is : %fl\n", circle1.get_area());
        System.out.printf("The Circumference of the circle is :%fl\n", circle1.getcircumference());
        
        
        Circle circle2=new Circle();
        
        System.out.println("Please enter the radius of the second circle");
        
        double y=input.nextDouble();
        circle2.set_radius(y);
        System.out.println("The details about circcle 2 is :");
        System.out.printf("The area of the circle 2 is : %fl\n", circle2.get_area());       
        System.out.printf("The Circumference of the circle 2 is :%fl\n", circle2.getcircumference());
                
    }
    
}
