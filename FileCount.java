/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kenya
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;





public class Midterm {
            public static void main(String[] args) 
 throws IOException  {


        // The target file name and location
        File out = new File("C:\\Users\\kennashka.desilva001\\Desktop\\number.txt");
        FileWriter fw = null;  // set to null
        
        int n = 512; // initialize n
        
        String[] words=null;  // set the word to null
        
              int wc=0;     //Intialize word count to zero

        // Try block: Most stream operations may throw IO exception
        try {
            // Create file writer object
            fw = new FileWriter(out);
            // Wrap the writer with buffered streams
            BufferedWriter writer = new BufferedWriter(fw);
            int line = 0;
            Random random = new Random();
            while (n > 0) {
                // Randomize an integer and write it to the output file
                line = random.nextInt(100);
                
                writer.write("\n" + line );
                writer.newLine(); //
          
                n--;
            }
            System.out.print("test: " + line);
            // Close the stream
            writer.close();
        } catch (IOException e) {
            System.exit(0);
            
        }
   // count file
   
   // code to append
   
   
 
    
    
    //code to append
int x; 

 Scanner inputStream = null; 

     inputStream = new Scanner( new File("C:\\Users\\kennashka.desilva001\\Desktop\\number.txt") ); 
 
      FileWriter  outputFile = new FileWriter ("C:\\Users\\kennashka.desilva001\\Desktop\\number.txt", true);      
         PrintWriter printWriter = new PrintWriter(outputFile);
         printWriter.println("------------------------------------------------- Numbers greater than 8 ----------------------------------------------------------------");  //New line
         
  while( inputStream.hasNextInt() ){ 
 x = inputStream.nextInt(); 
  if(x > 8){
    printWriter.println(x); 

   }
 } 
   printWriter.close();  
    inputStream.close(); 

    // Create a program to generate 100 random integer numbers and save it in a file named number.txt.
// After this the program should input FROM THE FILE and count how many numbers are greater than 8.
// The program should then append to file number.txt with a line that says: There are X (number you found) integers greater than 8.
   
//        File f1=new File("/Users/kenya/Downloads/number.txt"); //Creation of File Descriptor for input file
//
//      FileReader fr = new FileReader(f1);    //Creation of File Reader object
//      BufferedReader br = new BufferedReader(fr);    //Creation of BufferedReader object
//      String s;
//      
//      
//      while((s=br.readLine())!=null)    //Reading Content from the file
//      {
//          
//         words=s.split(" ");   //Split the word using space
//         wc=wc+words.length ; //increase the word count for each word
//         
//      }
//      fr.close();
//      System.out.println("Number of words in the file:" +wc);    //Print the word count
//        

// count 


    }
}
