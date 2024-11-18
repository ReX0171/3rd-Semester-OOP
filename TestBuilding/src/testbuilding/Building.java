/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbuilding;

/**Problem Create a class building that has the public member floors,area,
 * and occupants and a method areaperperson()respectively that display the area 
 * per person for building.
 * In the main() method create two instance of building called house and office and display 
 * the area per person by division of area/occupants. 
 *
 * 
 */
public class Building {
    private int floors;
    private int area;
    private int occupants;
    
    public int areaperpersons(){
        return this.area/this.occupants;
    }
    
    
    
}
