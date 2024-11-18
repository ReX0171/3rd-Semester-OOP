/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpractice;

/**
 *
 * @author PMYLS
 */
public class Practice {
    String Name;
    int Roll_no;
    int id;

    public String getName() {
        return Name;
    }

    public Practice(String Name, int Roll_no, int id) {
        this.Name = Name;
        this.Roll_no = Roll_no;
        this.id = id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(int Roll_no) {
        this.Roll_no = Roll_no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
