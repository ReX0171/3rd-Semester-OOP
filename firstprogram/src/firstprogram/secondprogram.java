/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstprogram;

/**
 *
 * @author PMYLS
 */
import java.util.Scanner;  // Corrected import statement
public class secondprogram {
  // Capitalized class name
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number from 1 to 3:\n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 ->  {
                    System.out.println("You are in case 1.");
                }
                case 2 ->  {  // Corrected message to indicate case 2
                    System.out.println("You are in case 2.");
                }
                case 3 ->  {  // Corrected message to indicate case 3
                    System.out.println("You are in case 3.");
                }
                default -> System.out.println("You are in the default case.");
            }
            // Closing the scanner
        }
    }
}
