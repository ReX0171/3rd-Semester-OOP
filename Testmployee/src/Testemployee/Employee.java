/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testemployee;

/**
 *
 * @author PMYLS
 */
public class Employee {
    private String First_Name;
    private String Last_Name;
    private int id;
    private double Salary;

        public Employee() {
        this.First_Name = "Unkown";
        this.Last_Name = "Unknown";
        this.id = 0;
        this.Salary = 0.0;
    }

    public Employee(String fn,String ln, int ID, double Sal) {
        this.First_Name = fn;
        this.Last_Name = ln;
        this.id = ID;
        this.Salary = Sal;
    }
    
    public Employee(Employee anotheremployee)
    {
        this.First_Name=anotheremployee.First_Name;
         this.Last_Name=anotheremployee.Last_Name;
         this.Salary=anotheremployee.Salary;
         this.id=anotheremployee.id;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String fn) {
        this.First_Name = fn;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String ln) {
        this.Last_Name = ln;
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double sal) {
        this.Salary = sal;
    }
    
    public void giveraise(double percentage)      
    {
        System.out.printf("\n-------------\nCurrent Salary of %s %s: %.2f \n",this.First_Name,this.Last_Name,this.Salary);
        System.out.printf("Raise Percentage : %.2f\n",percentage);
        
        double per=this.Salary/100*percentage;
        double raise=per+this.Salary;
        this.Salary=raise;
        System.out.printf("Salary after raise is %.2f.\n----------------\n",this.Salary);
    }    
    
    public void comparesalaries(Employee anotheremployee)
    {
        if(this.Salary>anotheremployee.Salary)
        {
            System.out.printf("The salary of employee %s %s is greater than %s %s.\n",this.First_Name,this.Last_Name,anotheremployee.First_Name,anotheremployee.Last_Name);
        }
        else
        {
         System.out.printf("The salary of employee %s %s is less than %s %s.\n",this.First_Name,this.Last_Name,anotheremployee.First_Name,anotheremployee.Last_Name);   
        }
    }
    public void print_info()
    {
        System.out.printf("\nFirst Name: %s \t Last Name:%s\t Employee Id:%d\t Employee Salary:%.2f\n",this.First_Name,this.Last_Name,this.id,this.Salary);   
    }
    
    
    
}
