package jpkingfinalproject;
import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;

/**
 *
 * @author jpking
 */
public class JPKingFinalProject {
    
    /* IPO Chart
    Input: Use scanner to read in .csv file
    Processing: Initialize variables to store data and then use while loop and .hasNext() to read through file.
                Store each line of the file in a String and then use .split(",") to split the data into an array.
                Use setter methods to set the indexes of the array to the object fields.
    Output: Use PrintWriter to write the output of the country with the highest and lowest human rights score by using
            output.print and calling the best() and worst() method from the country class on the countryArray.
    */

    public static void main(String[] args) {
        
        try { // try statement for try/catch block to catch FileNotFoundException
            
            // create new file called projectData
            File projectData = new File("/Users/jpking/desktop/DistributionHumanRightsVdem.csv");
            
            // create new scanner object that reads in projectData file
            Scanner input = new Scanner(projectData);
            
            // initialize variables to contains Strings of file lines, elements of array after splitting, Country objects
            // and counter for while loop.
            String str;
            String[] tokens;
            Country[] countryArray = new Country[186];
            int counter = 0;
            
            // skip first line of file that contains headers for the data columns
            input.nextLine();

            // tell scanner to keep reading file while the file has more contents
            while (input.hasNext()) {
                
                // create a string variable out of each line of the data file
                str = input.nextLine();
                
                // split the string of the file on commas into an array called tokens
                tokens = str.split(",");
                
                // create new Country object called country
                Country country = new Country();
                
                // use setYear method to set the value of the third element in the tokens array to year field
                country.setYear(Integer.parseInt(tokens[2]));
                
                // use getter method to get only the 2021 data from the file
                if (country.getYear() == 2021) {
                
                // use setter methods for countryName and countryCode to set their values to the first and second elements
                // of the tokens array
                country.setCountryName(tokens[0]);
                country.setCountryCode(tokens[1]);
                
                // if the fourth element of tokens is not an empty string use the setter method to set humanRightsScore 
                // to the fourth elemenent of the array
                if (tokens[3] != "") {
                
                    country.setHumanRightsScore(Double.parseDouble(tokens[3]));
                
                } 
                
                // use setRegion method to set the region field to the value of the fifth element of tokens
                country.setRegion(tokens[4]);
                
                // set the index of the array of counter to the country object created
                countryArray[counter] = country;
                
                // increment counter by 1
                counter ++;
                
                }
                
            }
            
            // close the scanner
            input.close();
            
            // create new file to write to
            java.io.PrintWriter output = new java.io.PrintWriter("/Users/jpking/desktop/FinalProjectOutput.txt");
            
            // write to the results output to the FinalProjectOutput file
            output.print(countryArray[0].best(countryArray) + "\n");
            output.print(countryArray[0].worst(countryArray));
            
            // close the output file so the changes are stored
            output.close();
           
        // catch block to print message if the file is not found    
        } catch (FileNotFoundException ex) {
            
            // if the is a FileNotFoundException print the message "File not found"
            System.out.println("File not found.");
        }
        
    }
    
}
