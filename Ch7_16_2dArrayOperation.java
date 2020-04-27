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

16. 2d array operation
Write a program that creates a two-dimensional array initialized with test data.
Use any primitive data type that you wish. 
The program should have the following methods: 
* getTotal. This method should accept a two-dimensional array 
as its argument and return the total of all the values in the array.  
* getAverage. This method should accept a two-dimensional array as its argument 
and return the average of all the values in the array.  
* getRowTotal. This method should accept a two-dimensional array as its 
first argu- ment and an integer as its second argument. 
The second argument should be the sub- script of a row in the array.
The method should return the total of the values in the specified row.  
* getColumnTotal. This method should accept a two-dimensional array as its first argu- ment and an integer as its second argument. 
The second argument should be the sub- script of a column in the array. 
The method should return the total of the values in the specified column.  
* getHighestInRow. This method should accept a two-dimensional array as its first argument and an integer as its second argument. 
The second argument should be the subscript of a row in the array. 
The method should return the highest value in the specified row of the array.  
* getLowestInRow. This method should accept a two-dimensional array as its first argu- ment and an integer as its second argument. 
The second argument should be the sub- script of a row in the array. 
The method should return the lowest value in the specified row of the array. 
Demonstrate each of the methods in this program.  

*/

    
    
     
    
         

import java.util.*;
    public class Ch7_16_2dArrayOperation
   {
      public static void main(String[] args)
      {Scanner in = new Scanner(System.in); // create scanner class for userinput
        int n,i,j;   // initiate variables
        System.out.print("Enter size of matrix: "); // prompts for user input
        n=in.nextInt(); // saves the size of the matrix
        while(n<2)  // if the size is less than 2 then we prompt user to enter another number
           {System.out.println("size must be at least 2"); 
            System.out.print("Enter size of matrix: "); 
           n=in.nextInt();
            }       
        int [][] a = new int [n][n]; // creating an integer 2d array
      Random r=new Random();             //fill the matrix with random numbers
        for(i=0;i<n;i++)     
           for(j=0;j<n;j++)
               {
                a[i][j]=r.nextInt(500);
                }
        System.out.println("The Matrix:");     //print matrix
        for(i=0;i<n;i++)
           {for(j=0;j<n;j++)
               System.out.print(a[i][j]+"\t");
            System.out.println(" ");
            }
        System.out.println("The total of all elements is "+getTotal(a));
        System.out.println("The average of all elements is "+getAverage(a));
        System.out.println("The total of all elements in row 3 is "+getRowTotal(a,3));
        System.out.println("The total of all elements in column 3 is "+getColumnTotal(a,3));
        System.out.println("The highest element in row 3 is "+getHighestInRow(a,3));
        System.out.println("The lowest element in column 3 is "+getLowestInRow(a,3));
    }
public static int getTotal(int a[][])
{int i,j,tot=0;
for(i=0;i<a.length;i++)                                           //for each row
    for(j=0;j<a[0].length;j++)                                //for each column
          tot+=a[i][j];                                             //add the elements
return tot;
}
public static double getAverage(int a[][])
{return (double)getTotal(a)/(a.length*a[0].length);              //get the total and divide by number of elements
}
public static int getRowTotal(int a[][],int n)                    //add all elements in row n
{int j,tot=0;
    for(j=0;j<a[0].length;j++)
          tot+=a[n][j];
return tot;
}
public static int getHighestInRow(int a[][],int n)              //look for highest in row n
{int j,max=a[n][0];
    for(j=0;j<a[0].length;j++)
          if(a[n][j]>max)
                 max=a[n][j];
return max;
}
public static int getLowestInRow(int a[][],int n)                 //look for lowest in row n
{int j,low=a[n][0];
    for(j=0;j<a[0].length;j++)
          if(a[n][j]<low)
                 low=a[n][j];
return low;
}

public static int getColumnTotal(int a[][],int n)                 //add all elements in column n
{int j,tot=0;
    for(j=0;j<a.length;j++)
          tot+=a[j][n];
return tot;
}

}
    
    
    
