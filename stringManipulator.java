import java.util.Scanner; // import the Scanner class 


class stringManipulator {
  public static void main(String[] args) {
    System.out.println("String Manipulator");

String city_name;

Scanner sc = new Scanner(System.in);

System.out.println("\nEnter the name of your favorite city: ");

city_name=sc.nextLine();


System.out.println("\nThe number of characters in the city name is: " + city_name.length());

System.out.println("\nThe name of the city in all uppercase letters: " + city_name.toUpperCase());

System.out.println("\nThe name of the city in all lowercase letters: " + city_name.toLowerCase());


System.out.println("\nThe first character in the name of the city: " + city_name.charAt(0));
/*

    12. string Manipulator
Write a program that asks the user to enter the name of his or her favorite city. Use a String variable to store the input. The program should display the following:
• The number of characters in the city name
• The name of the city in all uppercase letters
• The name of the city in all lowercase letters
• The first character in the name of the city

*/


  }
}
