/* IPO Chart
Input: values 3, 4 for the int max method with 2 parameters, values 3.0 and 5.4 for the
max method with 2 double parameters, values 3.0, 5.4 and 10.14 for the max method that
accepts 3 double parameters and the chars 'A' and 'a' for the max method that accepts 
two chars as parmeters.
Process: For the 2 parameter int method, the 2 parameter double method and the 2 parameter char
method an if/else statement is used to evaluate which of the values is the largest and the larger
value is returned. For the 3 parameter double max method the 2 parameter max method is called on the
first two inputs and then it is called again on the result of the first comparison and the third parameter
to give the max value of all three numbers.
Output: Back in the main method a message is printed stating the largest value of the numbers passed into
each max method by calling the methods from within the print statements
*/

package w6jpkingoverloadedmethod;
/**
 *
 * @author jpking
 */
public class W6JPKingOverloadedMethod {

    
    public static void main(String[] args) {
        
        // Invoke the max method with int parameters
        System.out.println("The maximum of 3 and 4 is " + max(3, 4));
        
        // Invoke the max method with the double parameters
        System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));
        
        // Invoke the max method with three double parameters
        System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
        
        // Invoke the max method with char parameters
        System.out.println("The maxium of a and A is " + max('A', 'a'));
    
    }
    
    
    // Return the max of two int values
    public static int max(int num1, int num2) {
      if (num1 > num2) {
        return num1;
      } else {
        return num2;
      }
    }
      
      
    // Find the max of two double values
    public static double max(double num1, double num2) {
      if (num1 > num2) {
        return num1;
      } else {
        return num2;
      }
    }
    
    
    // Return the max of three double values
    public static double max(double num1, double num2, double num3) {
      return max(max(num1, num2), num3);
    }
    
    // Return the max of two char values
    public static char max(char char1, char char2) {
       
        if (char1 > char2) { // if char1 is greater than char2 return the value of char1 since it is greater
           return char1;
       } else { // if not than return the value of char2 because it is the greater char
           return char2;
       }
    }
    
}


