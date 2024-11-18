/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circle2;

/**Problem: Create a Circle class with a private data member of radius. Make two methods getArea() and 
 * getCircumference() inside this class.
    Area= pi * r * r;
    Circumference: 2 * pi * 2;
    Also create getter and setter function for radius. Create multiple object
    of class circle and test member functions
 *
 * 
 */
public class Circle {
    private double radius;
    private double pi=3.14;
    
    
    public void setradius(int r)
    {
    this.radius=r;
    }
    public double getradius()
    {
        return this.radius;
    }
    
    public double getArea()
    {
        return pi*this.radius*radius;
    }
    public double getcircumference()
    {
       return 2*pi*2; 
    }
    
}
