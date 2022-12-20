
package w13jpkingabstractclass;

/**
 *
 * @author jpking
 */
public class MyInteger {
    
    // initialize private int value
    private int value = 0;
    
    
    // create constructor method for MyInteger
    public MyInteger(int value) {
        
        // the int variable value of contructed object equal to parameter value
        this.value = value;
    }
    
    /* IPO Chart
    Input: none
    Process: retrieve the value of int value
    Output: return the value of int value
    
    */
    
    public int getValue() {
        
        // return the value of private int value
        return value;
    
    }
    
    /* IPO Chart
    Input: none
    Process: check if the modulo value of value and 2 is 0
    Output: if it is return true, if not return false
    */
    
    public boolean isEven() {
        
        // if statement to check whether value % 2 == 0 is true or not
        if (value % 2 == 0) {
            return true; // if it is true return true
        }
        
        return false; // if not return false
    
    }
    
    /* IPO Chart
    Input: none
    Process: check if the modulo value of value and 2 is 0
    Output: if it is not return true, if it is return false
    */
    
    public boolean isOdd() {
        
        // if statement to check whether value % 2 == 0 is not true
        if (value % 2 != 0) {
            return true; // if it is not 0 return true
        }
        
        return false; // if is is 0 return false
    
    }
    
    /* IPO Chart
    Input: none
    Process: check if value is less than 1, if false enter for loop that initiates at i = 2 and continues while
    i is less than or equal to the square root of value, if at any point the value modulo i is equal to zero is
    not prime.
    Output: if value is less than 1 return false, if value modulo i is equal to zero return false, otherwise
    return true.
    */
    
    public boolean isPrime() {
        
        // check if value is <= 1
        if (value <= 1) {
            return false; // if it is the number is not prime
        }
        
        // for loop to iterate while i is between 2 and the square root of value
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) { // if value % i == 0 the number is not prime
                return false; // so return false
            }
        }
        
        return true; // if value is > 1 and value % i never equals 0, the number is prime so return true
    }
   
}


