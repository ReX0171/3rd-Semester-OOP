/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstprogram.Apnacollege;

/**
 *
 * @author PMYLS
 */

    class Book{
    String name,genre;
    
    int pages;

    public void action(){
        System.out.println("You are reading the book. ");
    }
   public void bookdetails_print(){
    System.out.println(this.name);
     System.out.println(this.genre);
     System.out.println(this.pages);
   }
    

}





public class Library {
    public static void main(String[] args){

        Book book1=new Book();
        book1.name="Harrypotter";
        book1.genre="Mystery";
        book1.pages=79;
        book1.action();
        
    }
}

