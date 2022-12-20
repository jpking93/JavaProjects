
package w15jpinterfaces;

/**
 *
 * @author jpking
 */
public class Reference extends Book implements PrintBookInfo {
    
    private boolean isDictionary;
    private boolean isEncyclopedia;
    
    public Reference(int isbn, String title, boolean isDictionary, boolean isEncyclopedia) {
        
        setISBN(isbn);
        setTitle(title);
        this.isDictionary = isDictionary;
        this.isEncyclopedia = isEncyclopedia;
        
    }
    
    /*IPO Chart
    Input: none
    Process: use return keyword to return the value of isIsDictionary
    Output: value of isIsDictionary
    */
    public boolean getIsDictionary() {
        
        return isDictionary;
        
    }
    
    /*IPO Chart
    Input: boolean isDictionary
    Process: use this keyword to set the value of isDictionary
    Output: none
    */
    public void setIsDictionary(boolean isDictionary) {
        
        this.isDictionary = isDictionary;
        
    }
    
    /*IPO Chart
    Input: none
    Process: use return keyword to return the value of isIsEncyclopedia
    Output: value of isIsEncyclopedia
    */
    public boolean getIsEncyclopedia() {
        
        return isEncyclopedia;
        
    }
    
    /*IPO Chart
    Input: boolean isEncyclopedia
    Process: use this keyword to set the value of isEncyclopedia
    Output: none
    */
    public void setIsEncyclopedia(boolean isEncyclopedia) {
        
        this.isEncyclopedia = isEncyclopedia;
        
    }
    
    /*IPO Chart
    Input: none
    Process: use getter methods and this keyword to print the values of the data fields for
    Reference object
    Output: return value of getISBN, getTitle, and the value of isDictionary and isEncyclopedia
    */
    @Override
    public void printBookInfo() {
        System.out.println(getISBN());
        System.out.println(getTitle());
        System.out.println(this.isDictionary);
        System.out.println(this.isEncyclopedia);
    }
    
}
