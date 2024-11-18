class Pen {
    String Color;
    String Type;
    
    public void write(){
            System.out.println("writing something.");
    }
    public void Printcolor(){
        System.err.println(this.Color);//this will print color for any object that is called from or by this class.
    }

    public void Type_print(){
        System.err.println(this.Type);// this will give me the type of object from which i call it.
    }
}



public class OOP{
    public static void main(String[] args) {
    Pen pen1=new Pen();

    pen1.Color= "Black";
    pen1.Type= "Gel";
    
    pen1.write();
    pen1.Printcolor();
    pen1.Type_print();

    Pen pen2=new Pen();
    pen2.Color="Blue";
    pen2.Type="ballpoint";

    pen2.Printcolor();
    pen2.Type_print();

    pen2.write();
    }
}