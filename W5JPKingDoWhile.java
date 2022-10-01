/* IPO Chart
Input: Player inputs their name each iteration of the loop and it is stored in
       String playerName.
Process: Use math.random() to generate a random number between 1 and 5 and
         store in int shortStraw. Initialize counter variable (int count).
         Use do/while loop to get player name and increment count by 1 until
         count equals shortStraw.
Output: Once count is equal to shortStraw output message to players telling them
        who drew the short straw.
*/
package w5jpkingdowhile;

// import java.util library
import java.util.*;
/**
 *
 * @author jpking
 */
public class W5JPKingDoWhile {

    
    public static void main(String[] args) {
        
        // create new sanner object
        Scanner input = new Scanner(System.in);
        
        // use math.random() to generate a random integer between 1 and 5
        int shortStraw = (int) (Math.random() * 5 + 1);
  
        // initialize counter variable
        int count = 0;
        
        // initialize playerName outside of the loop so it can be accessed outside of the loop
        String playerName;
        
        do {
            // Ask user who is drawing the straw
            System.out.print("Who is drawing the straw?: ");
            // read user input and store in String variable playerName
            playerName = input.next();
            // increment the conter variable by 1 each time through the loop
            count ++;
        } while (count != shortStraw); // keep looping as long as count is not equal to shortStraw
        
        // Output the name of the player who drew the short straw
        System.out.println(playerName + " drew the short straw!");
        
    }
    
}
