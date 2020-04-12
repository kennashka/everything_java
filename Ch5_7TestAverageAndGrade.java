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


 Test Average and grade  Write a program that asks the user to enter five test scores. 
The program should display a letter grade for each score and the average test score. 
Write the following methods in the program: 
    * calcAverage—This method should accept five test scores as arguments and return the average of the scores. 
    * determineGrade—This method should accept a test score as an argument and return a letter 
grade for the score, based on the following grading scale: 

Score 
90–100 80–89 70–79 60–69 Below 60 

Letter Grade 
A B C D F 

*/

import java.util.Scanner;  // Import the Scanner class

public class Ch5_7TestAverageAndGrade {
      

     
       
     public static double[] calcAverage()
   { 
       
       
     Scanner scores = new Scanner(System.in);
     System.out.print("Input Five Test Scores and Enter: \n");
    
    
     // check to make sure the user entered a number
     if (!scores.hasNextInt())
     {
      System.out.println("\nYou did not enter a number!");
      System.exit(1);
     }
     
     // store the number entered by the user
     double score1 = scores.nextInt();
     double score2 = scores.nextInt();
     double score3 = scores.nextInt();
     double score4 = scores.nextInt();
     double score5 = scores.nextInt();
     
     // return the number
     return new double[] {score1, score2, score3, score4, score5};
   }
     

      
//determineGrade—This method should accept a test score as an argument and return a letter grade for the score
   public static String determineGrade(double score)
              // Score 
// 90–100 80–89 70–79 60–69 Below 60 

// Letter Grade 
// A B C D F 
   {
String grade = " ";
    if (score >= 90 && score <= 100)
    {
      grade = "A";
    }
    else if (score >= 80 && score <= 89)
    {
      grade = "B";
    }
    else if (score >= 70 && score <= 79)
    {
      grade = "C";
    }
    else if(score >= 60 && score <= 69){
        grade = "D";
    }
   else {
      grade = "F";
    }
    return grade;
    
   }
       public static void main(String[] args)
   {
       double sum = 0;
       double avg = 0;
   double result[] =   calcAverage();
    System.out.println("\nThe average is:");
   

    for (int i = 0; i < result.length; i++) 
        { 
           sum +=result[i]  ; 
          
        } 
     avg = sum/5;
     System.out.println(avg); 
     
     
    String res = determineGrade(avg);
      System.out.println("\nYour letter grade is:");
      System.out.println(res); 

   }
   
}
