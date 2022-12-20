
package w10jpkingfileoutput;

// import libraries
import java.util.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author jpking
 */
public class W10JPKingFileOutput {
    
    /* IPO Chart
    Input: Open Inputfile with java.io.File
    Process: Call method output on file
    Output: Pass contents of InputFile to output method
    */

    public static void main(String[] args) {
        
        // create a file instance
        java.io.File file = new java.io.File("/Users/jpking/desktop/InputFile.txt");
        
        // call output method on file
        output(file);
    }
    
    /*IPO Chart
    Input: Pass in file from main method as parameter.
    Process: create a new scanner object and a new PrintWriter object. Read through the file using
    a while loop to keep looping while the file has more text and then write the text to the Output file
    adding a space after each word. If the file is not found handle the exception by printing a message to
    user telling them the file was not found.
    Output: Write text from InputFile to Output File
    */
    
    // create method output to print contents of file passed in to output file
    public static void output(java.io.File file) {
        
        // try block to handle FileNotFoundException
        try {
            
            // create new scanner object
            Scanner input = new Scanner(file);
            
            // create new PrintWriter object
            PrintWriter output = new PrintWriter("/Users/jpking/desktop/OutputFile.txt");
            
            // read input file and write contents to output file
            while(input.hasNext()) {
            
                output.print(input.next() + " "); 
              
            }
            
            // close the file
            output.close();
            
            // close scanner
            input.close();
           
        // catch if the file is not found    
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
        
    }
    
}
