/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testlibrary;

/**
 *
 * @author PMYLS
 */import java.util.Scanner;
public class TestLibrary {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Library b1=new Library();
        
        b1.set_Title("Harrypotter");
        b1.set_bookavail(1234);
        b1.set_price(300.0);
         
       Library b2=new Library();
       b2.set_Title("Game of thrones");
       b2.set_bookavail(542);
       b2.set_price(500.0);
       
       Scanner input=new Scanner(System.in);
       
       
       
       
       System.out.println("Enter 1 for to print book info.\nEnter 2 to borrow book.\nEnter 3 to check availability");
        int choice=input.nextInt();

      for(int i=0;i<10;i++){
      switch(choice){
          case 1:
          {
              b1.print_bookinfo();
              break;
          }
          case 2:
              {
                 b1.borrow_book();
                 break;
              }
          case 3:
          {
              b1.return_book();
              break;
          }
          default:
                  {
                      System.out.println("You entered wrong option please click correct choice.\n");    
                      
                  }
      }        
        }
      
        
    }
    
    
}
