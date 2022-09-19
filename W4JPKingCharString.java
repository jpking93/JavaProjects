/* IPO Chart
Input: Prompt user to enter 3 of their favorite foods and store in String array
       favFoods.
Process: Read user input and sort favFoods array into alphabetical order by using the
         Array.sort() method
Output: Print each element of alphabetized favFoods array to output list of user's
        favorite foods in alphabetical order.
*/

package w4jpkingcharstring;
// Import java.util library
import java.util.*;
/**
 *
 * @author jpking
 */
public class W4JPKingCharString {

    
    public static void main(String[] args) {
        
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // create an array to store the foods user enters
        String[] favFoods = new String[3];
        
        // prompt user to enter a favorite food
        System.out.print("What is one of your favorite foods?: ");
        // read user input and store in favFoods array
        favFoods[0] = input.next();
        
        // prompt user to enter another favorite food
        System.out.print("What is another of your favorite foods?: ");
        // read user input and store in favFoods array
        favFoods[1] = input.next();
        
        // prompt user to enter a third favorite food
        System.out.print("Name one more of your favorite foods: ");
        // read user input and store in favFoods array
        favFoods[2] = input.next();
        
        // use array sort method to put array in alphabetical order
        Arrays.sort(favFoods);
        
        // output first element of favFoods
        System.out.println(favFoods[0]);
        // output second element of favFoods 
        System.out.println(favFoods[1]);
        // output third element of favFoods
        System.out.println(favFoods[2]);
        
    }
    
}
