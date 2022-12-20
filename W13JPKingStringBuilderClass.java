
package w13jpkingstringbuilderclass;

// import StringBuilder
import java.lang.StringBuilder;

/**
 *
 * @author jpking
 */
public class W13JPKingStringBuilderClass {

    /* IPO Chart
    Input: String firstName and String lastName
    Process: Use StringBuilder to create new objects firstMiddle and cityState, use .append() to add middle name
    onto firstName and state onto address. Use .deleteCharAt(); to remove the letter at index 6 of firstMiddle.
    Use .reverse() to reverse the order of cityState.
    Output: firstMiddle, cityState, firstMiddle after having index 6 removed, cityState reversed
    */
    
    public static void main(String[] args) {
        
        // initialize String firstName
        String firstName = "Jeffery";
        
        // initialize String address
        String address = "Cedar Rapids";
        
        // create new StringBuilder object firstMiddle with String firstName
        StringBuilder firstMiddle = new StringBuilder(firstName);
        
        // use .append() to add string literal onto firstMiddle
        firstMiddle.append(" Paul");
        
        // print firstMiddle
        System.out.println(firstMiddle);
        
        // create new StringBuilder object cityState with String address
        StringBuilder cityState = new StringBuilder(address);
        
        // use .append() to add string literal onto cityState
        cityState.append(", IA");
        
        // print cityState
        System.out.println(cityState);
        
        // use .deleteCharAt() to remove the character at index 6 from firstMiddle
        firstMiddle.deleteCharAt(6);
        
        // print firstMiddle
        System.out.println(firstMiddle);
        
        // use .reverse() to reverse the order of cityState
        cityState.reverse();
        
        // print cityState
        System.out.println(cityState);
        
    }
    
}
