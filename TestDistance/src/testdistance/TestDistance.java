/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testdistance;

/**
 *
 * @author PMYLS
 */
public class TestDistance {

    /**
     * 
     * @param args
     */
   public static void main(String[] args) {
        
        Distance d1 = new Distance(5, 11);  
        Distance d2 = new Distance(3, 10);  

        System.out.println("Distance 1:");
        d1.display();
        System.out.println("Distance 2:");
        d2.display();

        Distance d3 = d1.addDistance(d2);
        System.out.println("Added Distance:");
        d3.display();
    }
}

