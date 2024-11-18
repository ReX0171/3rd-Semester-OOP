/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testtime2;

/**Problem: Create a Time class and initialize it with hours and minutes.
  Write setter and getter functions 
  Make a method displayTime which should print the time.
* Make a method DisplayMinute which should display the total minutes in the Time.
* E.g.- (1 hr 2 min) should display 62 minute
 *
 *
 */
public class Time{
    
    private int min;
    private int hours;
    private int seconds;
    
    
    public Time addtime(Time t)
    {
        int  s=this.seconds+t.seconds;
        int emin=s/60;
        s=s%60;
        
        int min=this.min+t.min+emin;
        int ehrs=min/60;
        min=min%60;
        
        int hrs=this.hours+t.hours+ehrs;
        int eday=hrs/24;
        hrs=hrs%24; 
        
        Time obj=new Time(s,min,hrs);
        return obj;
    }
    
    
    public Time()
    {
        this.hours=00;
        this.min=00;
    }
    public Time(int s,int m,int h)
    {
        this.seconds=s;
        this.min=m;
        this.hours=h;
    }
     
    
    public void sethour(int h)
    {
        this.hours=h;
    }
    public void setmin(int m)
    {
        this.min=m;
    }
    
    public void displayTime(){
        System.out.printf("%d : %d\n",this.hours,this.min);
    }
    
    public void Displayminute(){
        this.min=(this.hours*60)+this.min;
        System.out.printf("The total minutes are: %d minutes   \n",this.min);
    }
}
