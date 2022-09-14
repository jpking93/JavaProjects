/* IPO Chart
   Input: Did user eat their meat (yes or no).
   Process: Use if/else statement to convert user input to boolean and determine
            correct output message.
   Output: Print message to user telling them whether they can have their pudding.
*/

package w3jpkingifelse;

// Import java.util.Scanner library
import java.util.Scanner;
/**
 *
 * @author jpking
 */
public class W3JPKingIFElse {

    public static void main(String[] args) {
        
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // declare variable ateMeat as a String
        String ateMeat;
        
        // output message to user asking them if they ate their meat
        System.out.print("Did you eat your meat?: ");
        // read user input and store it in variable ateMeat
        ateMeat = input.next();
        
        // if else statement to respond to user based on whether they have eaten their meat or not
        // using String equals method to compare user input to string "Yes"
        if (ateMeat.equals("Yes")) {
            System.out.println("You can have your pudding.");
        } else {
            System.out.println("How can you have your pudding if you do not eat your meat?");
        }  
        
    }
    
}
