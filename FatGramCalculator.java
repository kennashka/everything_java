
/*
10. Fat Gram Calculator
Write a program that asks the user to enter the number of calories and fat grams in a food item. The program should display the percentage of the calories that come from fat. One gram of fat has 9 calories; therefore:
Calories from fat 5 Fat grams * 9
The percentage of calories from fat can be calculated as follows:
Calories from fat 4 Total calories
If the calories from fat are less than 30 percent of the total calories of the food, it should
also display a message indicating the food is low in fat.

n o T e : The number of calories from fat cannot be greater than the total number of calories in the food item. If the program determines that the number of calories from fat is greater than the number of calories in the food item, it should display an error message indicating that the input is invalid.

*/


import java.util.Scanner;

class FatGramCalculator {

  public static void main(String[] args) {


Scanner sc = new Scanner(System.in);

double fat_in_calories, calories_in_percentage =0;

int x = 10;
while (x < 20){
// user input for calories
System.out.println("\nEnter the number of calories: ");
int num_calories = sc.nextInt();

// user input for fat grams

System.out.println("\nAnd fat grams in a food item: ");
int num_fat_grams = sc.nextInt();

fat_in_calories = (num_fat_grams  * 9);

calories_in_percentage = ((fat_in_calories/num_calories)* 100);

if(fat_in_calories <= num_calories){
System.out.println("\nCalorie percentage is: " + calories_in_percentage + " % ");
}
if ( fat_in_calories < (num_calories *.30)){
  System.out.println("\nThe food is low in fat.");
}
if(fat_in_calories > num_calories ){
  System.out.println("\nInvalid input");

}


}
sc.close();
  }
}
