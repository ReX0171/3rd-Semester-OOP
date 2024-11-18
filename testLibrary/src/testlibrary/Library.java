/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testlibrary;

/**
 *
 * @author PMYLS
 */
public class Library {
    private  String Title;
    private int bookavail;
    private double price;
    
    public void set_Title(String t){
        this.Title=t;
    }
    public void set_bookavail(int bi){
        this.bookavail=bi;
    }
    public void set_price(double p){
        this.price=p;
    }
    
    public String get_title(){
        return this.Title;
    }
    public int  get_bookid(){
        return this.bookavail;
    }
    public double get_price(){
        return this.price;
    }
    
    
    public void borrow_book(){
        this.bookavail-=1;
        if(this.bookavail<=1){
            System.out.printf("The book is sold out and not available for purchase\n");
        }
        else{
            System.out.printf("The book is sold out and not available for purchase\n");     
        }
    }
    
    public void return_book(){
        this.bookavail+=1;
        System.out.printf("Book available now is %d.\n",this.bookavail);
    }
    
    public void print_bookinfo(){
        System.out.printf("The book title is %s.\nThe book availablility is %d .\nThe book price is %.2f .\n*********************\n", this.Title,this.bookavail,this.price);
    }
}
