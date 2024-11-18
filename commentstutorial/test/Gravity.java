/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PMYLS
 */
import java.util.Scanner;
public class Gravity {
    public static void main(String[] args){
    //Compute the position of a falling object:
    //implement this in this code x(t) = 0.5 × at2 + vit+xi
    /*x(t): The position of the object at time 
a: The constant acceleration of the object.
t: The time elapsed.
vi : The initial velocity of the object (velocity at 
xi: The initial position of the object (position at */
 
   System.out.println("This equation will found out the position X(t) of an object at time t and acceleration a at velocity.");
   
   System.out.println("Enter acceleration of the object");        
   Scanner input=new Scanner(System.in);
   float a=input.nextFloat();
   System.out.println("Enter Time elapsed");
   float t=input.nextFloat();
   
   System.out.println("Enter initial Velocity");
   float vi=input.nextFloat();
   
   System.out.println("Enter initial Position");
   float xi=input.nextFloat();
   
   System.out.println("The final position is :");
   double x_t=0.5*a*t*t+vi*t+xi;
   System.out.println("The final position is :"+x_t);
   
   input.close();
    }
}
