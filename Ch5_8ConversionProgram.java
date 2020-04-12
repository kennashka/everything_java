/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KayT
 */

/*

8. conversion program 
Write a program that asks the user to enter a distance in meters. 
The program will then pre- sent the following menu of selections: 
1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program 

The program will convert the distance to kilometers, inches, or feet, depending on the user’s selection. 
Here are the specific requirements: 
* Write a void method named showKilometers, which accepts the number of meters as an argument. 
The method should display the argument converted to kilometers. 
Con- vert the meters to kilometers using the following formula: 
kilometers = meters * 0.001 
* Write a void method named showInches,
which accepts the number of meters as an argument. 
The method should display the argument converted to inches. 
Convert the meters to inches using the following formula: 
inches = meters * 39.37 
* Write a void method named showFeet, 
which accepts the number of meters as an argument. 
The method should display the argument converted to feet. 
Convert the meters to feet using the following formula: 
feet = meters * 3.281 
* Write a void method named menu that displays the menu of selections.
This method should not accept any arguments. 
* The program should continue to display the menu until the user enters 4 to quit the program. 

* The program should not accept negative numbers for the distance in meters. 

* If the user selects an invalid choice from the menu, the program should display an 
error message. 
Here is an example session with the program, using console input.
The user’s input is shown in bold. 
Enter a distance in meters:
500 [enter] 
1. Convert to kilometers
2. Convert to inches
3. Convert to feet 
4. Quit the program 
Enter your choice:
1 [enter] 500 meters is 0.5 kilometers. 

1. Convert to kilometers
2. Convert to inches
3. Convert to feet
4. Quit the program 
Enter your choice: 3 [enter] 500 meters is 1640.5 feet. 
1. Convert to kilometers 
2. Convert to inches
3. Convert to feet
4. Quit the program 
Enter your choice: 4 [enter] Bye! 

*/

import java.util.Scanner;  // Import the Scanner class
//    asks the user to enter a distance in meters. 
//The program will then pre- sent the following menu of selections: 
//1. Convert to kilometers
//2. Convert to inches
//3. Convert to feet
//4. Quit the program 

public class Ch5_8ConversionProgram {
 
    // Write a void method named showKilometers, which accepts the number of meters as an argument. 
//The method should display the argument converted to kilometers. 
//Con- vert the meters to kilometers using the following formula: 
//kilometers = meters * 0.001 
          public static void showKilometers(double meters){
              //initialize constants and variables
      final double convert = 0.001;
      
      //calculate
      double kilometers = meters * convert;
         
      System.out.println("\nYou chose option 1\n");

    System.out.println(meters + " meters is " + kilometers + " kilometers\n");

}
//          Write a void method named showInches,
//which accepts the number of meters as an argument. 
//The method should display the argument converted to inches. 
//Convert the meters to inches using the following formula: 
//inches = meters * 39.37 
                    public static void showInches(double meters){
              //initialize constants and variables
      final double convert = 39.37;
      
      //calculate
      double inches = meters * convert;
            System.out.println("\nYou chose option 2\n");

    System.out.println(meters + " meters is " + inches + " inches\n");

}
                    
                    
//* Write a void method named showFeet, 
//which accepts the number of meters as an argument. 
//The method should display the argument converted to feet. 
//Convert the meters to feet using the following formula: 
//feet = meters * 3.281 
    public static void showFeet(double meters){
              //initialize constants and variables
      final double convert = 3.281;
      
      //calculate
      double feet = meters * convert;
            System.out.println("\nYou chose option 3\n");

    System.out.println(meters + " meters is " + feet + " feet\n");
                    }
                    
                

    
        public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("\nEnter a Distance in Meters: \n");
       
  if (!sc.hasNextInt())
     {
      System.out.println("\nYou did not enter a number!");
      System.exit(1);
     }
     

     
     double distance_meters = sc.nextInt();
     int x = 10;
      while(x < 20){
   
     System.out.println("\n \t \t 1. Convert to kilometers");
     System.out.println("\n \t \t 2. Convert to inches");
     System.out.println("\n \t \t 3. Convert to feet");
     System.out.println("\n \t \t 4. Quit the program");
     System.out.println("\n \t \t Choose an option: \n\n");
          int option = sc.nextInt();

      if (option == 1){
            showKilometers(distance_meters);
         }
         else if(option == 2){
            showInches(distance_meters);
         }
         else if(option == 3){
            showFeet(distance_meters);
         }
         else if(option == 4){
            System.out.println("Bye!");
            sc.close();
            // System.exit(1); ??
         }
         else {
            System.out.println("invalid choice");
         }
    }
   }


}
