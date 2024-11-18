/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcircle;

/**
 *
 * @author PMYLS
 */
/**
 * 
 *  Problem: Create a Circle class with a private data member of radius.
 *  Make two methods getArea() and getCircumference() inside this class.
    Area= pi * r * r;
    Circumference: 2 * pi * 2;
    Also create getter and setter function for radius.
*   Create multiple object of class circle and test member functions.
 */

public class Circle {
    
    private double radius;
  
    public void set_radius(double radius)
    {
      this.radius=radius;  
    }
    public double get_Radius(){
        return this.radius;
    }
    
    
      
    public double get_area(){
        float pi=314;
        return 2*pi*radius*radius;
    }
    public double getcircumference(){
        double pi=3.14;
        return 2*pi*radius;
    }
   
    
}
