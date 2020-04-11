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



21. Dice game 
Write a program that plays a simple dice game between the computer and the user. 
When the program runs, a loop should repeat 10 times.
Each iteration of the loop should do the following: 
* Generate a random integer in the range of 1 through 6. This is the value of the computer’s die. 
* Generate another random integer in the range of 1 through 6. This is the value of the user’s die. 
* The die with the highest value wins. (In case of a tie, there is no winner for that particular roll of the dice.)
As the loop iterates, the program should keep count of the number of times the computer wins, 
and the number of times that the user wins. After the loop performs all of its itera- tions, 
the program should display who was the grand winner, the computer or the user.

*/
import java.util.*;  // Import the Scanner class
import java.util.Random;  // Import the random class


public class Ch4_21DiceGame {
    
    public static void main(String[] args) {

System.out.print("\t \t \t ********** Dice Game **********");
  
int cScore = 0, uScore = 0;  // Initialize two integer variables to hold scores

Random randnum = new Random();  // create a variable to hold a random number

//loop should repeat 10X 

for (int x = 1; x<=10; x++){
    
    int computer_play = randnum.nextInt(5)+ 1; // Computer Score
    
     int user_play = randnum.nextInt(5)+ 1; // User Score

     System.out.print("\n________________________________________"); 

    System.out.print("\n \t \t Computer: " + computer_play ); // Printing Computer Score to screen

    System.out.print("\n \t \t User: " + user_play ); // Printing Computer Score to screen

    // conditional statement if computer score is greater than user score
    if (computer_play > user_play){
     System.out.print("\n \t \t Computer Wins!");
      cScore++; // keeps tally of computer score
    }
        // conditional statement if user score is greater than user score
    if ( user_play > computer_play){
     System.out.print("\n \t \t User Wins!");
      uScore++; // keeps tally of computer score
    }
    
    // if there is a tie
    
      if ( user_play == computer_play){
     System.out.print("\n \t \t User and Computer Ties!");
      
    }
    
      
      
    
}
     System.out.print("\n \n And the winner is..... ");

System.out.print("\n \t \t User Score is: " + uScore); //user score
System.out.print("\n \t \t Computer Score is: " + cScore); //computer score
 
// display winner

      if ( uScore > cScore){
     System.out.print("\n \t \t User Wins!");
      
    }
            if ( cScore > uScore){
     System.out.print("\n \t \t Computer Wins!");
      
    }
  if ( cScore == uScore){
     System.out.print("\n \t \t User and Computer Ties!");
      
    }

    }
    
}
