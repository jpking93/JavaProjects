
package w13jpkingabstractclass;

/**
 *
 * @author jpking
 */
public class W13JPKingAbstractClass {

    /* IPO Chart
    Input: create new MyInteger obeject set the value 5
    Process: Print out the results of getValue(), isEven(), isOdd(), and isPrime() when called on num
    Output: Print the return values of the methods
    */
    
    public static void main(String[] args) {
        
        // create new MyInteger instance called num
        MyInteger num = new MyInteger(2);
        
        // call each of the static methods on the MyInteger object
        System.out.println(num.getValue());
        System.out.println(isEven(num));
        System.out.println(isOdd(num));
        System.out.println(isPrime(num));
        
    }
    
    /* IPO Chart
    Input: MyInteger num
    Process: call the isEven() class method on num
    Output: return the result of num.isEven()
    */
    
    public static boolean isEven(MyInteger num) {
       
       // return the value of the isEven method called on num
       return num.isEven();
    
    }
    
    /* IPO Chart
    Input: MyInteger num
    Process: call the isOdd() class method on num
    Output: return the result of num.isOdd()
    */
    
    public static boolean isOdd(MyInteger num) {
       
       // return the value of the isOdd method called on num
       return num.isOdd();
        
    }
    
    /* IPO Chart
    Input: MyInteger num
    Process: call the isPrime() class method on num
    Output: return the result of num.isPrime()
    */
    
    public static boolean isPrime(MyInteger num) {
        
       // return the value of the isPrime method called on num
       return num.isPrime();
        
    }
    
}
