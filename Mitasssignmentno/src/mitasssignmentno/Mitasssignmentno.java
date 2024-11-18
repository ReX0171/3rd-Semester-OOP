/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mitasssignmentno;

/**
 *
 * @author PMYLS
 */
public class Mitasssignmentno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a= -9.81; // Earth's gravity in m/s^2
        double vi = 0.0;
        double t = 10.0;
        double xi = 0.0;
        double x_t;
        x_t = 0.5 * a*t*t + vi + t + xi;
        System.out.println("The object's position after " + t +
        " seconds is " + x_t + " m.");
    }
    
}
