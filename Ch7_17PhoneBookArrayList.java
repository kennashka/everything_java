/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kennashka
 */


/*

* 17. phone Book ArrayList 
Write a class named PhoneBookEntry that has fields 
for a person’s name and phone number. 
The class should have a constructor and appropriate accessor and mutator methods. 
Then write a program that creates at least five PhoneBookEntry objects and stores them in an ArrayList. 
Use a loop to display the contents of each object in the ArrayList.  


*/
   import java.util.*;


public class Ch7_17PhoneBookArrayList {
// initiate variables for the name and number
    private String name;
    private String number;

    
    // phone book class that takes in two parameter
    public Ch7_17PhoneBookArrayList(String name, String number) {
        this.name=name;
        this.number=number;
    }
    
    
    // method to get name
    public String getName() {
        return name;
    }
    
// name setter
    public void setName(String name) {
        this.name = name;
    }

    // method to get number

    public String getNumber() {
        return number;
    }
//number setter
    public void setNumber(String number) {
        this.number = number;
    }

// main function to add name and number entries and prints it to the screen
    public static void main(String[] args) {
        List<Ch7_17PhoneBookArrayList> phoneList = new ArrayList<Ch7_17PhoneBookArrayList>();
        phoneList.add(new Ch7_17PhoneBookArrayList("John Smith","786.555.1234"));
        phoneList.add(new Ch7_17PhoneBookArrayList("Jane Brown","786.555.1235"));
        phoneList.add(new Ch7_17PhoneBookArrayList("Jose Vargas","786.555.1236"));
        phoneList.add(new Ch7_17PhoneBookArrayList("Armen Avetian","786.555.1237"));
        phoneList.add(new Ch7_17PhoneBookArrayList("Xin Liu","305.555.1238"));
        phoneList.add(new Ch7_17PhoneBookArrayList("James White","305.555.1239"));
        phoneList.add(new Ch7_17PhoneBookArrayList("Julie McGuiness","305.555.1240"));
        phoneList.add(new Ch7_17PhoneBookArrayList("Juan Ballardos","305.555.1241"));
        phoneList.add(new Ch7_17PhoneBookArrayList("Jose London","305.555.1242"));
        phoneList.add(new Ch7_17PhoneBookArrayList("Hello World","305.555.1243"));
        for (Ch7_17PhoneBookArrayList entry : phoneList) {
            System.out.println("First Name: " + entry.getName().split(" ")[0]);
            System.out.println("Last Name: " + entry.getName().split(" ")[1]);
            System.out.println("Phone Number: " + entry.getNumber());
            System.out.println();
        }
    }

         

}
    
    

