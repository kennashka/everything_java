
    /*

    1. Roman numerals
Write a program that prompts the user to enter a number within the range of 1 through 10. The program should display the Roman numeral version of that number. If the number is outside the range of 1 through 10, the program should display an error message.

    */

    import java.util.Scanner;

class romanNumber {
  public static void main(String[] args) {

Scanner sc = new Scanner(System.in);




int x = 10; // initiate variable x to 10 to prepare while loop condition.


// set while loop condition to 10 is less than 20 for multiple entries.

// using a if statement for number that meets the condition of being true from 1 through 10.
while (x<20){
    System.out.println("Enter a number within the range of 1 through 10");

int num = sc.nextInt();
if (num == 1){
  System.out.println("I");
}
if (num == 2){
  System.out.println("II");
}

if (num == 3){
  System.out.println("III");
}
if (num == 4){
  System.out.println("IV");
}
if (num == 5){
  System.out.println("V");
}
if (num == 6){
  System.out.println("VI");
}
if (num == 7){
  System.out.println("VII");
}
if (num == 8){
  System.out.println("VIII");
}
if (num == 9){
  System.out.println("IX");
}
if (num == 10){
  System.out.println("X");
}

// if the above condition is not met then this statement will execute.
if (num > 10 || num <1){
  System.out.println("\nError. Please use a number between 1 and 10.");
}

}

  }
}
