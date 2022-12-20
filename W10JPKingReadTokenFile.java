
package w10jpkingreadtokenfile;

// import java.util.* and FileNotFoundException libraries
import java.util.*;
import java.io.FileNotFoundException;

/**
 *
 * @author jpking
 */
public class W10JPKingReadTokenFile {

    /* IPO Chart
    Input: use java.io.File to open file sample.csv
    Process: Call method formatData on file
    Output: Prints out table from sample.csv
    */
    
    public static void main(String[] args) {
        
        // create a file instance
        java.io.File file = new java.io.File("/Users/jpking/desktop/sample.csv");
        
        // call format data method
        formatData(file);
 
   }
    
    /* IPO Chart
    Input: Bring in file from main method by passing in as parameter
    Process: Use scanner object and set the delimiter as ",". Use while
    loop to iterate through table and print out data
    Output: Print out table contents from .csv file
    */
    
    
    // method printData that prints contents of .csv file
    public static void formatData(java.io.File file) {
        
        // try block to handle FileNotFoundException
        try {
   
            // create new scanner object
            Scanner input = new Scanner(file);
            
            // set scanner to use "," as its delimiter
            input.useDelimiter(",");
            
            // Tried about 1,000 different things to format the table, and I still can't figure it out.
          
            // while there is another input
            while (input.hasNext()) {
                
                // print the next input
                System.out.print(input.next());
            
            }
           
            // close scanner
            input.close();
            
          // catch block to print message if the file is not found  
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
        
    }
}