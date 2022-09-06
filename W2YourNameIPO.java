package w2yournameipo;

// Import java.util.Scanner library
import java.util.Scanner;

/**
 *
 * @author jpking
 */

public class W2YourNameIPO {

    
    public static void main(String[] args) {
   
        String favFood; // Initialize favorite food variable
        int favNumber; // Initialize favorite number variable
        float hourlyPay; // Initialize salary variable
       
        // Create new scanner object
        Scanner input = new Scanner(System.in);
        
        // Ask user their favorite food, read and store input in favFood
        System.out.print("What is your favorite food?: ");
        favFood = input.next();
        
        // Ask user their favorite number, read and store input in favNumber
        System.out.print("What is your favorite number?: ");
        favNumber = input.nextInt();
        
        // Ask user their hourly pay, read and store input in hourlyPay
        System.out.print("What is your hourly pay rate?: ");
        hourlyPay = input.nextFloat();
        
        // Print message to user based on their input
        System.out.println("Your favorite food is " + favFood);
        System.out.println("Your favorite number is " + favNumber);
        System.out.println("Your hourly pay is " + hourlyPay);
        
    }
    
}
