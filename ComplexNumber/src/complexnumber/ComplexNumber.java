/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package complexnumber;

/**
 *      Create a ComplexNumber class with the following functionalities:
	A no-parameter constructor that initializes the complex number to 0 + 0i.
	A parameterized constructor that accepts real and imaginary parts as arguments.
	A copy constructor that duplicates another ComplexNumber object.
	Setter and getter methods for the real and imaginary parts.
	A method add(ComplexNumber other) that adds another complex number to the current complex number and returns
*       a new ComplexNumber object with the result.
	A method multiply(ComplexNumber other) that multiplies another complex number with the current complex number 
*       and returns a new ComplexNumber object with the result.
	A method conjugate() that returns the conjugate of the current complex number as a new ComplexNumber object.

 * 
 */
public class ComplexNumber {
    private double real_part;
    private double imaginary_part;

   
    
     @Override
    public String toString() {
        if (imaginary_part >= 0) {
            return real_part + " + " + imaginary_part + "i";
        } else {
            return real_part + " - " + (-imaginary_part) + "i";
        }
    }
    
   public  ComplexNumber()
   {
       this.real_part=0;
       this.imaginary_part=0;
   }
   public ComplexNumber(double rp,double ip)
   {
       this.real_part=rp;
       this.imaginary_part=ip;
   }
   public ComplexNumber(ComplexNumber other)
   {
       this.real_part=other.real_part;
       this.imaginary_part=other.imaginary_part;
   }
   public void set_rp(double rp)
   {
       this.real_part=rp;
   }
   public void set_ip(double ip)
   {
       this.imaginary_part=ip;
   }
   public double get_rp()
   {
       return this.real_part;
   }
   public double get_ip()
   {
       return this.imaginary_part;
   }
   
    public ComplexNumber add(ComplexNumber other) {
    
        double rp=this.real_part+other.real_part;
        double ip=this.imaginary_part+other.imaginary_part;
        ComplexNumber temp=new ComplexNumber(rp,ip);
        return temp;
        }
    
    public ComplexNumber multiply(ComplexNumber other) {//formula for Complex Number Multiplication (a + ib) (c + id).
        double rp=this.real_part*other.real_part-this.imaginary_part*other.imaginary_part;
        double ip=this.real_part*other.imaginary_part+this.imaginary_part*other.real_part;
        return new ComplexNumber(rp,ip);
    }
      
      
    public ComplexNumber conjugate() {
        
        return new ComplexNumber(this.real_part, -this.imaginary_part);
    }
    
    
}



   

