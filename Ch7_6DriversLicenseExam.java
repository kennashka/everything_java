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

7.6 

6. Driver’s License exam 
The local Driver’s License Office has asked you to write a program that
grades the written portion of the driver’s license exam. 
The exam has 20 multiple choice questions. Here are the correct answers: 
 
1. B 2. D 3. A 4. A 5. C 
11. B 12. C 13. D 14. A 15. D 
16. C 17. C 18. B 19. D 20. A 

A student must correctly answer 15 of the 20 
questions to pass the exam 
Write a class named DriverExam that holds the 
The class should also have an array field that holds the student’s answers. 
The class should have the following methods: 
* passed. Returns true if the student passed the exam, or false if the student failed  
* totalCorrect. Returns the total number of correctly answered questions  
* totalIncorrect. Returns the total number of incorrectly answered questions  
* questionsMissed. An int array containing the question numbers of the questions 
that  the student missed Demonstrate the class in a complete program that asks the 
user to enter a student’s answers,  and then displays the results returned from the DriverExam class’s methods. 
Input Validation: Only accept the letters A, B, C, or D as answers. 


*/

    
 
import java.util.Scanner;


    
public class Ch7_6DriversLicenseExam {
    public static void main(String[] args) {
      // create a new set of answers in the array
       char Answers[] = new char[20];
       Ch7_6DriversLicenseExam de = new Ch7_6DriversLicenseExam();
       Scanner sc = new Scanner(System.in); // create new scanner class
       System.out.println("Anter Answers ANY ONE OF [A,B,C,D]");
       for (int i = 0; i < 20; i++) {
           System.out.println("Input Question "+ i +" Answer ..");
           String input = sc.next();
           if(input !=null && (input.charAt(0) == 'A' ||input.charAt(0) == 'B'||input.charAt(0) == 'B'||input.charAt(0) == 'C'||input.charAt(0) == 'D')){
               Answers[i] = input.charAt(0);
           }
           else{
               System.out.println("You've Entered an Invalid input.. Taking input as no answer");
           }
       }
       //prints out the results
       boolean status = de.passed(Answers);
       int missed = de.questionsMissed(Answers);
       int answered = de.totalCorrect(Answers);
       int incorrect = de.totalIncorrect(Answers);
       System.out.println("Student :" + status);
       System.out.println("Missed : "+missed);
       System.out.println("Answered : "+answered);
       System.out.println("Incorrect : "+incorrect);
      
   }
    /*
    
1. B 2. D 3. A 4. A 5. C 
11. B 12. C 13. D 14. A 15. D 
16. C 17. C 18. B 19. D 20. A 
    
  
1. B	2. D	3. A	4. A
5. C	6. A	7. B	8. A
9. C	10. D	11.B	12. C
13. D	14. A	15. D	16. C
17. C	18. B	19. D	20. A  
    
    */
   
     private char Answers[] = { 'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B',
           'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D', 'A' };// Correct answers are stored in an array

     // boolean method to calculate if student pass or not
   public boolean passed(char arr[]) {
       //15 questions of the 20
       int correct = 0;
       boolean passed = true;
       boolean fail = false;
       for (int i = 0; i < Answers.length; i++) {
           if (Answers[i] == arr[i])
               correct++;
       }
       if(correct >= 15) return passed;
       else return fail;
   }
   // method to calculate correct questions

   public int totalCorrect(char arr[]) {
       int correct = 0;
       for (int i = 0; i < Answers.length; i++) {
           if (Answers[i] == arr[i])
               correct++;
       }
       return correct;
   }
   // method to calculate incorrect questions

   public int totalIncorrect(char arr[]) {
       int inCorrect = 0;
       for (int i = 0; i < Answers.length; i++) {
           if (Answers[i] != arr[i])
               inCorrect++;
       }
       return inCorrect;
   }

   
   // method to calculate missed questions
   public int questionsMissed(char arr[]) {
       int missed = 0;
       for (int i = 0; i < Answers.length; i++) {
           if (Answers[i] != '\0')
               missed++;
       }
       return missed;
   }

}
    

