/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcalculator;

/**
 *
 * Steps:
Accept user input for two numbers.
Prompt the user to choose an operation.
* option to chose between add,sub,multiply,division
* 
*  ...Addition
*    different parameters from user
*    
*  ...Subtraction
*  ...Multiplication
*  ...Division
*     if condition if division is not possible.
*  ...Taking Power
Perform the operation and display the result.
*/
public class Calculator {
    
    public void add(int a, int b){
        System.out.printf("The addition of %d and %d is %d. \n**********************\n",a,b,a+b); 
    }
     public void subtract(int a, int b){
        System.out.printf("The Subtraction of %d and %d is %d \n**********************\n",a,b,a-b); 
    }
    public void Multiply(int a, int b){
        System.out.printf("The Multiplication of %d and %d is %d \n**********************\n",a,b,a*b);
    }
    public void Divison(int a, int b){
        if(a>0)
        System.out.printf("The Division of %d and %d is %.2f. \n**********************\n",a,b,(float)a/b); 
        else
        {
            System.out.printf("Division not Possible.\n");
        }    
    }
}
     
     

