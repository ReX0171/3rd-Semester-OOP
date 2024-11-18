/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package testcalculator;
import java.util.Scanner;
/**
 *
 * @author PMYLS
 */
import java.util.Scanner;
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator calculator=new Calculator();
        
        Scanner input=new Scanner(System.in);
        
        boolean keepgoing=true;
        
     
        while (keepgoing){
        System.out.println("Select an option from below");
        System.out.println("Select 1 for addition");
        System.out.println("Select 2 for subtraction");
        System.out.println("Select 3 for Multiplication");
        System.out.println("Select 4 for division");
        System.out.println("Select 5 to exit ");
        
        int choice=input.nextInt();
        if (choice==5){
            keepgoing=false;
            System.out.printf("Exiting Calculator\n");
            break;
        }
        
        System.out.println("Enter 1st Number:  ");
        int a=input.nextInt();
        System.out.println("Enter Num2");
        int b=input.nextInt();
        
        switch(choice){
            case 1:
            {
                calculator.add(a, b);
                break;
            }
            case 2:
            {
                calculator.subtract(a, b);
                break;
            }
            case 3:
            {
                calculator.Multiply(a, b);
                break;
            }  
           case 4:
            {
                calculator.Divison(a, b);
                break;
            } 
           default:
           {
               System.out.println("Please enter a valid choice");
           }
        }
        
    }
      
      
      
      
        
        
        
        
    }
    
}
