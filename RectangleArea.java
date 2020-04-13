/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author KayD
 */


/*


3. Rectangle Area—complete the program 
If you have downloaded the book’s source code from
www.pearsonhighered.com/gaddis, you will find a partially written program named AreaRectangle.java in 
this chapter’s source code folder. Your job is to complete the program. 
When it is complete, the program will ask the user to enter the width and 
length of a rectangle, and then display the rectan- gle’s area. 
The program calls the following methods, which have not been written: 
* getLength—This method should ask the user to enter the rectangle’s length, and then return that value as a double.
* getWidth—This method should ask the user to enter the rectangle’s width, and then return that value as a double.
* getArea—This method should accept the rectangle’s length and width as arguments, and return the rectangle’s area.
The area is calculated by multiplying the length by the width. 
* displayData—This method should accept the rectangle’s length, width, and area as arguments, 
and display them in an appropriate message on the screen. 

*/

import java.util.Scanner;  // Import the Scanner class

public class Ch5_3RectangleArea {
    
    
    
    /**
   You must complete this program so it calculates
   and displays the area of a rectangle. 
*/


   public static void main(String[] args)
   {
       
       
      // declare variables
      double length = 0.0, width = 0.0, area = 0.0;
   
      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
   }
   
   /**
   * getLength() method
   * this method asks the user for the length of a rectangle
   * and returns that length as a double
   */
   public static double getLength()
   {
       
    System.out.print("\t \t \t ********** Rectangle Area **********\n\n");

    // prompts user to input length
     System.out.print("Enter the length of the rectangle: ");
     
          // creating a variable for scanner class

     Scanner userInput = new Scanner(System.in);
     
     // check to make sure the user entered a number
     if (!userInput.hasNextInt())
     {
      System.out.println("You did not enter a number!");
      System.exit(1);
     }
     
     // store the number entered by the user
     double result = userInput.nextInt();
     
     // return the number
     return result;
   }
   
   /**
    * getWidth() method
    * this method asks the user for the width of a rectangle
    * and returns that width as a double
    */
   public static double getWidth()
   {
     System.out.print("Enter the width of the rectangle: ");
     Scanner userInput = new Scanner(System.in);
     
     // check to make sure the user entered a number
      if (!userInput.hasNextInt())
      {
       System.out.println("You did not enter a number!");
       System.exit(1);
      }

      // store the number entered by the user
      double result = userInput.nextInt();

      // return the number
      return result;
   }
   
   /**
    * getArea() method
    * this method accepts two arguments of type double and multiplies them
    * it returns the result as a double
    */
   public static double getArea(double l, double w)
   {
     double result = l * w;
     return result;
   }
   
   /**
    * displayData() method
    * this method accepts 3 doubles as arguments and prints them with println()
    */
   public static void displayData(double l, double w, double a)
   {
     System.out.println("The length is: " + l);
     System.out.println("The width is: " + w);
     System.out.println("The area is: " + a);
   }
}
    
    

