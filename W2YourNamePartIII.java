/* IPO Chart
Input: Purchase total and tax rate
Processing: Calculate tax and add to subtoatal
Output: Total purchase cost with taxes included
*/

package w2yournamepartiii;

// Import java.util.Scanner library
import java.util.Scanner;

/**
 *
 * @author jpking
 */

public class W2YourNamePartIII {

    
    public static void main(String[] args) {
        
        // Create new scanner object
        Scanner input = new Scanner(System.in);
        
        // Ask user for subtotal of purchase, read input and store it in subtotal
        System.out.print("What is the subtotal of your purchase?: ");
        float subtotal = input.nextFloat();
        
        // Ask user to input tax rate, read input and store it in taxRate
        System.out.print("What is the tax rate?: ");
        float taxRate = input.nextFloat();
        
        // Calculate total with tax and store in total
        double total = (taxRate * 0.01) * subtotal + subtotal;
        
        // Calculate the tax amount in dollars
        double taxPaid = (taxRate * 0.01) * subtotal;
        
        // Output message to user showing their total tax and purchase amount
        System.out.println("Your $" + subtotal + " purchase including taxes of $" +
            taxPaid + " has a total of $" + total);
        
    }
    
}
