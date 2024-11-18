class Book{
    String name,genre;
    
    int pages;

    public void action(){
        System.out.println("You are reading the book. ");
    }
   public void bookdetails_print(){
    System.out.print("Name is "book1.name);
   }
    

}





public class program1{
    public static void main(String[] args){

        Book book1=new Book();
        book1.name="Harrypotter";
        book1.genre="Mystery";
        book1.pages=79;
        book1.action();
    }
}