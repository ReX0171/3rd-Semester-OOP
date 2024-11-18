/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testtimee;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestTimee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        // TODO code application logic here
        int h,m,s;
        
        Time t1=new Time();
        t1.printTime();
    
        System.out.printf("Enter Hours....");
        h=input.nextInt();
        System.out.printf("Enter Mins....");
        m=input.nextInt();
        System.out.printf("Enter Secs....");
        s=input.nextInt();
        
        //Time t2=new Time(13,55,59);
        Time t2=new Time(h,m,s);
        t2.printTime();
        
        Time t3=new Time(22);
        t3.printTime();
        
        Time t4=new Time(23,23);
        t4.printTime();
    }
    
}