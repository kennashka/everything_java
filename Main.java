// File name has to be the name of the class

import java.util.Scanner; // import the Scanner class 


class Main {
          

  public static void main(String[] args) {

// create a new object of scanner

     Scanner myObj = new Scanner(System.in);

    String intro = "\n So far we have the following variables for our program called biWeeklyPay";

    String variables = "\nint taxes; \nint dentalCost = 100; (immutable variable) \nint overtime = 1.5; (immutable variable) \nint otEligibilityMax = 47476; (immutable variable) \nint hourlyRate; \nString company; \narray employeeType; \nbool married; \nint dentalCost; \nint biWeeklyPayCheck; \nint insuranceCost; \nString employeeFirstName; \nString employeeLastName; \nint salary; \nint ten99;";

String question1 = "What is your name?";
String question2 = "What is your company name?";
String question3 = "What did you pay in dental?";
String question4 = "What did you pay in insurance?";
String question5 = "Please type in Salary, 1099, or hourly for your pay status?";

    String employeeFirstName;

    int score= 1;


    String company;
    int dentalCost = 100;
    //int insuranceCost;

    int taxes;
    double overtime = 1.5;
    int otEligibilityMax = 47476;
    int hourlyRate;
    int salary;
    int ten99;
    /*  

 
    array fillingStatus [married];
    int dentalCost;
    int biWeeklyPayCheck;
  int employeeCost[ salary, 1099, hourly ]
    String employeeFirstName;
    String employeeLastName;



    array employeeType;

    */
    
    // we can print with System.out.println and then pass in the variable
  

       
    System.out.println(intro);


    System.out.println(variables);


    

// Start thinking about questions to ask the user.

/* 

if, else loop (Salary, 1099, or hourly, then ->

*/

// Enter username and press Enter


    System.out.println("To test this program, Enter your First and Last Name, then press Enter: \n"); 


/* The nextLine() method of java.util.Scanner class advances this scanner past the current line and returns the input that was skipped. */
  employeeFirstName = myObj.nextLine();  

  
System.out.println("Hello " + employeeFirstName );     

  System.out.println(question2);

// this has to used for the 
  company = myObj.nextLine();  
System.out.println("\nYour company name:" + " " + company +"\n");

System.out.println(question3);

// dentalCost = myObj.nextLine();  

System.out.println(dentalCost +"\n");


System.out.println(question4);

int insuranceCost = myObj.nextInt();  

System.out.println("Your Insurance cost: " + insuranceCost +"\n");


System.out.println(question5);

 salary = myObj.nextInt();  

System.out.println("Your info: " + salary +"\n");

  }
}
