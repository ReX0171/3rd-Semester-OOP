/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teststudent;

import java.util.ArrayList;

/**
 *
 * @author PMYLS
 */
public class TestStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
//        Student std2=new Student("Khurram", "FA20-BCS-049", 2.1);
//        Student std3=new Student("Adil", "FA20-BCS-079", 2.7);
//        
//        ArrayList<Student> it=new ArrayList<Student>();
//        it.add(std1);
//        it.add(std2);
//        it.add(std3);
//        //System.out.println(it.size());
//        for(int i=0;i<it.size();i++)
//        {
//            System.out.printf("Subject Detail: %s \n",it.get(i));
//        }
//        Subject sub1=new Subject("ICT","CSC103",3.7);
//        System.out.println(sub1);
//        
        
        Student std1=new Student("Ahmed Ali", "FA20-BCS-009");
        std1.addsub();
        std1.addsub();
        System.out.println(std1);
    }
    
}
