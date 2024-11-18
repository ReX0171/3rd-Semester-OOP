/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testrectangle;

/**
 *
 * @author PMYLS
 */
public class Rectangle {
    
    private double length;
    private double width;
    public Rectangle()
    {
        this.length=1.0;
        this.width=1.0;
    }
    public Rectangle(double l,double w)
    {
        this.length=l;
        this.width=w;
    }
    public Rectangle(Rectangle otherrectangle)
    {
        this.length=otherrectangle.length;
        this.width=otherrectangle.width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double calculatearea()
    {
        return this.length*this.width;
    }
    
    public double calculateperimeter()
    {
        return 2*this.length+2*this.width;
    }
    
    //	A method compareAreas(Rectangle otherRectangle) that compares 
    //the area of the current rectangle with another rectangle and prints the result.
    public void compareAreas(Rectangle otherRectangle)
    {
        if(this.calculatearea()>otherRectangle.calculatearea())
        {
            System.out.println("Rectangle 1 is greater than rectangle 2 in regard of area.\n");
        }
        else
        {
            System.out.println("Rectangle 2 is greater than rectangle 1 in regard of area.\n");
        }  
    }
    public void Print_info()
    {
        System.out.printf("The area of the rectangle is %.2f.\n",this.calculatearea());   
        System.out.printf("The perimeter of the rectangle is %.2f.\n",this.calculateperimeter());  
        
    }
}
