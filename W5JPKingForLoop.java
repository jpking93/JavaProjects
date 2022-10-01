/* IPO Chart
Input: Ask user for input and store in String variables of their first name (firstName), 
last name (lastName), birth year (birthYear), favorite year of life (favYear), 
and current year (CurrentYear).
Process: Use for loop to print a message for each year of users life telling them their age
at each year. Use if/else statement to designate the user's favorite year of life.
Output: Output the users age at each year and an additional message denoting the user's
favorite year of life.
*/
package w5jpkingforloop;

// import java.util.*
import java.util.*;
/**
 *
 * @author jpking
 */
public class W5JPKingForLoop {

    
    public static void main(String[] args) {
        
        // create new Scanner object
        Scanner input = new Scanner(System.in);
        
        // ask user to enter first name
        System.out.print("Enter your first name: ");
        // read input and store in String firstName
        String firstName = input.next();
        
        // ask user to enter last name
        System.out.print("Enter your last name: ");
        // read input and store in String lastName
        String lastName = input.next();
        
        // ask user to enter birth year
        System.out.print("Enter your birth year: ");
        // read input and store in int birthYear
        int birthYear = input.nextInt();
        
        // ask user for their favorite year of life
        System.out.print("What was the best year of your life? ");
        // read input and store in int favYear
        int favYear = input.nextInt();
        
        // ask user to enter the current year
        System.out.print("Enter the current year: ");
        // read input and store in int currentYear
        int currentYear = input.nextInt();
        
        // initalize int variable age to calculate age of user
        int age = currentYear - birthYear;
        
        // using for loop to iterate through each year from birthYear to CurrentYear and print message
        for (int i = 0; i <= age; i++) {
           
            // initialize int variable to keep track of year for each iteration of loop
            int loopYear = birthYear + i;
            
            // store message to user telling them how old they were each year in String variable message
            String message = firstName + " " + lastName + " is " + i + " years old in " + loopYear;
            
            // use if/else statment to add *My Favorite Year to message on user's favorite year
            if (loopYear == favYear) {
                System.out.println(message + " *My Favorite Year.");
            } else {
                System.out.println(message);
            } // end of if/else
           
        } // end of for loop
        
    } // end of main method
    
} // end of public class
