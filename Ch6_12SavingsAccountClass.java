/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kennashka
 */

/*

* 12. SavingsAccount class 
Design a SavingsAccount class that stores a savings account’s annual interest rate and bal- ance.
The class constructor should accept the amount of the savings account’s starting balance. 
The class should also have methods for subtracting the amount of a withdrawal, 
adding the amount of a deposit, and adding the amount of monthly interest to the balance. 
The monthly interest rate is the annual interest rate divided by twelve. 
To add the monthly interest to the balance, multiply the monthly interest rate by the balance, and add the result to the balance. 
Test the class in a program that calculates the balance of a savings account at the end of a period of time. 
It should ask the user for the annual interest rate, the starting balance, 
and the number of months that have passed since the account was established. 
A loop should then iterate once for every month, performing the following: 
* Ask the user for the amount deposited into the account during the month. 
Use the class method to add this amount to the account balance.  
* Ask the user for the amount withdrawn from the account during the month. 
Use the class method to subtract this amount from the account balance.  
* Use the class method to calculate the monthly interest.  
After the last iteration, the program should display the ending balance, the total amount of deposits, 
the total amount of withdrawals, and the total interest earned. 

*/
import java.util.Scanner;

import java.text.DecimalFormat;



public class Ch6_12SavingsAccountClass {

 public static void main(String args[]) {

    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Ask user to enter starting balance
    System.out.print("How much money is in the account?: ");
    double startingBalance = keyboard.nextDouble();

    // Ask user for annual interest rate
    System.out.print("Enter the annual interest rate:");
    double annualInterestRate = keyboard.nextDouble();

    // Create class
    Ch6_12SavingsAccountClass savingAccountClass = new Ch6_12SavingsAccountClass();
    SavingsAccount savingsAccount = savingAccountClass.new SavingsAccount(
            startingBalance, annualInterestRate);

    // Ask how long account was opened
    System.out.print("How long has the account been opened? ");
    double months = keyboard.nextInt();

    double montlyDeposit;
    double monthlyWithdrawl;
    double interestEarned = 0.0;
    double totalDeposits = 0;
    double totalWithdrawn = 0;

    // For each month as user to enter information
    for (int i = 1; i <= months; i++) {

        // Get deposits for month
        System.out.print("Enter amount deposited for month: " + i + ": ");
        montlyDeposit = keyboard.nextDouble();
        totalDeposits += montlyDeposit;

        // Add deposits savings account
        savingsAccount.deposit(montlyDeposit);

        // Get withdrawals for month
        System.out.print("Enter amount withdrawn for " + i + ": ");
        monthlyWithdrawl = keyboard.nextDouble();
        totalWithdrawn += monthlyWithdrawl;

        // Subtract the withdrawals
        savingsAccount.withdraw(monthlyWithdrawl);

        // Add the monthly interest
        savingsAccount.addInterest();

        // Accumulate the amount of interest earned.
        interestEarned += savingsAccount.getLastAmountOfInterestEarned();
    }

    // close keyboard
    keyboard.close();

    // Create a DecimalFormat object for formatting output.
    DecimalFormat dollar = new DecimalFormat("#,##0.00");

    // Display the totals and the balance.
    System.out.println("Total deposited: $" + dollar.format(totalDeposits));
    System.out.println("Total withdrawn: $" + dollar.format(totalWithdrawn));
    System.out.println("Interest earned: $" + dollar.format(interestEarned));
    System.out.println("Ending balance: $"
            + dollar.format(savingsAccount.getAccountBalance()));
}
     
     
     // SavingsAccount class that stores a savings account’s annual interest rate and balance.

     class SavingsAccount {

    private double accountBalance;
    private double annualInterestRate;
    private double lastAmountOfInterestEarned;

    public SavingsAccount(double balance, double interestRate) {

        accountBalance = balance;
        annualInterestRate = interestRate;
        lastAmountOfInterestEarned = 0.0;
    }

    public void withdraw(double withdrawAmount) {
        accountBalance -= withdrawAmount;
    }

    public void deposit(double depositAmount) {
        accountBalance += depositAmount;
    }

    public void addInterest() {

        // Get the monthly interest rate.
        double monthlyInterestRate = annualInterestRate / 12;

        // Calculate the last amount of interest earned.
        lastAmountOfInterestEarned = monthlyInterestRate * accountBalance;

        // Add the interest to the balance.
        accountBalance += lastAmountOfInterestEarned;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getLastAmountOfInterestEarned() {
        return lastAmountOfInterestEarned;
    }
}
    
}
