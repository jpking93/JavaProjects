package w11jpkingrecursion;

// import java.util library
import java.util.*;

/**
 *
 * @author jpking
 */
public class W11JPKingRecursion {
    
    /* IPO Chart
    Input: User enters a string of their choice and it is read in by scanner and stored in String inputString
    Process: Print message to user asking them to input a string. Use string split method to split the characters
    into an array String[] charArray. Call forward, backward and both methods.
    Output: The result of the forward, backward, and both methods are output.
    */
    
    // main method takes user inputs and calls functions
    public static void main(String[] args) {
        
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // ask user to type in a word or phrase
        System.out.print("Type in a word or phrase: ");
        
        // assign user input to String inputString
        String inputString = input.nextLine();
        
        // split string into an array with each character as an element
        String[] charArray = inputString.split("");
        
        // call method forward on charArray
        forward(charArray, 0);
        System.out.println();
        
        // call method backward on charArray
        backward(charArray, 0);
        System.out.println();
        
        // call method both on charArray
        both(charArray, 0);
        System.out.println();
        
    }
    
    /*IPO Chart
    Input: forward takes the input of the String[] charArray and an int idx
    Process: If the idx is equal to the length of the string the method will return.
    If the idx is not equal to the length of charArray it will print the letter at the current index
    and then call the forward method again.
    Output: The method will output each character in the array
    */

    // method forward prints string in normal order
    public static void forward(String[] charArray, int idx) {
        
        // return if idx is equal to the length of the array
        if (idx == charArray.length) {
            return;
        }
        
        // print the character at each index of the array
        System.out.print(charArray[idx]);
        // recursively call forward and increment the index by 1 to print the next character
        forward(charArray, idx + 1);
        
    }
    
    /*IPO Chart
    Input: backward takes the input of the String[] charArray and an int idx
    Process: If the idx is equal to the length of the string the method will return.
    If the idx is not equal to the length of charArray the backward method will be called again and again until
    it is equal. Then recursion is used to print the the elements in the array in reverse order as the stack is cleared.
    Output: The method will output each character in the array in reverse
    */
    
    // method backward prints string in reverse order
    public static void backward(String[] charArray, int idx) {
        
        // return if idx is equal to the length of the array
        if (idx == charArray.length) {
            return;
        }
        
        // recursively call backward and increment index by 1 to go to the next index of the array
        backward(charArray, idx + 1);
        // print the elements in the array in reverse order
        System.out.print(charArray[idx]);
        
    }
    
    /*IPO Chart
    Input: both takes the input of the String[] charArray and an int idx
    Process: If the idx is equal to the length of the string the method will return.
    If the idx is not equal to the length of charArray the character at each index will print and then the both method will 
    be called again until it is equal. Then recursion is used to print the the elements in the array in reverse order as the 
    stack is cleared.
    Output: The method will output each character in the array in reverse
    */
    
    // method both prints string in normal order and then reverse order
    public static void both(String[] charArray, int idx) {
        
        // return if idx is equal to the length of the array
        if (idx == charArray.length) {
            return;
        }
        
        // print the elements in the array in normal order
        System.out.print(charArray[idx]);
        // recursively call both and increment the index by 1 to go to the next index of the array
        both(charArray, idx + 1);
        // print the elements in the array in reverse order
        System.out.print(charArray[idx]);
            
    }
    
}
