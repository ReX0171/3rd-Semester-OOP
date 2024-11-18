/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testemployee;

/**
 *
 * @author PMYLS
 */
public class Testemployee {
    
        public static void main(String[] args){    
    
     Employee e1=new Employee("Waseef","Ullah",128,75000.0);
     
     System.out.println(e1.getFirst_Name()+e1.getLast_Name());
     
     
     Employee e2=new Employee("Rehan","Khan",143,80000.0);
        
     e1.print_info();
     
     e1.comparesalaries(e2);
     
     e1.giveraise(20);
     
     e2.giveraise(20);
     
     e1.comparesalaries(e2);
    
             
        } 
}
