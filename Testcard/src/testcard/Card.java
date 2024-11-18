/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcard;


public class Card {
    private String face;
    private String Suite;
    
    public Card(String f,String s)
    {
        this.face=f;
        this.Suite=s;
    }
    
    //public void print_card_info()
    //{
    //    System.out.println(this.face+" of "+this.Suite);
    //}
    @Override
    public String toString()
    {
        return this.face+ " of " + this.Suite;
        
    }
    
}
