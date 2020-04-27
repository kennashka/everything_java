/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kennashka
 */



//    10. A Game of Twenty-one 
//    For this assignment, you will write a program that lets the
//        user play against the computer in a variation of the popular blackjack card game. 
//    In this variation of the game, two six-sided dice are used instead of cards. 
//    The dice are rolled, and the player tries to beat the computer’s 
//            hidden total without going over 21. 
//   Here are some suggestions for the game’s design: 
//    * Each round of the game is performed as an iteration 
//    of a loop that repeats as long as the player agrees to
//    roll the dice, and the player’s total does not exceed 21.  
//   * At the beginning of each round, the program will ask the user whether or
//        not he or she wants to roll the dice to accumulate points.  
//* During each round, the program simulates the rolling of two six-sided dice.
//    It rolls the dice first for the computer, and then it asks the user whether
//            he or she wants to roll. (Use the Die class that was shown in Code 
//                    Listing 6-14 to simulate the dice.)  
//* The loop keeps a running total of both the computer’s and the user’s points.  
//* The computer’s total should remain hidden until the loop has finished.  
//* After the loop has finished, the computer’s total is revealed, and the player with the  
//most points, without going over 21, wins. 

import java.util.*;  // Import the Scanner class
import java.util.Random;  // Import the random class

public class Ch6_10AGameofTwentyone {
    
    

public static void main(String[] args) {

    int computerPoints = 0;
    int userPoints = 0;

    while (playAgain()) {

        computerPoints += getRollValue();
        userPoints += getRollValue();

        // break the game if either user or computer go over the limit
        if (!isUnderGameLimit(userPoints)
                || !isUnderGameLimit(computerPoints)) {
            break;
        }

        System.out.println("User Points: " + userPoints);
    }

    if (userPoints == 0 && computerPoints == 0) {
        System.out.println("Gotta play to win!!!");
    } else {
        displayResults(computerPoints, userPoints);
    }
}

static class Die {

    private final int NUMBER_OF_SIDES = 6;
    private int value;

    /**
     * Constructor will call the roll method to set the value of the die
     *
     */
    Die() {
        roll();
    }

    /**
     * The roll method sets the value of the die to a random number.
     */

    public void roll() {
        Random randomValue = new Random();

        value = randomValue.nextInt(NUMBER_OF_SIDES) + 1;
    }

    /**
     * Get roll value
              number that represents roll
     */
    public int getValue() {
        return value;
    }
}

public static int getRollValue() {

    Die die = new Die();

    // roll first die
    int roll1Value = die.getValue();

    // roll second die
    die.roll();

    int roll2Value = die.getValue();

    // Return the sum of the value of the dice.
    return roll1Value + roll2Value;
}

// Method will determine if the game limit has been met

public static boolean isUnderGameLimit(int value) {

    if (value > 21) {
        return false;
    } else {
        return true;
    }
}

// Method will ask user to enter if they would like to play again

public static boolean playAgain() {

    Scanner keyboard = new Scanner(System.in);

    // Ask the user to roll the dice.
    System.out.print("Roll the dice? (y/n) : ");
    String userResponse = keyboard.nextLine(); // Get a line of input.
    char letter = userResponse.charAt(0); // Get the first character.

    if (letter == 'Y' || letter == 'y') {
        return true;
    } else {
        return false;
    }
}

// Method is responsible for handling displaying results to user

public static void displayResults(int computerScore, int userScore) {

    // Display the computer and user's points.
    System.out.println("\nGame Over\n");
    System.out.println("User's Points: " + userScore);
    System.out.println("Computer's Points: " + computerScore);

    System.out.println(getWinnerMessage(computerScore, userScore));

}

//Method should return a message on who wins the game

public static String getWinnerMessage(int computerScore, int userScore) {

    if (userScore > computerScore && isUnderGameLimit(userScore)) {
        return "Congrats, you win!!!";
    } else if (isUnderGameLimit(userScore)
            && !isUnderGameLimit(computerScore)) {
        return "Congrats, you win!!!";
    } else if (userScore == 21 && computerScore != 21) {
        return "Congrats, you win!!!";
    } else if (userScore == computerScore) {
        return "Tie game!";
    } else if (!isUnderGameLimit(userScore)
            && !isUnderGameLimit(computerScore)) {
        return "This game has ended without a winner.";
    } else {
        return "The computer wins!";
    }
}
    
}
    
