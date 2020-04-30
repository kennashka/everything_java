import java.text.NumberFormat; // Helps with formatting doubles as currency
import java.util.Scanner; // Will be used to get input from the user


  /* Using Object-Oriented Programing (OOP), this means you must use a class and methods (getters and setters) to complete this assignment.

You will be creating an ATM program.

The ATM should allow for this:

Account/pin check
Withdrawals
Deposit
Check balance
Rules that must be coded:

A max of $300 daily limit for withdraw

You can only deposit cash up to $100 and checks up to $9,999.99


After 3 failed account/pin try the system should stop (disable)


The ATM can only give 20 (make sure the ATM corrects this if user enters different)
If you have any questions please email me.
*/

public class atm {
	
	public static void main(String[] args) {

    
	
		// Create and instantiate two Account objects

		Account checking = new Account();
    checking.setPin(0);
    checking.setAccountNum(0);
		checking.setType("Checking");
		checking.setBalance(0.00);
		checking.setRate(0.00);

		Account savings = new Account();
    savings.setPin(0);
    savings.setAccountNum(0);
    savings.setType("Savings");
		savings.setBalance(0.00);
		savings.setRate(2.00);

		NumberFormat formatter = NumberFormat.getCurrencyInstance(); // Creates the formatter object for currency
		Scanner sc = new Scanner(System.in); // Creates the sc object to read user input

		boolean session = true; // This variable will break the (while) loop when false
     
// Variables
double check = 0;
double cash = 0;
double deposit = 0;
double withdrawalLimit = 300;
double withdrawalTally = 0;
double twenty = 20;
int pinCounter=3;



			System.out.println("\nPlease set your Account Number:\n");
      int accountNum =sc.nextInt();
      checking.setAccountNum(accountNum);
      savings.setAccountNum(accountNum);

			System.out.println("\nPlease set your pin:\n");
      int entry =sc.nextInt();
      checking.setPin(entry);
      savings.setPin(entry);
      
      System.out.println("\nYour Pin Has Been Set! \n");
      System.out.println("\nEnter your pin to login account " + accountNum + ":");
      int pin =sc.nextInt();

while ( pin != entry )
		{
      
			System.out.println("\nPin does not match entry. TRY AGAIN.");
      pinCounter--;
      if (pinCounter ==0){
        System.out.println("\nYou Have Exceeded Maximum Attempts.");
        System.out.println("Call Customer Service For Further Assistance.");
        System.exit(0);
      }
      	System.out.print("ENTER YOUR PIN: " );
      	pin = sc.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
  

		while (session) {



		
    System.out.println("\nHELLO MR. COTO. WHAT WOULD YOU LIKE TO DO TODAY?");		

      

			// Present the user with a menu of 5 options

			System.out.print("========================\n"
							 +"ATM Menu: \n \n"
							 + "1. Deposit Money \n"
							 + "2. Withdraw Money \n"
							 + "3. Transfer Funds \n"
							 + "4. Check Account Balance\n"
							 + "5. End Session\n"
							 + "========================\n"
							 + "\nEnter selection: ");

			int selection = sc.nextInt(); // assign the user's input to the selection variable

			// This switch block will handle one of five selections and deal with them appropriately

			switch (selection) {

				// Case 1 handles the depositing of money

// Requirement: You can only deposit cash up to $100 and checks up to $9,999.99

// 
				case 1:
					System.out.print("\nEnter (1) for Savings or (2) for Checking: ");

					int depAccount = sc.nextInt(); // Keeps track of which account to deposit money to

					if (depAccount == 1) {

						System.out.println("\nYour current Savings balance is: " + formatter.format(savings.getBalance()) + "\n");

            System.out.println("Enter (1) for Cash or (2)  for Checks? \n");
            
            // Handles Option for Cash or Check
            int cashOrCheck =sc.nextInt();

            if (cashOrCheck ==1){
                System.out.println("\nYou can only deposit cash up to $100. Please insert Your Cash: \n");

                System.out.println("How much money would you like to deposit?");
						 cash = sc.nextDouble();
             if (cash>100){
               System.out.println("\n Cash Deposit exceeds $100.00. No action Taken. Return to main menu.");

            }
            if(cash <=100){
              
                savings.deposit(cash);
                	System.out.println("\nYour Savings balance is now: " + formatter.format(savings.getBalance()) + "\n");

            }
           
            }
            else if (cashOrCheck ==2){
               System.out.println("\nYou can only deposit checks up to $9,999.99. Please insert check:\n");

            System.out.println("How much money would you like to deposit?");
						 check = sc.nextDouble();


            if (check>9999.99){
               System.out.println("\n Cash Deposit exceeds $9999.99. No action Taken. Return to main menu.");

            }
            if (check <=9999.99){
                check += deposit;
                savings.deposit(deposit);
	System.out.println("\nYour Savings balance is now: " + formatter.format(savings.getBalance()) + "\n");
            }
					
					
						

					}
          
          }

					else if (depAccount == 2) {
						
						System.out.println("\nYour current Checking balance is: " + formatter.format(checking.getBalance()) + "\n");

            System.out.println("Enter (1) for Cash or (2)  for Checks? \n");
            
            // Handles Option for Cash or Check
            int cashOrCheck =sc.nextInt();

            if (cashOrCheck ==1){
                System.out.println("\nYou can only deposit cash up to $100. Please insert Your Cash: \n");

                System.out.println("How much money would you like to deposit?");
						 cash = sc.nextDouble();
             if (cash>100){
               System.out.println("\n Cash Deposit exceeds $100.00. No action Taken. Return to main menu.");

            }
            if(cash <=100){
              
                checking.deposit(cash);
                	System.out.println("\nYour Savings balance is now: " + formatter.format(checking.getBalance()) + "\n");

            }

                   }
            else if (cashOrCheck ==2){
               System.out.println("\nYou can only deposit checks up to $9,999.99. Please insert check:\n");

            System.out.println("How much money would you like to deposit?");
						 check = sc.nextDouble();


            if (check>9999.99){
               System.out.println("\n Cash Deposit exceeds $9999.99. No action Taken. Return to main menu.");

            }
            if (check <=9999.99){
                checking.deposit(check);
	System.out.println("\nYour Savings balance is now: " + formatter.format(checking.getBalance()) + "\n");
            }
            }

					}

					break;

				

				// Case 2 handles the withdrawal of money	
        
// Requirement: A max of $300 daily limit for withdraw

				case 2:
					System.out.print("\nEnter (1) for Savings or (2) for Checking: ");
					int witAccount = sc.nextInt(); // Keeps track of which account to withdraw from

					if (witAccount == 1) {

						System.out.println("\nYour current Savings balance is: " + formatter.format(savings.getBalance()) + "\n");

						System.out.println("How much money would you like to withdraw?");
						double withdraw = sc.nextDouble();

             if (withdraw > withdrawalLimit){
               System.out.println("\nWithdrawal is over the daily limit.");
             }
          
           if (withdrawalTally >= withdrawalLimit){
                  System.out.println("\nWithdrawal is over the daily limit.");
               
               
             }
           if (withdrawalTally >= withdraw){
                  System.out.println("\nWithdrawal is over the daily limit."); 
               
             }

            //  if (withdraw % twenty != 0){
            //   System.out.println( withdraw % twenty != 0);
            //  }
             
// Requirement: The ATM can only give 20 (make sure the ATM corrects this if user enters different)
            if(withdraw <= withdrawalLimit &&  withdrawalTally < withdrawalLimit) {
              if ( withdraw % twenty != 0){
                
             System.out.println("\nATM Can only dispense $20.00 bills. Please start your transaction over.");

              }
              else {
                
                withdrawalTally += withdraw;
                savings.withdraw(withdraw);
              }
             }
            


						System.out.println("\nYour Savings balance is now: " + formatter.format(savings.getBalance()) + "\n");
						

					}

					else if (witAccount == 2) {
						
						System.out.println("\nYour current Checking balance is: " + formatter.format(checking.getBalance()) + "\n");

						System.out.println("How much money would you like to withdraw?");
						double withdraw = sc.nextDouble();

 if (withdraw > withdrawalLimit){
               System.out.println("\nWithdrawal is over the daily limit.");
             }
          
           if (withdrawalTally >= withdrawalLimit){
                  System.out.println("\nWithdrawal is over the daily limit.");
               
               
             }
           if (withdrawalTally >= withdraw){
                  System.out.println("\nWithdrawal is over the daily limit."); 
               
             }
             // 300 = 300
            if(withdraw <= withdrawalLimit &&  withdrawalTally < withdrawalLimit) {
              if ( withdraw % twenty != 0){
                
             System.out.println("\nATM Can only dispense $20.00 bills. Please start your transaction over.");

              }
              else {
                
                withdrawalTally += withdraw;
                checking.withdraw(withdraw);
              }
             }


						System.out.println("\nYour Checking balance is now: " + formatter.format(checking.getBalance()) + "\n");

					}

					break;

				// case 3 handles the transfer of funds	

				case 3:
					System.out.print("\nFrom which account do you wish to transfer funds from?, (1) for Savings or (2) for Checking: ");
					int tranAccount = sc.nextInt();

					if (tranAccount == 1) {

						System.out.println("\nYour current Savings balance is: " + formatter.format(savings.getBalance()) + "\n");

						System.out.print("How much money do you wish to transfer from Savings to Checking?: ");
						double tranAmount = sc.nextDouble();

						savings.withdraw(tranAmount);
						checking.deposit(tranAmount);

						System.out.println("\nYou successfully transferred " + formatter.format(tranAmount) + " from Savings to Checking");

						System.out.println("\nChecking Balance: " + formatter.format(checking.getBalance()));
						System.out.println("Savings Balance: " + formatter.format(savings.getBalance()) + "\n");

					}

					else if (tranAccount == 2) {

						System.out.println("\nYour current Checking balance is: " + formatter.format(checking.getBalance()) + "\n");

						System.out.print("How much money do you wish to transfer from Checking to Saving?: ");
						double tranAmount = sc.nextDouble();

						checking.withdraw(tranAmount);
						savings.deposit(tranAmount);

						System.out.println("\nYou successfully transferred " + formatter.format(tranAmount) + " from Checking to Savings");

						System.out.println("\nChecking Balance: " + formatter.format(checking.getBalance()));
						System.out.println("Savings Balance: " + formatter.format(savings.getBalance()) + "\n");
						
					}

					break;
					
				// case 4 simply outputs the balances of both Checking and Savings accounts	
				
				case 4:
					System.out.println("\nChecking Balance: " + formatter.format(checking.getBalance()));
					System.out.println("Savings Balance: " + formatter.format(savings.getBalance()) + "\n");
					
					break;

				// case 5 breaks out of the (while) loop when the user is finished using the ATM

				case 5:
					session = false;
					
					break;

			}				 	
			

		} // end of wile loop

		System.out.println("\nThank you for banking with us! Good Bye!\n");

	}

}


class Account {

	// Here we declare some variables that a typical bank account will have

	String type;
	double balance;
	double rate;
  int pin;
  int accountNum;



	void setPin(int p) {
		
		pin = p;
	}

  void setAccountNum(int a) {
		
		accountNum = a;
	}

	// The following methods are a combination of getter/setter methods as well
	// as two special deposit() and withdraw() methods

	void setType(String accType) {
		
		type = accType;
	}

	void setBalance(double accBal) {
		
		balance = accBal;
	}

	void setRate(double accRate) {
		
		rate = accRate;
	}

	void deposit(double dep) {
		
		balance += dep; // Take the Account object's balance and add to it the current deposit
	}

	void withdraw(double wit) {
		
		balance -= wit; // Take the Account object's balance and subtract from it the current withdrawal
	}


	String getType() {
		
		return type;
	}

	double getBalance() {
		
		return balance;
	}

	double getRate() {
		
		return rate;
	}

}
