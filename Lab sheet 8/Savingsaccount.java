
package com.mycompany.lab_8_1;
public class Savingsaccount extends BankAccount
{
   
    public Savingsaccount(int accountNumber,double balance)
    {
        super(accountNumber,balance);
    }
    public double calculateInterest()
    {
        double interestRate=0.12;
        return getbalance()*interestRate;
    } 
}
