/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitasssignmentno;

/**
 *
 * @author PMYLS
 */
import java.util.Scanner;

public class Square_printing {
    public static void square(int x){
        System.out.println(x*x);
}
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int value=input.nextInt();
        square(value);
        
    }
}
