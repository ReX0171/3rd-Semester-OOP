/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass;

import abstractclass.CarBlueprint;

/**
 *
 * @author PMYLS
 */
public class Toyota extends CarBlueprint {
    
    @Override
    public void car_information(){
        super.car_information();
        System.out.println("Its a toyota ");
        System.out.println("It has a turbo twin v8 engine");
    }
    
    @Override
    public void car_functionalites(){
        System.out.println("CAR WILL GO FROM 1 TO 100 IN 6s");
        System.out.println("Car will be hybrid.");
        System.out.println("It will be a land cruiser");
    }
    
}
