
package w14jpkinginheritance;

/**
 *
 * @author jpking
 */
public class Baseball extends Player {
    
    // initialize private fields position and homeruns for baseball class
    private String position;
    private int homeruns;
    
    // contructor method for creating Baseball objects
    public Baseball(String firstName, String lastName, String team, int number, double salary, String position, int homeruns) {
        
        // set the value of the fields from player class by calling their getter methods
        setFirstName(firstName);
        setLastName(lastName);
        setTeam(team);
        setNumber(number);
        setSalary(salary);
        
        // set the fields unique to Baseball by using this keyword
        this.position = position;
        this.homeruns = homeruns;
        
    }
    
    /* IPO Chart:
    Input: N/A
    Process: Use String returning public method to retrieve the value of position
    Output: Returns value of position
    */
    public String getPosition() {
        
        return position;
        
    }
    
    /* IPO Chart:
    Input: String is input as parameter position
    Process: Use the this keyword to set the value of position to the String passed 
    in as parameter position for the object being referenced.
    Output: N/A
    */
    public void setPosition(String position) {
        
        this.position = position;
        
    }
    
    /* IPO Chart:
    Input: N/A
    Process: Use int returning public method to retrieve the value of homeruns
    Output: Returns value of homeruns
    */
    public int getHomeruns() {
        
        return homeruns;
        
    }
    
    /* IPO Chart:
    Input: int is input as parameter homeruns
    Process: Use the this keyword to set the value of position to the int passed 
    in as parameter homeruns for the object being referenced.
    Output: N/A
    */
    public void setHomeruns(int homeruns) {
        
        this.homeruns = homeruns;
        
    }
    
    
}
