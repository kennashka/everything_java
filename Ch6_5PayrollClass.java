/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KayT
 */

// 6.5 Payroll Class.
// Design a Payroll class that has fields for an employee’s name, 
// ID number, hourly pay rate, and number of hours worked. 
// Write the appropriate accessor and mutator methods and 
// a constructor that accepts the employee’s name and ID number as arguments. 
// The class should also have a method that returns the employee’s gross pay, 
// which is calculated as the number of hours worked multiplied by the 
// hourly pay rate. Write a program that demonstrates the class by creating 
// a Payroll object, then asking the user to enter the data for an 
// employee. The program should display the amount of gross pay earned. 

import java.util.Scanner;

public class Ch6_5PayrollClass {
    
    
      public static void main(String[] args) {
      
         Scanner yourName = new Scanner(System.in);
          System.out.println("Enter your Name: "); //promptsfor username input
          
        
 String name = yourName.nextLine();
           System.out.println("Enter your Employee ID Number:");  //promptsfor id input
 
  int id = yourName.nextInt();
  
  Ch6_5PayrollClass sc = new Ch6_5PayrollClass( name, id );
  
        
//              
//  Gets the Payroll
//             
         System.out.println(sc.getPayroll());
//      } 
      }

      
      // variables to store in classes
private double Hourly_pay;
private int  Id_Number;
private String Employee_Name;
private double Number_of_hours_worked;

// Hourly Pay Info
        public void setHourly_pay(double pay){

            Hourly_pay = pay;

    }
       
        

        // setter for Id
          public void setId_Number(int id){
          Id_Number = id;
    }
        
               // setter for Id

              public void setEmployee_Name(String n){
          Employee_Name = n;
    }
        
       
              public void setNumber_of_hours_worked(double num){
         Number_of_hours_worked = num;
    }
        
        // Stores the hourly pay  
       
             public double getPay(){
return Hourly_pay;
    }
      


   // Stores the id number

        
            public int getId_Number(){
return Id_Number;
    }
            
 // Stores the employees name

        
            public String getEmployee_Name(){
return Employee_Name;
    }
        // Stores the hours worked
            public double getNumber_of_hours_worked(){
return Number_of_hours_worked;
    }
            
            
            // Design a Payroll class that has fields for an employee’s name, 
// ID number, hourly pay rate, and number of hours worked. 
            
            // Constructor Payroll Class
            
        
            public Ch6_5PayrollClass(String n, int id){   
 Employee_Name = n;              
Id_Number = id; 
 Hourly_pay = 1000.0;  // initiate Hourly_pay variables for defaulted value
 Number_of_hours_worked = 40;  // initiate Number_of_hours_worked variables for defaulted value

            }
            
            
            
            // Class will automatically calculate the Hourly_pay * Number_of_hours_worked
            
             public double getPayroll(){
  System.out.println("Your Hourly Pay: " + Hourly_pay);
  System.out.println("Your Numbers of Hours Worked: " + Number_of_hours_worked);
  System.out.print("Your Gross Pay: $");
  
return Hourly_pay * Number_of_hours_worked;


    }   
            
            
  
}
