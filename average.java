import java.util.Scanner; // import the Scanner class 


class average {
  public static void main(String[] args) {
    System.out.println("Test Average 🧮");

int score1;
int score2;
int score3;
int average;
int add_num;

    /*
10. Test average
Write a program that asks the user to enter three test scores. The program should display each test score, as well as the average of the scores.
  */

Scanner sc = new Scanner(System.in);

System.out.println("\nEnter your three test scores: ");

score1 =sc.nextInt();
score2 =sc.nextInt();
score3 =sc.nextInt();

System.out.print(score1);
System.out.print(" ");
System.out.print(score2);
System.out.print(" ");
System.out.print(score3);

add_num = score1 + score2 + score3;



average = add_num / 3;

System.out.print("\n" + "The average of your three test scores: " + average);
  }
}
