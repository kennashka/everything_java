// File name has to be the name of the class

import java.util.Scanner; // import the Scanner class 


class Main {
          


  public static void main(String[] args) {

// create a new object of scanner

     Scanner myObj = new Scanner(System.in);

    String intro = "\n So far we have the following variables for our program called biWeeklyPay";

    String variables = "\nint taxes; \nint dentalCost = 100; (immutable variable) \nint overtime = 1.5; (immutable variable) \nint otEligibilityMax = 47476; (immutable variable) \nint hourlyRate; \nString company; \narray employeeType \nbool married \nint dentalCost \nint biWeeklyPayCheck \nint insuranceCost \nString employeeFirstName \nString employeeFirstName \n";

    String employeeFirstName;

    int score= 1;
    
    // we can print with System.out.println and then pass in the variable

    System.out.println(intro);


    System.out.println(variables);


    // Enter username and press Enter

    System.out.println("To test this program, Enter your First and Last Name, then press Enter: \n"); 


    employeeFirstName = myObj.nextLine();  
 
       
    System.out.println("Hello " + employeeFirstName );     
