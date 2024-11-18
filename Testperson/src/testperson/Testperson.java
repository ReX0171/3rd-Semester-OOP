/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testperson;

/**
 *
 * @author PMYLS
 */
public class Testperson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person1=new Person("WaseefUllah", 24);
        
        Person person2=new Person("Rehan", 28);
        
        person1.compareAges(person2);
        
    }
    
}
