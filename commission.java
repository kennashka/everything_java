import java.util.Scanner; // import the Scanner class 



class commission {
  public static void main(String[] args) {
    System.out.println("Restaurant Bill!");

float price = 21.77f;

int shares = 600;

float commission = .02f;

Scanner sc = new Scanner(System.in);


float stock = price * shares;
System.out.println("\nYour Stock Amount (without the commission): " + "$" + stock);


float commission_total = (stock * commission);

System.out.println("\nThe amount of the commission: "  + "$" + commission_total);

float total = commission_total + stock;
System.out.println("\nThe total amount paid (for the stock plus the commission): " + "$" + total);


/*
15. stock commission
Kathryn bought 600 shares of stock at a price of $21.77 per share. She must pay her stock- broker a 2 percent commission for the transaction. Write a program that calculates and displays the following:
• The amount paid for the stock alone (without the commission)
• The amount of the commission
• The total amount paid (for the stock plus the commission)


*/

  }
}
