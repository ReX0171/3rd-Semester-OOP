/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teststudent;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PMYLS
 */
public class Student {
    private String stdName;
    private String stdRegNo;
    private ArrayList<Subject> sublist=new ArrayList<Subject>();
    Scanner input=new Scanner(System.in);
    
    public Student(String sn, String srn)
    {
     this.stdName=sn;
     this.stdRegNo=srn;
     
    }
    
    public void addsub()
    {
        System.out.println("Enter Subject Name.........");
        String sn=input.nextLine();
        System.out.println("Enter Subject Code ............");
        String sc=input.nextLine();
        System.out.println("Enter Subjec Gpa..........");
        double gpa=input.nextDouble();
        input.nextLine();
        Subject obj=new Subject(sn,sc,gpa);
        this.sublist.add(obj);
        
    }
   @Override
   public String toString()
   {
        String sd="";
        for(int i=0;i<sublist.size();i++)
        {
            sd+=sublist.get(i);
        
    }
        
        
       return String.format("%s %s Subject:\n %s",this.stdName,this.stdRegNo,sd);
    }
   
   
    
}
