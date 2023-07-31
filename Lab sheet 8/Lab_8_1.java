
package com.mycompany.lab_8_1;

public class Lab_8_1 {

    public static void main(String[] args)
    {
        Savingsaccount SA1=new Savingsaccount(2658,20000000);
        CheckingAccount CA1=new CheckingAccount(5247,100000);
        SA1.calculateInterest();
        CA1.calculateInterest();
        System.out.println("Your Saving Account Interest is: "+SA1.calculateInterest());
        System.out.println("Your Checking Account Interest is: "+CA1.calculateInterest());
        
    }
}
