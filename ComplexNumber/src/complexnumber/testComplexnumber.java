/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package complexnumber;

/**
 *
 * @author PMYLS
 */
public class testComplexnumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ComplexNumber c1=new ComplexNumber(4,6);
    ComplexNumber c2=new ComplexNumber(12,7);
    System.out.println(c1);
    System.out.println("Addition Result:"+c1.add(c2));
    System.out.println("Multiplication Result:" +c1.multiply(c2));
    ComplexNumber c4=new ComplexNumber(5,4);
    System.out.println("Conjugate Result: "+c4.conjugate());
    
    }
    
}
