
/*
6. Time Calculator
Write a program that asks the user to enter a number of seconds.
• There are 60 seconds in a minute. If the number of seconds entered by the user is greater than or equal to 60, the program should display the number of minutes in that many seconds.
• There are 3,600 seconds in an hour. If the number of seconds entered by the user is greater than or equal to 3,600, the program should display the number of hours in that many seconds.
• There are 86,400 seconds in a day. If the number of seconds entered by the user is greater than or equal to 86,400, the program should display the number of days in that many seconds.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

Scanner sc = new Scanner(System.in); // create new scanner class

int x = 10;

while (x < 20){
    System.out.println("\nEnter a number in seconds: ");
    
int seconds = 60; // number represented in seconds
int minute = 60; // number represented in minutes
int hour = 3600; // number represented in hours
int day = 86400; // number represented in days

int num = sc.nextInt(); // num represents variable for user's input


System.out.println("\nThe number " + num + " is equal to: "); 

System.out.println("\n" + (num/day) + " in day(s) "); // algorithm for number converted to days 
System.out.println("\n" + (num/hour) + " in hour(s) " ); // algorithm for number converted to hours 
System.out.println("\n" + (num/minute) + " in minute(s) " ); //algorithm for number converted to minutes 
System.out.println("\nand " + (num % seconds) + " in second(s)."); // algorithm for number converted to seconds


}
  }
}
