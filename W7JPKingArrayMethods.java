/* IPO Chart
Input: Generate array containing 10 random integer and store in intArray.
Process: Call the maxInt method, minInt method, averageArray method, and range
method.
Output: Ouput messages to user telling them the max value, min value, average 
value and range of the randomly generated intArray.
*/
package w7jpkingarraymethods;

/**
 *
 * @author jpking
 */
public class W7JPKingArrayMethods {

    public static void main(String[] args) {
        
        // initialize int array of length 10 called intArray
        int[] intArray = new int[10]; 
       
        // generate 10 random numbers between 1 and 100 with for loop
        for (int i = 0; i < 10; i++) {
            
            // initialize int variable randomNum that is a random int between 1 and 100
            int randomNum = (int) (Math.random() * 100) + 1;
            
            // add randomNum to intArray at current index of loop
            intArray[i] = randomNum;
            
        }
        
        // initialize int variable maxValue to store max number in intArray
        int maxValue = maxInt(intArray);
        
        // initialize int variable minValue to store min number in intArray
        int minValue = minInt(intArray);
        
        // output max value in array by calling maxInt
        System.out.println("The maximum value is: " + maxInt(intArray));
        
        // output min value in array by calling minInt
        System.out.println("The minimum value is: " + minInt(intArray));
        
        // output average value in array by calling averageArray
        System.out.printf("The average value is: %5.2f %n", averageArray(intArray));  
        
        // output range of array values by calling range with arguments maxValue and minValue
        System.out.println("The range is: " + range(maxValue, minValue));
        
    }
    
    /* IPO Chart
    Input: intArray gets passed in as int[] myArray.
    Process: for loop to loop through each element of array and find the largest
    integer.
    Output: return the value of int max
    */
    
    public static int maxInt(int[] myArray) {           // define method to find max value in array
        
        int max = myArray[0];                           // initialize max as array index 0
        
        for (int i = 1; i < myArray.length; i++) {      // for loop to compare each index value to current max
           
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        
        return max;                                     // return value of max
    }
    
    /* IPO Chart
    Input: intArray gets passed in as int[] myArray.
    Process: myArray is put through a for loop that finds the smallest integer
    in the array.
    Output: the value of int min is returned
    */
    
    
    public static int minInt(int[] myArray) {           // define method to find min value in array
        
        int min = myArray[0];                           // initialize min as array index 0
        
        for (int i = 1; i < myArray.length; i++) {      // for loop to compare each index value to current min
            
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        
        return min;                                     // return value of min
        
    }
    
    /* IPO Chart
    Input: int array is passed in as int[] myArray.
    Process: my array is passed into for loop that iterates through each element
    and keeps a running total adding to double total. Total is then divided by the
    number of elements in the myArray and stored in double average.
    Output: the value of double average is returned.
    */
    
    
    public static double averageArray(int[] myArray) {  // define method to find the average of array values
        
        double total = 0;                               // initialize variable to track total at 0
        
        for (int i = 0; i < myArray.length; i++) {      // for loop to add each element of array to total
            
            total += myArray[i];
        }
        
        double average = total / myArray.length;        // divide total by the number of elements in array to get avg.
        
        return average;                                 // return the average of array values
            
    }
    
    /* IPO Chart
    Input: take the max value and min value of the array.
    Process: set int range equal to (max - min) + 1
    Output: return value of range
    */
    
    public static int range(int max, int min) {         // define method that takes min and max value to find range
        
        int range = (max - min) + 1;                    // add one to the differnce of min and max to find range
        
        return range;                                   // return the value of range
        
    }
    
}