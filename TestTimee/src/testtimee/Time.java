/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testtimee;

/**
 *
 * @author Admin
 */
public class Time 
{
    private int hrs;
    private int mins;
    private int secs;
 
    public Time()
    {
        this.hrs=12;
        this.mins=12;
        this.secs=12;
    }
    public Time(int h)
    {
        this.hrs=h;
        this.mins=0;
        this.secs=0;
    }
    public Time(int h, int m)
    {
        this.hrs=h;
        this.mins=m;
        this.secs=0;
    }
    public Time(int h, int m, int s)
    {
        this.hrs=h;
        this.mins=m;
        this.secs=s;
    }
    public void printTime()
    {
        System.out.printf("%02d : %02d : %02d\n\n",this.hrs,this.mins,this.secs);
       // System.out.printf("\n%f : %b : %s\n",this.d,this.b,this.str);
    }
    
  
}