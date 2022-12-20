
package w15jpinterfaces;

/**
 *
 * @author jpking
 */
public class W15JPInterfaces {
    
    /* IPO Chart
    Input: None
    Process: Create new objects for Book subclasses, call getter and setter methods for objects
    call interface method getBookInfo()
    Output: Ouput the return values of each objects data fields using getter methods, and then
    output the changed values by calling the printBookInfo() method.
    */

    public static void main(String[] args) {
        
        // create objects for each subclass of book
        Fiction fictionBook = new Fiction(960341528, "Example Short Story", false, true);
        NonFiction nonFictionBook = new NonFiction(718503312, "Example Article", false, true);
        Reference myReference = new Reference(878809585, "Example Dictionary", true, false);
        Letters myLetter = new Letters(436820826, "Example Note", false, true);
        
        // call getter methods for each field from all the subclasses and print results
        System.out.println(fictionBook.getISBN());
        System.out.println(nonFictionBook.getTitle());
        System.out.println(fictionBook.getIsNovel());
        System.out.println(fictionBook.getIsShortStory());
        System.out.println(nonFictionBook.getIsEssay());
        System.out.println(nonFictionBook.getIsArticle());
        System.out.println(myReference.getIsDictionary());
        System.out.println(myReference.getIsEncyclopedia());
        System.out.println(myLetter.getIsMessage());
        System.out.println(myLetter.getIsNote());
        
        // call setter methods for each field from all the subclasses and change the values for the objects
        fictionBook.setISBN(467899254);
        myReference.setTitle("Example Encyclopedia");
        fictionBook.setIsNovel(true);
        fictionBook.setIsShortStory(false);
        nonFictionBook.setIsEssay(true);
        nonFictionBook.setIsArticle(false);
        myReference.setIsDictionary(false);
        myReference.setIsEncyclopedia(true);
        myLetter.setIsMessage(true);
        myLetter.setIsNote(false);
        
        // use interface method printBookInfo() to print the contents of each object
        System.out.println();
        fictionBook.printBookInfo();
        System.out.println();
        nonFictionBook.printBookInfo();
        System.out.println();
        myReference.printBookInfo();
        System.out.println();
        myLetter.printBookInfo();
    
    }
    
}
