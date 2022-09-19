/* IPO Chart
Input: Prompt user to enter their 3 favorite foods and store them as String variables
       food1, food2, and food3
Process: Read user input and compare the first character of each food entered using
         String.charAt(0); and an if else statement to put alphabetize the user's favorite
         foods.
Output: print food1, food2, and food3 in alphabetical order
*/

package w4jpkingnestedcharstring;
// import java.util library
import java.util.*;
/**
 *
 * @author jpking
 */
public class W4JPKingNestedCharString {

    
    public static void main(String[] args) {
        
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // prompt user to enter a favorite food
        System.out.print("What is one of your favorite foods?: ");
        // read user input and store in String food1
        String food1 = input.next();
        
        // prompt user to enter another favorite food
        System.out.print("What is another of your favorite foods?: ");
        // read user input and store in String food2
        String food2 = input.next();
        
        // prompt user to enter a third favorite food
        System.out.print("Name one more of your favorite foods: ");
        // read user input and store in String food3
        String food3 = input.next();
        
        
        /* If else statement to compare first character of each string (food1, food 2, and food3) 
        passed in to determine alphabetical order and then print the user an alphabetized list of
        their favorite foods*/
        
        if (food1.charAt(0) < food2.charAt(0) && food2.charAt(0) < food3.charAt(0)) {
            System.out.println(food1);
            System.out.println(food2);
            System.out.println(food3);
        } else if (food1.charAt(0) < food3.charAt(0) && food3.charAt(0) < food2.charAt(0)) {
            System.out.println(food1);
            System.out.println(food3);
            System.out.println(food2);
        } else if (food2.charAt(0) < food1.charAt(0) && food1.charAt(0) < food3.charAt(0)) {
            System.out.println(food2);
            System.out.println(food1);
            System.out.println(food3);
        } else if (food2.charAt(0) < food3.charAt(0) && food3.charAt(0) < food1.charAt(0)) {
            System.out.println(food2);
            System.out.println(food3);
            System.out.println(food1);
        } else if (food3.charAt(0) < food1.charAt(0) && food1.charAt(0) < food2.charAt(0)) {
            System.out.println(food3);
            System.out.println(food1);
            System.out.println(food2);
        } else {
            System.out.println(food3);
            System.out.println(food2);
            System.out.println(food1);
        }
    
    }
    
}
