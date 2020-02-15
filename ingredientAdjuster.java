import java.util.Scanner;

class ingredientAdjuster {
  public static void main(String[] args) {

Scanner sc = new Scanner(System.in);


float cups_of_sugar = 1.5f;
float cups_of_butter = 1.0f;
float cups_of_flour = 2.75f;
float cookies = 48.0f;



    System.out.println("How many cookies would you like to make?");

float num_of_cookies =sc.nextFloat();

float cups_of_sugar1 = (cups_of_sugar/cookies) * num_of_cookies;
float cups_of_butter1 = (cups_of_butter/cookies) * num_of_cookies;
float cups_of_flour1 = (cups_of_flour/cookies) * num_of_cookies;

System.out.print("\nYou will need " + cups_of_sugar1 + " cups of sugar, " + cups_of_butter1 + " cups of butter and " + cups_of_flour1 + " cups of flour.");

    /*
17. ingredient adjuster
A cookie recipe calls for the following ingredients:
• 1.5 cups of sugar
• 1 cup of butter
• 2.75 cups of flour
The recipe produces 48 cookies with these amounts of the ingredients. Write a program that asks the user how many cookies he or she wants to make, and then displays the number of cups of each ingredient needed for the specified number of cookies.


    */
  }
}
