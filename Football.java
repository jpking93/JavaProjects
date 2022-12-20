
package w14jpkinginheritance;

/**
 *
 * @author jpking
 */
public class Football extends Player {
    
    // initialize private fields for Football subclass
    private String position;
    private int yards;
    
    // constructor method for class football subclass
    public Football(String firstName, String lastName, String team, int number, double salary, String position, int yards) {
        
        // set the value of the fields from player class by calling their getter methods
        setFirstName(firstName);
        setLastName(lastName);
        setTeam(team);
        setNumber(number);
        setSalary(salary);
        
        // set the fields unique to Football by using this keyword
        this.position = position;
        this.yards = yards;
        
        
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
    Process: Use int returning public method to retrieve the value of yards
    Output: Returns value of yards
    */
    public int getYards() {
        
        return yards;
        
    }
    
    /* IPO Chart:
    Input: int is input as parameter yards
    Process: Use the this keyword to set the value of yards to the int passed 
    in as parameter yards for the object being referenced.
    Output: N/A
    */
    public void setYards(int yards) {
        
        this.yards = yards;
        
    }
    
    /* IPO Chart:
    Input: N/A
    Process: Use double returning public method to return 0 and print statement informing the user that salary
    information is kept private.
    Output: Returns value of 0 and prints message to user
    */
    @Override
    public double getSalary() {
        
        System.out.println("Sorry, salary info is kept private.");
        
        return 0;
        
    }
    
    
}
