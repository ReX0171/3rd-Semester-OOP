/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraypractice;

/**
 *
 * @author PMYLS
 */
import java.util.Scanner;
public class Arraypractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Data_type[] array_name=new data_type [dimension]
         //int[] intarr=new int[5];
         
        /* System.out.printf("Length of the array : %d\n",intarr.length);//for finding length of an array.
         
         System.out.printf("%6s%10s\n","index","Value");
         
         for(int i=0;i<intarr.length;i++)
         {
             System.out.printf("%6d%10d\n",i,intarr[i]);
         }
         */
        
        /*double[] darr=new double[5];  
        System.out.printf("%6s%10s\n","index","Value");
         for(int i=0;i<darr.length;i++)
         {
             System.out.printf("%6d%10f\n",i,darr[i]);
         }*/
        
        
      /*  boolean[] barr=new boolean[5];
   
        System.out.printf("%6s%10s\n","index","Value");
         for(int i=0;i<barr.length;i++)
         {
             System.out.printf("%6d%10b\n",i,barr[i]);
         }
         barr[3]=true;
         for(int i=0;i<barr.length;i++)
         {
             System.out.printf("%6d%10b\n",i,barr[i]);
         }*/
        
         /*String [] strarr=new String[5];
          for(int i=0;i<strarr.length;i++)
         {
             System.out.printf("%6d%10s\n",i,strarr[i]);
         }
         strarr[4]="Waseef";
         System.out.printf("%10s\n",strarr[4]);
         */
       /* int[] intarr={11,2,1,3,4};
        
         for(int i=0;i<5;i++)
         {
             System.out.printf("%6d%10d\n",i,intarr[i]);
         }
       */
       Scanner input=new Scanner(System.in);
       
        System.out.println("Enter array indexes\n");
       int [] arr=new int[5];
       
       for(int i=0;i<arr.length;i++)
       {
           arr[i]=input.nextInt();
       }
       System.out.printf("%6s%10s\n1","Index","Value");
       for(int i=0;i<arr.length;i++)
       {
           System.out.printf("%6d%10d\n",i,arr[i]);
       }
               
       
       
       
    }
    
}
