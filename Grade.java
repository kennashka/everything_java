import java.util.Scanner;  // Import the Scanner class

public class Grade {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
int x = 10;
      while(x < 20){
      System.out.println("\nEnter your number score:");

      int average = sc.nextInt();
      char grade = ' ';

  //wrap in jpaneloption
      if( average<=100 && average>=93){
         grade = 'A';
      }else if(average<=92 && average>=85){
         grade = 'B';
      }
      else if(average<=84 && average>=75){
         grade = 'C';
      }
      else if(average<=74 && average>=67){
         grade = 'D';
      }   
      else if(average<=66 && average>=0){
         grade = 'F';
      }

      switch(grade) {
         case 'A' :
            System.out.println("Excellent!" + " Your grade is " + grade);
            break;
         case 'B' :
         case 'C' :
            System.out.println("Well done!" + " Your grade is " + grade);
            break;
         case 'D' :
            System.out.println("Better try again!" + " Your grade is " + grade);
              break;
         case 'F' :
            System.out.println("Better go read some books!" + " Your grade is " + grade);
            break;
         default :
         System.out.println("Invalid grade.");
      }

      }
   }
}
