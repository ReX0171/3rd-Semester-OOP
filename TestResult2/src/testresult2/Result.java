/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testresult2;

import java.util.Scanner;

/**Write a class Result that contains roll no, name and marks of three subjects. 
 * The marks are stored in an array of integers. The class also contains the following member functions.
   The input() method is used to input values
   The show() method is used to display values
   The total() returns the total marks a student
   The avg() method returns the average marks of a student
 *
 * 
 */
public class Result {
    private int rollno;
    private String Name;
    private int[] marks=new int[3];
    
    Scanner input=new Scanner(System.in);
 
    public void inputmarks()
    {
        System.out.println("Input Marks of three subjects:\n");
        for(int i=0;i<3;i++)
        {
            marks[i]=input.nextInt();
        } 
    }
    
    public void show()
    {
        System.out.printf("The Marks of Student %s and roll number %d is :\n",this.Name,this.rollno);
        for(int i=0;i<3;i++)
        {
            System.out.println(marks[i]+"\t");
        } 
        
    }
    public double  total()
    {
        System.out.println("The total Marks are :\t");
        int totalmarks=0;
        for(int i=0;i<3;i++)
        {
          totalmarks+=this.marks[i];  
        } 
      return totalmarks;
    }
    
    public void avg()
    {
      double avg=0.0;
      
      avg=this.total()/300*100;
      
        System.out.printf("Thee average is :",avg);
    }   
}
