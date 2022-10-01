/* IPO Chart
Input: User inputs "duck" or "goose" which is stored in String variable duckOrGoose.
Process: While duckOrGoose is not equal to goose keep asking the user for input of
duck or goose and increment int ducks every time the user inputs "duck". If user enters
an input other than duck or goose print error message and do not increment ducks by 1. Go back to
top of while loop and re-ask user for input of duck or goose. When user enters "goose"
exit the loop.
Output: Print message to user telling them how many "ducks" were input before "goose".
*/
package w5jpkingsentinalloop;

// import java.util library
import java.util.*;
/**
 *
 * @author jpking
 */
public class W5JPKingSentinalLoop {

    
    public static void main(String[] args) {
        
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // initialize String duckorGoose and set to "Duck" to enter the loop
        String duckOrGoose = "Duck";
        
        // initialize count variable at -1 to account for duckOrGoose being set to duck
        int ducks = -1;
        
        // while loop to keep asking user for input until they enter goose
        while (duckOrGoose.equalsIgnoreCase("Goose") == false) {
            
            // ask user for input duck or goose
            System.out.print("Duck or Goose?: ");
            // read user input and assign to duckOrGoose
            duckOrGoose = input.next();
            
            // If user entered duck increment ducks by 1
            ducks ++;
            
            /* if statement to test whether user input either duck or goose, if not output error 
            message and go to next iteration of loop to re-ask question */
            if (duckOrGoose.equalsIgnoreCase("Duck") == false && duckOrGoose.equalsIgnoreCase("Goose") == false) {
                System.out.println("You have to enter either duck or goose.");
                // Subtract 1 from ducks so the invalids input does not count toward the total
                ducks--;
            } // end of if statement
            
        } // end of while loop
        
        // once user enters goose output message telling them how many ducks there were before goose
        System.out.println("There were " + ducks + " ducks before goose.");
    
    } // end of main method
    
} // end of public class
