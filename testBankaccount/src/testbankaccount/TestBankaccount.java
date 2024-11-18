/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testbankaccount;

/**
 *
 * @author PMYLS
 */
import java.util.Scanner;
public class TestBankaccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
       Bankaccount B1=new Bankaccount("Waseef Ullah","1234", 2000.0);
       Bankaccount B2=new Bankaccount("Rehan Khan","4567", 1000.0);     
       B1.print_welcome_info();
       B1.deeposit(500.0);
       B1.transfer(B2, 500.0);     
       B2.print_welcome_info();
       B2.withdraw(400.0);   
       
       Scanner input=new Scanner(System.in);
       
        System.out.println("Enter the account title.\n");
        String str=input.nextLine();
        System.out.println("Enter the account Number.\n");
        String str2=input.nextLine();
        System.out.println("Enter the account Balance.\n");
        double b=input.nextDouble();
        
        
        Bankaccount B3=new Bankaccount(str,str2,b);
        B3.print_info();
        System.out.println("\nEnter the amount to be deposited in the account.\n");
        double amount=input.nextDouble();
        B3.deeposit(amount);
    }
    
}
