import java.util.Scanner; // import the Scanner class 

class res_bill {
  public static void main(String[] args) {

    /*

    13. restaurant Bill
Write a program that computes the tax and tip on a restaurant bill. The program should ask the user to enter the charge for the meal. The tax should be 6.75 percent of the meal charge. The tip should be 20 percent of the total after adding the tax. Display the meal charge, tax amount, tip amount, and total bill on the screen.

*/
    System.out.println("Restaurant Bill!");

float bill;
float total_bill;
float tip = .20f;
float tax = .0675f;
Scanner sc = new Scanner(System.in);



System.out.println("\nEnter the charge for the meal: ");

bill =sc.nextFloat();

System.out.println("\nYour meal charge: " + "$" +bill);

tax = (tax * bill);

System.out.println("\nYour tax amount: " + "$" + tax);

tip = ((tip * bill) + tax);

System.out.println("\nYour tip amount: " + "$" +tip);

total_bill = (bill + tax + tip);

System.out.println("\nYour total amount: " + "$" +total_bill);


  }
}
