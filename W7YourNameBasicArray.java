/* IPO Chart
Input: Array of chars myName has an element of each letter in my name. Array of ints myZip
contains an element with each number in my zip code.
Process: Pass myName to method printBothWays(char) where a for each loop will print out myName
in normal order, and then myName will go into a for loop where it will iterate through backwards
and print myName in reverse order. myZip will then get passed to printBothWays where it will
go through a for each loop and be printed in normal order and then will go to a for loop that
will iterate through backwards and print myZip in reverse order.
Output: The method printBothWays will print out each string forward and then backward.
*/

package w7yournamebasicarray;

/**
 *
 * @author jpking
 */
public class W7YourNameBasicArray {

    
    public static void main(String[] args) {
      
        // initalize char array myName of length 7 and add elements
        char[] myName = new char[7];
        myName[0] = 'J';
        myName[1] = 'e';
        myName[2] = 'f';
        myName[3] = 'f';
        myName[4] = 'e';
        myName[5] = 'r';
        myName[6] = 'y';
        
        // initialize int array myZip of length 5 and add elements
        int[] myZip = new int[5];
        myZip[0] = 5;
        myZip[1] = 2;
        myZip[2] = 4;
        myZip[3] = 0;
        myZip[4] = 5;
        
        // call char version of method printBothWays
        printBothWays(myName);
        // call int version of method printBothWays
        printBothWays(myZip);
        
               
    }
    
    // define method that accepts an array of chars and prints it forwards and backwards
    public static void printBothWays(char[] charArray) {
    
        for (char e: charArray) {       // for each loop to iterate through array
            System.out.print(e);        // print each character stored in the array
        }
        
        System.out.print("\n");         // add a newline between the forward print out and backward print out
        
        for (int i = (charArray.length - 1); i >= 0; i--) {     // for loop to interate backwards through array
            System.out.print(charArray[i]);                     // print each character stored in the array
        }
        
        System.out.print("\n");                                 // add a newline at the end of output
    
    }
    
    // define method that accepts an array of ints and prints it forwards and backwards
    public static void printBothWays(int[] intArray) {
        
        for (int e: intArray) {                                 // for each loop to iterate through array
            System.out.print(e);                                // print each integer stored in array
        }
        
        System.out.print("\n");                                 // add newline between forward and backward output
        
        for (int i = (intArray.length - 1); i >= 0; i--) {      // for loop to iterate backwards through array
            System.out.print(intArray[i]);                      // print each integer stored in array
        }
        
        System.out.print("\n");                                 // add newline at the end of output
        
    }
      
}
