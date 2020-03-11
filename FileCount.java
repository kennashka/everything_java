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




public class FileCount {
            public static void main(String[] args) 
 throws IOException  {
//        	Random objGenerator = new Random();
//            for (int count = 0; count< 100; count++){
//              int randomNumber = objGenerator.nextInt(200);
//              System.out.println("Random No : " + randomNumber); 
//             }



        // The target file
        File out = new File("/Users/kenya/Downloads/number.txt");
        FileWriter fw = null;
        int n = 512;
        String[] words=null;   
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
                writer.write(line + "\n");
                n--;
            }
            System.out.print("test: " + line);
            // Close the stream
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
            
        }
   // count file
int x; 

 Scanner inputStream = null; 

     inputStream = new Scanner( new File("/Users/kenya/Downloads/number.txt") ); 
 
   while( inputStream.hasNextInt() ){ 
 x = inputStream.nextInt(); 
  if(x > 8){
    System.out.println(x); 
   }
 } 
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
    }
}

