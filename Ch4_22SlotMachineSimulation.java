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


* 22. Slot Machine Simulation  A slot machine is a gambling device that the user inserts money 
into and then pulls a lever (or presses a button). 
The slot machine then displays a set of random images. 
If two or more of the images match, the user wins an amount of money that 
the slot machine dispenses back to the user. Create a program that simulates a slot machine. 
When the program runs, it should do the following: 

* Asks the user to enter the amount of money he or she wants to enter into the slot machine.
* Instead of displaying images, the program will randomly select a word from the  following list: 
Cherries, Oranges, Plums, Bells, Melons, Bars 
To select a word, the program can generate a random number in the range of 0 through 5.
If the number is 0, the selected word is Cherries; if the number is 1,
the selected word is Oranges; and so forth. The program should randomly select a
word from this list three times and display all three of the words. 

* If none of the randomly selected words match, the program will inform the
user that he or she has won $0. If two of the words match, the program will inform 
the user that he or she has won two times the amount entered.
If three of the words match, the program will inform the user 
that he or she has won three times the amount entered. 
The program will ask whether the user wants to play again. 
If so, these steps are repeated. 
If not, the program displays the total amount of money entered into the 
slot machine and the total amount won. Decision Structures 


*/

import java.util.Random;
import java.util.Scanner;  // Import the Scanner class

public class Ch4_22SlotMachineSimulation {
        
     public static void main(String[] args) {
                 Scanner input = new Scanner(System.in);

 //loop should repeat 3X 
   Scanner num = new Scanner(System.in);  // Create a Scanner object

   System.out.print("\t \t \t ********** Slot Machine **********");

    System.out.println("\n \n \t \t \t Insert Cash: ");
    
    int money = num.nextInt();  // Read user input
    System.out.println("\n \t \t \t Balance: $" + money + "\n");  // Output user input
 
    int Cherries = 0, Oranges = 0, Plums = 0, Bells =0, Melons =0, Bars=0;
    int newBalance = money;
    
    
  do {

for (int x = 1; x<=3; x++){


    Random randnum = new Random();  // create a variable to hold a random number

    
int choices = randnum.nextInt(5); // generate a random number in the range of 0 through 5.
         

// System.out.println(choices);

switch (choices) {
  case 0:
    System.out.print("\n Cherries");
    break;
  case 1:
    System.out.print("\n Oranges");
    break;
  case 2:
    System.out.print("\n Plums");
    break;
  case 3:
    System.out.print("\n Bells");
    break;
  case 4:
    System.out.print("\n Melons");
    break;
  case 5:
    System.out.print("\n Bars");
    break;
}


      if(choices == 0){
     Cherries++;
     if (Cherries == 1){
            System.out.print("\t " + Cherries); 
            
            System.out.print("\t You won $0." );

     }
      if (Cherries ==2 ){
         System.out.print("\t " + Cherries); 
         newBalance = (2 * newBalance);
         System.out.print("\t You won 2X.");
         

     }
     if (Cherries ==3){
         System.out.print("\t " + Cherries); 
         newBalance = (3 * newBalance);
            System.out.print("\t You won 3X.");
     }

    }
            if(choices == 1){
      Oranges++;
            if (Oranges == 1){
            System.out.print("\t " + Oranges); 
            System.out.print("\t You won $0. ");

     }
      if (Oranges ==2){
         System.out.print("\t " + Oranges); 
         newBalance = (2 * newBalance);
         System.out.print("\t You won 2X.");

     }
     if (Oranges ==3){
         System.out.print("\t " + Oranges); 
         newBalance = (3 * money);
            System.out.print("\t You won 3X.");
     }
    
    }
   
            if(choices == 2){
      Plums++;
            if (Plums == 1){
            System.out.print(" \t " + Plums); 
            System.out.print("\t You won $0 ");

     }
      if (Plums ==2){
         System.out.print(" \t " + Plums);
         newBalance = (2 * newBalance);
         System.out.print("\t You won 2X.");
     }
     if (Plums ==3){
         System.out.print(" \t " + Plums); 
         newBalance = (3 * money);
            System.out.print("\t You won 3X. Balance = $" + (newBalance));
     }
     
    }
            
        if(choices == 3){
      Bells++;
                if (Bells == 1){
            System.out.print("\t " + Bells); 
            System.out.print("\t You won $0. ");

     }
      if (Bells ==2){
         System.out.print(" \t " + Bells); 
      newBalance = (2 * newBalance);
            System.out.print("\t You won 2X.");

     }
     if (Bells ==3){
         System.out.print(" \t " + Bells); 
        newBalance = (3 * money);
            System.out.print(" You won 3X." );
     }
    }
        if(choices == 4){
      Melons++;
                if (Melons == 1){
            System.out.print(" \t " + Melons); 
            System.out.print("\t You won $0. ");

     }
      if (Melons ==2){
         System.out.print(" \t " + Melons); 
 newBalance = (2 * newBalance);
            System.out.print("\t You won 2X.");

     }
     if (Melons ==3){
         System.out.print(" \t " + Melons); 
        newBalance = (3 * money);
            System.out.print("\t You won 3X.");
     }
  
    }
         if(choices == 5){
      Bars++;
           if (Bars == 1){
            System.out.print(" \t " + Bars); 
            System.out.print(" \n You won $0. ");

     }
      if (Bars ==2){
         System.out.print(" \t " + Bars); 
 newBalance = (2 * newBalance);
            System.out.print(" You won 2X.");

     }
     if (Bars ==3){
         System.out.print(" \t " + Bars); 
          newBalance = (3 * newBalance);
                   newBalance = (3 * money);
            System.out.print(" You won 3X.");
     }
    }
 System.out.print("\t Your Balance: $" + newBalance);

// num.close();
}  // end of for loop

  
// do - while loop
  Cherries = 0;
  Oranges = 0;
  Plums = 0;
  Bells =0;
  Melons =0;
  Bars=0;

 System.out.println("\n\nType YES to continue:");

  }while (input.next().equalsIgnoreCase("YES"));
        input.close();

        System.out.println("Original Balance: $" + money + ". You won: $" + (newBalance - money));

     }
  
     
 }

    
    
