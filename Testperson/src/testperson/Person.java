/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testperson;

/**
 *
        Create a Person class with two private attributes: name and age.
*       The constructor initializes these attributes when creating a Person object. 
*       The compareAge method takes another Person object (otherPerson) as an argument and compares their ages, 
*       printing out the result.
•	Create two Person objects, person1 and person2, with different names and ages.
•	Call the compareAge method on person1 and pass person2 as an argument to compare their ages.
•	The method compares the ages and prints a message indicating whether person1 is younger,
*       older, or of the same age as person2.
 * 
 */
public class Person{
    private String name;
    private int age;
    
    public  Person(String n, int a)
    {
        this.name=n;
        this.age=a;
    }
    
    public void compareAges(Person otherperson)//da method person 2 as an argument alei da main class na ao mong
                                               //method call karhay da person 1 obj na no dekei duarha mong compare kao.
    {
        if(this.age>otherperson.age)
        {
            System.out.println("The person 1 is older than persson 2.");
        }
        else
        {
            System.out.println("The person 2 is older than person 1");
        }
    }
    
}
