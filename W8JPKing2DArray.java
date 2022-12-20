
package w8jpking2darray;

/**
 *
 * @author jpking
 */
public class W8JPKing2DArray {

    /* IPO Chart
    Input: Create int array table[][]
    Process: Call method multiply on table array, and then take the result and
    store it in variable int[][] reverseTable.
    Output: Call printArray method on reverseTable to print the reverseTable array.
    */
    
    public static void main(String[] args) {
        
        // initialize integer array of size 13 x 13
        int[][] table = new int[13][13]; 
        
        // call printArray method on return value of mutiply method with int[][] table passed in
        printArray(multiply(table));
        
    }
    
    /* IPO Chart
    Input: Pass int[][] table in as parameter.
    Process: Iterate through each index of the array and multiply the index values.
    Output: Return int[][] array which is the results of the multiplication.
    */
    
    public static int[][] multiply(int[][] array) {
        
        // for loop that iterates through each row of the int[][] array
        for (int row = 0; row <= array.length - 1; row++) {
            
            // nested for loop that will iterate through each column of int[][] array    
            for(int column = 0; column <= array.length - 1; column++) {
                
                /* takes array.length - 1 and subtracts the value of row and multiplies it by array.length - 1
                minus the value of column, this flips the values so that 12 x 12 will be in the top left and
                0 x 0 will be bottom right */
                array[row][column] = ((array.length - 1) - row) * ((array.length - 1) - column);
                
            }   
        }
        
        return array; //returns modified int[][] with multiplication table filled in
        
    }
    
    /*IPO Chart
    Input: Accept int[][] reverseTable as a parameter.
    Process: Use nested for-loop to iterate through array.
    Output: printf to format output so array columns line up.
    */
    
    public static void printArray(int[][] array) {
        
        // for loop that iterates through each row of the int[][] array
        for(int row = 0; row <= array.length - 1; row++) {
            
            System.out.println(); // add newline between each row of the table output
            
            // nested for loop that will iterate through each column of int[][] array
            for(int column = 0; column <= array[row].length - 1; column++) {
                
                // print each array value formatted for 3 integer digits and a space between each value
                System.out.printf("%3d ",array[row][column]); 
            }
        }
        
    }
    
}
