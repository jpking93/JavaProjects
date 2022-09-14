/* IPO Chart
   Input: Recieve user input for the number of sides of shape.
   Process: Read user input and run it through switch statment to determine which
            shape they entered based on the number of sides
   Output: Print message to user repeating the number of sides they entered and
           what a shape with that number of sides is called.
*/
package w3jpkingswitch;

// import java.util.Scanner library
import java.util.Scanner;
/**
 *
 * @author jpking
 */
public class W3JPKingSwitch {

    public static void main(String[] args) {
       
       // create new scanner object
       Scanner input = new Scanner(System.in);
       
       // ask user for number of sides for shape
       System.out.print("How many sides does the shape have?: ");
       // read user input and store in variable shapeSides
       int shapeSides = input.nextInt();
       
       /* 
       switch statment to determine message to output to user depending on the
       number of of sides the shape has.
       */
       
        switch (shapeSides) {
            case 3: // if shapeSides is 3 print this message
               System.out.println("A shape with 3 sides is called a triangle.");
               break;
            
            case 4: // if shapeSides is 4 print this message
               System.out.println("A shape with 4 sides is called a quadrilateral.");
               break;
               
            case 5: // if shapeSides is 5 print this message
               System.out.println("A shape with 5 sides is called a pentagon.");
               break;
               
            case 6: // if shapeSides is 6 print this message
               System.out.println("A shape with 6 sides is called a hexagon.");
               break;
               
            case 12: // if shapeSides is 12 print this message
               System.out.println("A shape with 12 sides is called a dodecagon.");
               break;
            
            default: // if shape sides is not one of the above numbers print this message
               System.out.println("Sorry, please enter a 3, 4, 5, 6, or 12.");
        
        }        
    
    }
    
}
