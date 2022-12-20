
package w15jpinterfaces;

/**
 *
 * @author jpking
 */
public class Letters extends Book implements PrintBookInfo {
    
    private boolean isMessage;
    private boolean isNote;
    
    public Letters(int isbn, String title, boolean isMessage, boolean isNote) {
        
        setISBN(isbn);
        setTitle(title);
        this.isMessage = isMessage;
        this.isNote = isNote;
        
    }
    
    /*IPO Chart
    Input: none
    Process: use return keyword to return the value of isMessage
    Output: value of isMessage
    */
    public boolean getIsMessage() {
        
        return isMessage;
        
    }
    
    /*IPO Chart
    Input: boolean isMessage
    Process: use this keyword to set the value of isMessage
    Output: none
    */
    public void setIsMessage(boolean isMessage) {
        
        this.isMessage = isMessage;
        
    }
    
    /*IPO Chart
    Input: none
    Process: use return keyword to return the value of isNote
    Output: value of isNote
    */
    public boolean getIsNote() {
        
        return isNote;
        
    }
    
    /*IPO Chart
    Input: boolean isNote
    Process: use this keyword to set the value of isNote
    Output: none
    */
    public void setIsNote(boolean isNote) {
        
        this.isNote = isNote;
        
    }
    
    /*IPO Chart
    Input: none
    Process: use getter methods and this keyword to print the values of the data fields for
    Letters object
    Output: return value of getISBN, getTitle, and the value of isMessage and isNote
    */
    @Override
    public void printBookInfo() {
        System.out.println(getISBN());
        System.out.println(getTitle());
        System.out.println(this.isMessage);
        System.out.println(this.isNote);
    }
    
}
