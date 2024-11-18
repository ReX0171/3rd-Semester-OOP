/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testresultcard;

/**Data Members:
description: Subject name (e.g., Mathematics).
totalMarks: Maximum marks.
obtainedMarks: Marks obtained.
Functionalities:
Parametrized_Constructor() 
Display Subject Details: Show subject information.
Calculate Grade: Assign grade based on performance.
 *
 * 
 */
public class Subject {
    private String SubjectName;
    private int totalmarks;
    private double obtainedmarks;
    
    
    public Subject(String s,int tm,double om)
    {
        this.SubjectName=s;
        this.totalmarks=tm;
        this.obtainedmarks=om;
    }

    public int getTotalmarks() {
        return totalmarks;
    }

    public double getObtainedmarks() {
        return obtainedmarks;
    }
    public void display()
    {
        System.out.printf("\n----------------- Welcome To the Subject Portion------------------\n");
        System.out.printf("%-15s %-15s %-15s  \n", "Subject", "Total Marks", "Obtained Marks");
        System.out.printf("%-15s %-15d %-15.2f \n", this.SubjectName, this.totalmarks, this.obtainedmarks);
    }
    public String calculateGrade()
    {
        double percentage=this.obtainedmarks/this.totalmarks*100;
        if(percentage>80)
        {
            return "A1";
        }
        else if(percentage>70 && percentage<80)
        {
            return "A";
        }
        else if(percentage>60 && percentage<70)
        {
            return "B";
        }
        else if(percentage>50 && percentage<60)
        {
            return "C";
        }
        else if(percentage>40 && percentage<50)
        {
            return "D";
        }    
            else
        {
            return "F";
        }
             
    }
    
  
    
}
