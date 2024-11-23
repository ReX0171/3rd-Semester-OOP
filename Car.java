/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcar2;

/***Create a class of type Car having following instance variables:
	carName of type String
	fuelCapacity of type double
	fuelLevel of type double
	avgConsumption of type double
	fuelPricePerLiter (it should be static) of type double
 *
 *      Create following member functions of the class:
	setPricePerLiter(): It is a static method that will set the value of fuelPricePerLiter static member.
	Parametrized construction: This constructor will initialize all the data members of object except 
*       fuelPricePerLiter.
	addFuel(): This function will full the tank of car by considering the fuelLevel  and fuelCapacity,
*       and print the information of added fuel in litters and total price.
	addFuel(int): This function will fill the tank on the basis of value given by user by considering
*       the fuelLevel and fuelCapacity, and print the information of added fuel in litters and total price.
*       If the input value is invalid, then appropriate message will be displayed.
*       
*       expectedCoverage(): This function will print the expected coverage by considering the fuelLevel and avgConsumption. 
        Create a test class and check the functionalities of the Car class.
 * 
 */
public class Car {
    private String carName;
    private double fuelLevel;
    private double fuelCapacityl;
    private double avgConsumption;
    private static double fuelPriceperLiter;
    
    public static double setPriceperLiter(double pl){
       return fuelPriceperLiter=pl;
    }
    
    public Car(String cn,double fl,double fc,double ac){
        this.carName=cn;
        this.fuelLevel=fl;
        this.fuelCapacityl=fc;
        this.avgConsumption=ac;
    }
    //addFuel(): This function will full the tank of car by considering the fuelLevel  and fuelCapacity,
    //    and print the information of added fuel in litters and total price.
    public void addfuel(double amt)
    {
        
            if((this.fuelLevel+=amt)<this.fuelCapacityl || (this.fuelLevel+=amt)==this.fuelCapacityl){
                System.out.println("Fuel added Succesfullly");
                System.out.printf("Fuel amount: %.2fLitres\n",this.fuelLevel);
                System.out.printf("Total Amount to be paid : %.2f",Car.fuelPriceperLiter*amt);
            }      
            else{
            System.out.println("Fuel is full  cant put more fuel.");
            }
    }
    
//    @Override
//    public String toString()
//    {
//        String.format("Car Name: %S  Car Fuel Level: %S   Car Fuel Capacity: %S   Car avg Consumption: %S",this.carName,this.fuelLevel,this.fuelCapacityl,this.avgConsumption);
//        
//    }
    
    public void avgCoverage()
    {
      double c=this.fuelLevel*this.avgConsumption;
      System.out.printf("\nTotal coverage of the %s is %.2fkm.",this.carName,c);  
    }
    
    

    
}
