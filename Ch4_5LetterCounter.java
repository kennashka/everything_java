/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K
 */

/*





5. Letter Counter 
Write a program that asks the user to enter a string, 
and then asks the user to enter a character. 
The program should count and display 
the number of times that the specified character appears in the string. 

*/

import java.util.Scanner;  // Import the Scanner class

public class Ch4_5LetterCounter {
    

 
  public static void main(String[] args) {

   Scanner str = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter a String: ");
    
    String str2 = str.nextLine();  // Read user input
    System.out.println("The string you entered is: " + str2);  // Output user input
    
    
    
    System.out.println("Enter a Character: ");
    Scanner sc = new Scanner(System.in); 
   
        // Character input 
        char ch2 = sc.next().charAt(0); 
    System.out.println("The character you entered is: " + ch2);  // Output user input

   
    long result = str2.chars().filter(ch -> ch == ch2).count();
System.out.println( str2 + " has " + result + " of the entered character.");

  }


}
