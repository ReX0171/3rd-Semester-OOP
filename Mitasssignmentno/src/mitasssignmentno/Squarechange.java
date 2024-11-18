/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitasssignmentno;

/**
 *
 * @author PMYLS
 */
public class Squarechange {
    public static void square(int x){
        System.out.println("The value of x in square without changing anything = "+x);
        x=x*x;
        System.out.println("The value of x in square after changing it in the method = "+x);
    }
    public static void main(String[] args){
        int x=5;
        System.out.println("The value of x in main method = "+x);
        square(x);
         System.out.println("The value of x in main method after calling the method square = "+x);
    }
}
