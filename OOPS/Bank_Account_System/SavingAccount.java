package OOPS.Bank_Account_System;

public class SavingAccount implements BankAccount {
    double balance = 0;
    if(balance>withdraw){
        System.out.println("Can not withdraw");
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println(amount + balance);
    }    
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println(amount+ balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public void calculateInterest(){
        double interest = balance *0.04;
        System.out.println(interest);
    }
}
