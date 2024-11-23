/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testcar2;

/**
 *
 * @author PMYLS
 */
public class TestCar2 {

    /**Create a class of type Car having following instance variables:
	carName of type String
	fuelCapacity of type double
	fuelLevel of type double
	avgConsumption of type double
	fuelPricePerLiter (it should be static) of type double

     * 
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Car.setPriceperLiter(200);
    
    Car Honda=new Car("Hondaa Civic",23.12,50,14);
    
    Honda.addfuel(26.87);
    
    Honda.avgCoverage();
    
    
    }
    
    
}
