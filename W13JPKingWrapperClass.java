
package w13jpkingwrapperclass;
import java.math.*;

/**
 *
 * @author jpking
 */
public class W13JPKingWrapperClass {

    /* IPO Chart
    Input: Initialze values for int age, double wage, and char initial.
    Process: Convert age to double using Double.valueOf(age), convert wage to String using String.valueOf(wage)
    convert initial to Integer using Integer.valueOf(initial). Create new BigInteger object num1 and BigDecimal
    object num2, convert num1 to BigDecimal by creating new BigDecimal object num3 and passing num1 in as the value.
    Use .add() to add together num2 and num3.
    Output: print value of doubleAge, stringWage, and intInitial. Print result of num2.add(num3)
    */
    
    public static void main(String[] args) {
        
        // initialize int age
        int age = 29;
        
        // initialize double wage
        double wage = 1000.00;
        
        // initialize char initial
        char initial = 'J';
        
        // Initialize Double doubleAge using Double.valueOf() to convert int to Double
        Double doubleAge = Double.valueOf(age);
        
        // Initialize String stringWage using String.valueOf() to convert double to String
        String stringWage = String.valueOf(wage);
        
        // Initialize Integer intInitial using Integer.valueOf() to convert char to Integer
        Integer intInitial = Integer.valueOf(initial);
        
        // print Double doubleAge
        System.out.println(doubleAge);
        
        // print String stringWage
        System.out.println(stringWage);
        
        // print Integer intInitial
        System.out.println(intInitial);
        
        // create new BigInteger object num1
        BigInteger num1 = new BigInteger("9223372036854");
        
        // create new BigDecimal object num2
        BigDecimal num2 = new BigDecimal(".922337203685");
        
        // Wrap num1 in BigDecimal object so it can be added to num2 and store in new BigDecimal object num3
        BigDecimal num3 = new BigDecimal(num1);
        
        // use .add() to add BigDecimal num2 and BigDecimal num3 and print the result
        System.out.println(num2.add(num3));
        
    }
    
}
