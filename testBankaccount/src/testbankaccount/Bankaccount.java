/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testbankaccount;

/**
 *
 * @author PMYLS
 */
public class Bankaccount {
    //Attributes
    private String Acc_no;
    private String Acc_title;
    private double Balance;
    private boolean Status;
    
    
    //Different constructors initialization.
    public Bankaccount()
    {
        this.Acc_title="Unknown";
        this.Acc_no="N/A";
        this.Balance=0.0;
    }
    
    public Bankaccount(String ah,String an,double ib)
    {
        this.Acc_title=ah;
        this.Acc_no=an;
        this.Balance=ib;
    }
    
    public Bankaccount(Bankaccount otheraccount)
    {
        this.Acc_title=otheraccount.Acc_title;
        this.Acc_no=otheraccount.Acc_no;
        this.Balance=otheraccount.Balance;
    } 
    
    //Getter and setter initialization
    public void set_act_title(String at)
    {
        this.Acc_title=at;
    }
    public void set_act_no(String an)
    {
        this.Acc_no=an;
    }
    public void set_act_b(double b)
    {
        this.Balance=b;
    }
    public String get_act_title()
    {
        return this.Acc_title;
    }
    public String get_act_no()
    {
        return this.Acc_no;
    }
    public double get_act_balance()
    {
        return this.Balance;
    }
    //Welcome Message for the user 
    public void print_welcome_info()
    {   
        System.out.println("\n------------------------\n");
        System.out.println("||||*******Welcome*******||||");
        System.out.printf("||||*******To Mr %s*******||||",this.Acc_title);
    }
    //Deposit Method
    public void deeposit(double amount){
        System.out.println("\n------------------------\n\nAccount title:"+this.Acc_title);
        System.out.printf("Your current account balance is %.2f rupees.\n",this.Balance);
        System.out.printf("Amount deposited %.2f.\n",amount);
        this.Balance+=amount;
        System.out.printf("Your new account balance is %.2f rupees.\n",this.Balance);
    }
    
    //withdrawing money from the account
    public void withdraw(double amount){
        if(this.Balance>amount){
        System.out.println("\n------------------------\n\nAccount title:"+this.Acc_title);
        System.out.printf("Your current account balance is %.2f rupees .\n",this.Balance);
        this.Balance-=amount;
        System.out.printf("Withdraw  successful.\nYou withdraw %.2f rupees .\n",amount);
        System.out.printf("Your new account balance is %.2f rupees .\n",this.Balance);
        System.out.println("\n------------------------\n");
        }
        else
        {
            System.out.println("Balance insufficient please recharge your account to withdraw money");
        }
        }
        
        //transfering money from one account to another
        public void transfer(Bankaccount recepient,double amount)
        {
            if(this.Balance>amount)
            {
                System.out.println("\n------------------------\n\nAccount title:"+this.Acc_title);

                System.out.printf("Your current balance is %.2f rupees.\n",this.Balance);
                this.Balance-=amount;
                recepient.Balance+=amount;
                System.out.printf("Amount %.2f rupees sent to %s. Remaining balance is %.2f rupees.\n",amount,recepient.Acc_title,this.Balance);
                System.out.printf("Amount recieved in account of %s.\n Amount now is %.2f",recepient.Acc_title,recepient.Balance);
                System.out.println("\n------------------------\n");
            
                }
            else
            {
                System.out.println("You dont have enough money in your Bank account.\nPlease recharge and try again.\n");
            }
        }
         public void print_info()
        {   
        System.out.println("Account Name:"+this.Acc_title);
        System.out.println("Account Number:"+this.Acc_no);
        System.out.printf("Available:"+this.Balance);
        }
            
            
        }
        
    
    
    
    
     
    

