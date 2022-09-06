package w2yournamevariables;

/* IPO Chart
Input: User name and date information
Processing: Calculate current user age, their age in 10 years and their age
            5 years ago.
Output: User name and age data with their current age, age in 10 years and
        age 5 years ago calulated.
*/

// Import java.util.Scanner library
import java.util.Scanner;

/**
 *
 * @author jpking
 */

public class W2YourNameVariables {

    public static void main(String[] args) {
        
        // Create new scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt user for first name, read and store input in variable
        System.out.print("What is your first name?: ");
        String firstName = input.next();
        
        // Prompt user for last name, read and store input in variable
        System.out.print("What is your last name?: ");
        String lastName = input.next();
        
        // Prompt user for birth year, read and store input in variable
        System.out.print("What year were you born?: ");
        int birthYear = input.nextInt();
        
        // Prompt user for current year, read and store input in variable
        System.out.print("What is the current year?: ");
        int currentYear = input.nextInt();
        
        // Calculate user age and store it in userAge
        int userAge = currentYear - birthYear;
        
        // Calculate user age in 10 years and store it in ageInTen
        int ageInTen = userAge + 10;
        
        // Calculate user age 5 years ago and store it in ageFiveYearsAgo
        int ageFiveYearsAgo = userAge - 5;
        
        // Print user first name
        System.out.println("Your First Name: " + firstName);
        
        //Print user last name
        System.out.println("Your Last Name: " + lastName);
        
        // Print user full name
        System.out.println("Your Full Name: " + firstName + " " + lastName);
        
        // Print user birth year
        System.out.println("Your Birth Year: " + birthYear);
        
        // Print user age
        System.out.println("Your Age This Year: " + currentYear + " - " + birthYear + " = " + userAge);
        
        // Print user age in 10 years
        System.out.println("Your Age in 10 Years: " + userAge + " + 10 = " + ageInTen);
        
        // Print user age 5 years ago
        System.out.println("Your Age 5 Years Ago: " + userAge + " + 5 = " + ageFiveYearsAgo);
    }
}
