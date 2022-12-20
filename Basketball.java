
package w14jpkinginheritance;

/**
 *
 * @author jpking
 */
public class Basketball extends Player {
    
    
    private String position;
    private int points;
    
    // contructor method for creating Basketball objects
    public Basketball(String firstName, String lastName, String team, int number, double salary, String position, int points) {
        
        // set the value of the fields from player class by calling their getter methods
        setFirstName(firstName);
        setLastName(lastName);
        setTeam(team);
        setNumber(number);
        setSalary(salary);
        
        // set the fields unique to Basketball by using this keyword
        this.position = position;
        this.points = points;
        
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
    Process: Use int returning public method to retrieve the value of points
    Output: Returns value of points
    */
    public int getPoints() {
        
        return points;
        
    }
    
    /* IPO Chart:
    Input: int is input as parameter points
    Process: Use the this keyword to set the value of position to the int passed 
    in as parameter points for the object being referenced.
    Output: N/A
    */
    public void setPoints(int points) {
        
        this.points = points;
        
    }
    
    
}
