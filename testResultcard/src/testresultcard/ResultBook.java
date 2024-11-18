/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testresultcard;

/**
* ResultBook Class
Data Members:
classDetails: Student's grade (e.g., 10th grade).
year: Academic year (e.g., 2023-2024).
subjectArray: Collection of Subject objects.
Functionalities:
Parametrized_Constructor
Calculate Total Marks: Sum of obtained marks.
Calculate Percentage: Overall performance percentage.
Generate Result Summary: Comprehensive report of results.
 *
 * @author PMYLS
 */
public class ResultBook {
    private String  Students_Grade;
    private String Academic_year;
    private Subject[] Subjectarray;
    
     public  ResultBook(String St_Gr,String Ac_year,Subject[] sub_array){
        
         this.Students_Grade=St_Gr;
         this.Academic_year=Ac_year;
         this.Subjectarray=sub_array;
    }
    
    public int TotalMarks()
    {
        int total=0;
        for(int i=0;i<Subjectarray.length;i++)
        {
            total+=Subjectarray[i].getObtainedmarks();
        }
        return total;
    }
    
     public double Percentage()
     {
        double totalObtainedmarks=TotalMarks();
        double Total=0;
        for(int i=0;i<Subjectarray.length;i++)
        {
            Total +=Subjectarray[i].getTotalmarks();
        }
        return (totalObtainedmarks/Total)*100;
    }
      public void ResultSummary() {
        System.out.printf("The student grade is %s.\n",this.Students_Grade);
        System.out.printf("The student academic year is %s\n",this.Academic_year);
        System.out.printf("The subjects are \n");
        for(int i=0;i<Subjectarray.length;i++){
           Subjectarray[i].display();
           System.out.printf("Grade: %s\n", Subjectarray[i].calculateGrade());
        }
         System.out.printf("Total Marks Obtained: %d\n",TotalMarks());
        System.out.printf("Overall Percentage: %f\n",Percentage());
    }
     
     
    
}
