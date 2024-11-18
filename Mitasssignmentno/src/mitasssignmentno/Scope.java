/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mitasssignmentno;

/**
 *
 * @author PMYLS
 */
public class Scope {
    public static void value(int x){
        if(x>5){
                System.out.println("This numbeer is greater than 5.="+x);
        }
        else if(x==5){
                System.out.println("The number is  equal to 5. "+x);
    }
        else{
                System.out.println("The number is less than 5");
                }
    }
    public static void main(String[] args){
        value(5);
        value(6);
        value(4);
    }
}
