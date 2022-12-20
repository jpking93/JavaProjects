
package w15jpinterfaces;

/**
 *
 * @author jpking
 */
public class NonFiction extends Book implements PrintBookInfo {
    
    private boolean isEssay;
    private boolean isArticle;
    
    public NonFiction(int isbn, String title, boolean isEssay, boolean isArticle) {
        
        setISBN(isbn);
        setTitle(title);
        this.isEssay = isEssay;
        this.isArticle = isArticle;
        
    }
    
    /*IPO Chart
    Input: none
    Process: use return keyword to return the value of isEssay
    Output: value of isEssay
    */
    public boolean getIsEssay() {
        
        return isEssay;
        
    }
    
    /*IPO Chart
    Input: boolean isEssay
    Process: use this keyword to set the value of isEssay
    Output: none
    */
    public void setIsEssay(boolean isEssay) {
        
        this.isEssay = isEssay;
        
    }
    
    /*IPO Chart
    Input: none
    Process: use return keyword to return the value of isArticle
    Output: value of isArticle
    */
    public boolean getIsArticle() {
        
        return isArticle;
        
    }
    
    /*IPO Chart
    Input: boolean isArticle
    Process: use this keyword to set the value of isArticle
    Output: none
    */
    public void setIsArticle(boolean isArticle) {
        
        this.isArticle = isArticle;
        
    }
    
    /*IPO Chart
    Input: none
    Process: use getter methods and this keyword to print the values of the data fields for
    NonFiction object
    Output: return value of getISBN, getTitle, and the value of isEssay and isArticle
    */
    @Override
    public void printBookInfo() {
        System.out.println(getISBN());
        System.out.println(getTitle());
        System.out.println(this.isEssay);
        System.out.println(this.isArticle);
    }
    
}
