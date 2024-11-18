/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testdistance;

/**Create a class ― Distance‖ with two constructors (no argument, and two argument), two data members (feet and inches) . 
 * Create setter, getter and display method.
 * Create a method that adds two Distance Objects and returns the added Distance Object.
 *
 *
 */
public class Distance {
    private int feet;
    private int inches;
    
    public Distance()
    {
        this.feet=0;
        this.inches=0;
    }
    @Override
    public String toString()
    {
        return this.feet+"feet "+"\t"+this.inches+"inches";
    }
    public Distance(int f,int i)
    {
        this.feet=f;
        this.inches=i;
    }

    public double getFeet() {
        return feet;
    }
    
    public void setFeet(int ft) {
        this.feet = ft;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inc) {
        this.inches = inc;
    }
    
    public void display()
    {
        System.out.printf("Feets=%d\tInches=%d\n",this.feet,this.inches);
    }
    
    public Distance  addDistance(Distance other)//1feet=12inch.
    {
        int temp=this.inches+other.inches; //e.g:11+10=21 temp=21
        int efeet=temp/12; //efeet=1
        int newinches=temp%12; //21%12=9
        
        int  newfeet=this.feet+other.feet+efeet;        
        Distance added_distance=new Distance(newfeet,newinches);
        return added_distance; 
        
    }

}
