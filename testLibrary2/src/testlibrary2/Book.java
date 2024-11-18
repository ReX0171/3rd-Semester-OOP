/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testlibrary2;

/**title:A string representing the title of the book.
	author: A string representing the author of the book.
	isbn: A string representing the ISBN number of the book.
	publicationYear: An integer representing the year of publication.
	genre: A string representing the genre of the book (e.g., Fiction, Non-Fiction, Mystery).
	availableCopies: An integer representing the number of available copies of the book in the library.
 *
 * Constructor:
	Initializes the attributes of the book.
o	Methods:
	toString(): Returns a string representation of the book details.
 * 
 */
public class Book {
    private String title;
    private String ISBN;
    private int publicationyear;
    private String genre;
    private int availablecopies;
    
    public Book(String t, String isbn, int pub_year, String genre, int avail_copies) {
        this.title = t;
        this.ISBN= isbn;
        this.publicationyear = pub_year;
        this.genre = genre;
        this.availablecopies = avail_copies;
    }
    
    @Override
    public String toString()
    {
        return String.format("Title : %s \t ISBN : %s \t Publication Year : %d \t Genre : %s \t Aavailable Copies : %d.\n",this.title,this.ISBN,this.publicationyear,this.genre,this.availablecopies);
    }
    
}
