/* IPO Chart
Input: Prompt user to enter a number of degrees, read the input and store it in 
       double degrees.
Process: Convert degrees to radians with Math.toRadians() and store new value in
         double radians. Calculate Cosecant, Secant and Cotangent and store in
         double cosecValue, secValue, and cotValue respectively. If user enters
         and negative value or value greater than 360 print and error message and
         exit the program. Else if value is 0, 90, 180, 270, or 360 execute the code
         for those specific cases.
Output: If the value entered is 0, 90, 180, 270, or 360 output the values for those
        specific cases otherwise output the values for doubles cosecValue, secValue,
        and cotValue.
*/

package w4jpkingmath;

// Import the whole java.util library
import java.util.*;

/**
 *
 * @author jpking
 */
public class W4JPKingMATH {

    public static void main(String[] args) {

        // Create new scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the number of degrees
        System.out.print("How many degrees?: ");
        // Read user input and store in double variable degrees
        double degrees = input.nextDouble();

        // Convert user input from degrees to radians
        double radians = Math.toRadians(degrees);

        // find the cosecant
        double sinValue = Math.sin(radians);
        double cosecValue = (1 / sinValue);

        // find the cosine of user input
        double cosValue = Math.cos(radians);
        double secValue = (1 / cosValue);

        // find the cotangent of user input
        double tanValue = Math.tan(radians);
        double cotValue = (1 / tanValue);

        // Output message to user repeating what number of degrees they entered
        System.out.println("Below are the results for input " + degrees + " degrees:");

        // Print error message if user input is a negative number
        if (degrees < 0 || degrees > 360) {
            System.out.println("Error, only values between 0 and 360 can be entered.");
            System.exit(1);
        } else if (degrees == 0) { // give these results if user enters 0 degrees
            System.out.println("cosec = undefined");
            System.out.println("sec = " + secValue);
            System.out.println("cot = undefined");
        } else if (degrees == 90) { // give these results if user enters 90 degrees
            System.out.println("cosec = " + cosecValue);
            System.out.println("sec = undefined ");
            System.out.println("cot = 0");
        } else if (degrees == 180) { // give these results if user enters 180 degrees
            System.out.println("cosec = undefined");
            System.out.println("sec = " + secValue);
            System.out.println("cot = undefined");
        } else if (degrees == 270) { // give these results if user enters 270 degrees
            System.out.println("cosec = " + cosecValue);
            System.out.println("sec = undefined");
            System.out.println("cot = 0");
        } else if (degrees == 360) { // give these results if user enters 360 degrees
            System.out.println("cosec = undefined");
            System.out.println("sec = " + secValue);
            System.out.println("cot = undefined");
        } else { // give these results if user does not enter one of the above inputs
            System.out.println("cosec = " + cosecValue);
            System.out.println("sec = " + secValue);
            System.out.println("cot = " + cotValue);
        }

    }

}
