
package w15jpinterfaces;

/**
 *
 * @author jpking
 */
public class Book {
    
    // initilize private fields for int isbn and String title that are common field for all subclasses
    private int isbn;
    private String title;
    
    /*IPO Chart
    Input: none
    Process: use return keyword to return the value of isbn
    Output: value of isbn
    */
    public int getISBN() {
        
        return isbn;
        
    }
    
    /*IPO Chart
    Input: int isbn
    Process: use this keyword to set the value of isbn
    Output: none
    */
    public void setISBN(int isbn) {
        
        this.isbn = isbn;
        
    }
    
    /*IPO Chart
    Input: none
    Process: use return keyword to return the value of title
    Output: value of title
    */
    public String getTitle() {
        
        return title;
        
    }
    
    /*IPO Chart
    Input: int title
    Process: use this keyword to set the value of title
    Output: none
    */
    public void setTitle(String title) {
        
        this.title = title;
        
    }
    
}
