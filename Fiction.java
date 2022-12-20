
package w15jpinterfaces;

/**
 *
 * @author jpking
 */
public class Fiction extends Book implements PrintBookInfo {
    
    private boolean isNovel;
    private boolean isShortStory;
    
    public Fiction(int isbn, String title, boolean isNovel, boolean isShortStory) {
        
        setISBN(isbn);
        setTitle(title);
        this.isNovel = isNovel;
        this.isShortStory = isShortStory;
        
    }
    
    /*IPO Chart
    Input: none
    Process: use return keyword to return the value of novel
    Output: value of title
    */
    public boolean getIsNovel() {
        
        return isNovel;
        
    }
    
    /*IPO Chart
    Input: boolean isNovel
    Process: use this keyword to set the value of isNovel
    Output: none
    */
    public void setIsNovel(boolean isNovel) {
        
        this.isNovel = isNovel;
        
    }
    
    /*IPO Chart
    Input: none
    Process: use return keyword to return the value of isShortStory
    Output: value of isShortStory
    */
    public boolean getIsShortStory() {
        
        return isShortStory;
        
    }
    
    /*IPO Chart
    Input: boolean isShortStory
    Process: use this keyword to set the value of isShortStory
    Output: none
    */
    public void setIsShortStory(boolean isShortStory) {
        
        this.isShortStory = isShortStory;
        
    }
    
    /*IPO Chart
    Input: none
    Process: use getter methods and this keyword to print the values of the data fields for
    Fiction object
    Output: return value of getISBN, getTitle, and the value of isNovel and isShortStory
    */
    @Override
    public void printBookInfo() {
        System.out.println(getISBN());
        System.out.println(getTitle());
        System.out.println(this.isNovel);
        System.out.println(this.isShortStory);
    }
      
}
