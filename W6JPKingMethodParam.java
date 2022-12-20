/* IPO Chart
Input: ask user for: first name (String firstName), last name (String lastName),
principal of loan (int principal), amount of principal paid per year (int yearlyPaid),
their interest rate (int interestRate), and their loan length (int loanTerm)
Process: Call interestPerYear method which intializes a variable to keep track of the
year of the loan for each loop, then goes into a do/while loop that calculates the interest
paid by the user each year and deducts the yearly amount paid from the prinicpal amount left
on the loan. Each time throught the loop the year gets incremented by 1 and the loanTerm variable
gets decremented by 1. While loanTerm is greater than 0 keep looping, once it is not exit the loop.
Output: Each time through the loop in the interestPerYear method a message is output to the user
telling them their name, the amout of interest they paid each year and what year of the loan it
was along with their remaining pricipal balance at the end of each year.
*/

package w6jpkingmethodparam;
// import java.util library
import java.util.*;
/**
 *
 * @author jpking
 */
public class W6JPKingMethodParam {

    
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
        
        // ask user for the principal amount of their loan
        System.out.print("What is the principal amount of your loan?: ");
        // read input and store in double principal
        int principal = input.nextInt();
        
        // ask user for the amount of the principal they pay per year
        System.out.print("What amount of the principal do you pay per year?: ");
        // read input and store in double yearlyPaid
        int yearlyPaid = input.nextInt();
        
        // ask user for the interest rate of their loan
        System.out.print("What is the interest rate of your loan?: ");
        // read input and store in double interestRate
        int interestRate = input.nextInt();
        
        // ask the user for the term of their loan in years
        System.out.print("What is the term of your loan in years?: ");
        // read input and store in int loanTerm
        int loanTerm = input.nextInt();
        
        // call interestPerYear method passing in user input as parameters
        interestPerYear(firstName, lastName, principal, yearlyPaid, interestRate, loanTerm);
        
    }
    
    /* define interestPerYear method which will take user input and output a message telling them
       how much interest they pay per year and the amount of principal they have left to pay */
    public static void interestPerYear(String firstName, String lastName, int principal,
            int yearlyPaid, int interestRate, int loanTerm) {
        
        // initialize counter variable to keep track of year each loop iteration
        int year = 1;
        
        /* use a do/while loop to iterate through each year of user's loan and calculate the amount
           of interest they will pay each year along with the amount of pricipal they will have left */
        do {
             
            /* convert interest rate to a decimal and multiply by principal to calculate the
               interest paid and then cast the final result to an int */
            int interestPaid = (int) (principal * (interestRate * 0.01));
            
            /* each time through the loop subtract the yearly amount paid from pricipal and re-assign the
               new amount to principal */
            principal -= yearlyPaid;
            
            // output message to user
            System.out.println(firstName + " " + lastName + " paid $" + interestPaid + 
                    " in interest in year " + year + " with the remaining "
                            + "principal of $" + principal);
            
            // increment the year variable by 1
            year++;
            
            // decrement the loanTerm variable by 1
            loanTerm--;
            
          // exit the loop once once loanTerm > 0 is no longer true
        } while(loanTerm > 0);
        
    }
    
}
