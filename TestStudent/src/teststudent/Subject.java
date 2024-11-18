package teststudent;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PMYLS
 */
public class Subject {
    private String subname;
    private String subcode;
    private double GPA;
    
    public Subject(String sn,String sc,double gpa)
    {
        this.subname=sn;
        this.subcode=sc;
        this.GPA=gpa;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s %s %.2f",this.subname,this.subcode,this.GPA);
    }
    
    
    
}
