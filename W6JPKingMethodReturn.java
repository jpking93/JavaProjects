/* IPO Chart
Input: ask user to enter their: first name (String firstName), last name (String lastName),
weight (double weight), and height (double height)
Process: call method bmiCaclulator which will stores results of (weight / (height * height))
in double bmi and then returns the values of bmi. Which is then stored in a new double also
called bmi within the main method
Ouput: Print message to user telling them their bmi using formatted output and the value of bmi
*/

package w6jpkingmethodreturn;
// import java.util library
import java.util.*;
/**
 *
 * @author jpking
 */
public class W6JPKingMethodReturn {

    
    public static void main(String[] args) {
        
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // ask user for their first name
        System.out.print("What is your first name?: ");
        // read input and store in String firstName
        String firstName = input.next();
        
        // ask user for their last name
        System.out.print("What is your last name?: ");
        // read input and store in String lastName
        String lastName = input.next();
        
        // ask user for their weight
        System.out.print("Enter your weight in lbs: ");
        // read input and store in int weight
        double weight = input.nextDouble();
        
        // ask user for their height
        System.out.print("Enter your height in inches: ");
        // read input and store in int height
        double height = input.nextDouble();
        
        // store return value of bmiCalculator to double bmi
        double bmi = bmiCalculator(weight, height);
        
        // print formatted output to tell user their bmi rounded to 2 decimal places
        System.out.printf("%s %s's BMI is %5.2f%n", firstName, lastName, bmi);
    }
    
    // define method that takes two doubles height and weight as parameters and returns an int 
    // that is the user's calculated bmi
    public static double bmiCalculator(double weight, double height) {
        
        // perform bmi calculation and store in double bmi
        double bmi = (weight / (height * height)) * 703;
        
        // have the method return the value of bmi
        return bmi;
        
    }
    
}
