/* IPO Chart
Input: Recieve user input of alligator temp and store in variable temperature
Process: Read user input and use if/else statement to determine the sex of alligator 
depending on the temperature entered.
Output: Output message telling user the sex of the alligator based on temperature
ranges for male and female alligators.
*/

package w3jpkingnestedifelse;

// import java.util.Scanner library
import java.util.Scanner;
/**
 *
 * @author jpking
 */
public class W3JPKingNestedIFELSE {

    public static void main(String[] args) {
        
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // declare int variable named temperature
        int temperature;
        
        // ask user for alligator temperature
        System.out.print("What is the alligator's current temperature?: ");
        // read user input and store in variable temperature
        temperature = input.nextInt();
        
        // if/else statement outputs sex of alligator depending on body temp input by user
        if (temperature < 86) {
            System.out.println("Female Alligator");
        } else if (temperature >= 86 && temperature <= 93) {
            System.out.println("Female and Male Alligators");
        } else {
            System.out.println("Male Alligator");
        }    
          
    }
}   