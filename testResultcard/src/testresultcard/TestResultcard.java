/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testresultcard;

/**
 *
 * @author PMYLS
 */
public class TestResultcard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Subject s1 = new Subject("Mathematics",100, 95.6);
        Subject s2 = new Subject("Science",100, 88);
        Subject s3 = new Subject("English",100, 76);
        Subject s4 = new Subject("Chemistry",100, 64);
        Subject s5 = new Subject("Urdu", 100, 45);

        
        Subject[] subjects = {s1,s2,s3,s4,s5};
        ResultBook resultBook = new ResultBook("10th Grade", "2023-2024", subjects);
        resultBook.ResultSummary();
    }
}
    

