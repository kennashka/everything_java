class energyDrinkConsumption {
  public static void main(String[] args) {

int surveyed = 12467;

float energy_drink_percentage =.14f;

    int num_of_cus1;

    int num_of_cus2;

float citrus_percentage = .64f;

System.out.println("\nNumber of individuals surveyed: " + surveyed);

float num_of_cus3 = surveyed * energy_drink_percentage; 

System.out.println("\nThe approximate number of customers in the survey who purchase one or more energy drinks per week: " + num_of_cus3);

float num_of_cus4 = num_of_cus3 * citrus_percentage;

System.out.println("\nThe approximate number of customers in the survey who prefer citrus-flavored energy drinks: " + num_of_cus4 );



/*

16. energy Drink consumption
A soft drink company recently surveyed 12,467 of its customers and found that approxi- mately 14 percent of those surveyed purchase one or more energy drinks per week. Of those customers who purchase energy drinks, approximately 64 percent of them prefer citrus-
flavored energy drinks. Write a program that displays the following:
• The approximate number of customers in the survey who purchase one or more energy drinks per week
• The approximate number of customers in the survey who prefer citrus-flavored energy drinks

*/

  }
}
