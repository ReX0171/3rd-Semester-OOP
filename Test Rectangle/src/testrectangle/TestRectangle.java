/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testrectangle;

/**
 *
 * @author PMYLS
 */
public class TestRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application 
        
        Rectangle rec1=new Rectangle(3.9,1.4);
        Rectangle rec2=new Rectangle(50.0,12.1);
        rec1.compareAreas(rec2);
        
        rec1.Print_info();
    }
    
}
