/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testdate2;

/**Create a class called Date that includes three pieces of information as instance variables—a month (type int),
 * a day (type int) and a year (type int). Your class should have a constructor that initializes the three instance
 * variables and assumes that the values provided are correct. Provide a set and a get method for each instance variable. 
 * Provide a method displayDate that displays the month, day and year separated by forward slashes (/).
 * Write a test application named DateTest that demonstrates class Date’s capabilities.
 *
 * 
 */
public class Date {
    private int month;
    private int day;
    private int year;
    
     public Date(){
        this.day=00;
        this.month=00;
        this.year=00;
    }
     
    public Date(int d,int m,int y){
        this.day=d;
        this.month=m;
        this.year=y;
    }
    
    public void setday(int d)
    {
        this.day=d;
    }
    public void setmonth(int m)
    {
        this.month=m;
    }
    public void setyear(int y)
    {
        this.year=y;
    }
    
    public int getday()
    {
        return this.day;
    }
    public int getmonth()
    {
        return this.month;
    }
    public int getyear()
    {
        return this.year;
    }
    // Provide a method displayDate that displays the month, day and year separated by forward slashes (/).
    
    public void displaydate()
    {
        System.out.printf("%d / %d / %d",this.day,this.month,this.year);
    }
    
    
}
