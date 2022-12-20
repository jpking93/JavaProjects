
package w14jpkinginheritance;

/**
 *
 * @author jpking
 */
public class Player {
    
    // initialize private fields for player superclass
    private String firstName;
    private String lastName;
    private String team;
    private int number;
    private double salary;
    
    /* IPO Chart:
    Input: N/A
    Process: Use String returning public method to retrieve the value of firstName
    Output: Returns value of firstName
    */
    public String getFirstName() {
        
        return firstName;
    
    }
    
    /* IPO Chart:
    Input: String is input as parameter firstName
    Process: Use the this keyword to set the value of firstName to the String passed 
    in as parameter firstName for the object being referenced.
    Output: N/A
    */
    public void setFirstName(String firstName) {
        
        this.firstName = firstName;
        
    }
    
    /* IPO Chart:
    Input: N/A
    Process: Use String returning public method to retrieve the value of lastName
    Output: Returns value of lastName
    */
    public String getLastName() {
        
        return lastName;
        
    }
    
    /* IPO Chart:
    Input: String is input as parameter lastName
    Process: Use the this keyword to set the value of lastName to the String passed 
    in as parameter lastName for the object being referenced.
    Output: N/A
    */
    public void setLastName(String lastName) {
        
        this.lastName = lastName;
        
    }
    
    /* IPO Chart:
    Input: N/A
    Process: Use String returning public method to retrieve the value of team
    Output: Returns value of team
    */
    public String getTeam() {
    
        return team;
    
    }
    
    /* IPO Chart:
    Input: String is input as parameter team
    Process: Use the this keyword to set the value of team to the String passed 
    in as parameter team for the object being referenced.
    Output: N/A
    */
    public void setTeam(String team) {
        
        this.team = team;
        
    }
    
    /* IPO Chart:
    Input: N/A
    Process: Use int returning public method to retrieve the value of number
    Output: Returns value of number
    */
    public int getNumber() {
        
        return number;
        
    }
    
    /* IPO Chart:
    Input: int is input as parameter number
    Process: Use the this keyword to set the value of number to the int passed 
    in as parameter number for the object being referenced.
    Output: N/A
    */
    public void setNumber(int number) {
        
        this.number = number;
        
    }
    
    /* IPO Chart:
    Input: N/A
    Process: Use double returning public method to retrieve the value of salary
    Output: Returns value of salary
    */
    public double getSalary() {
        
        return salary;
        
    }
    
    /* IPO Chart:
    Input: double is input as parameter salary
    Process: Use the this keyword to set the value of salary to the double passed 
    in as parameter salary for the object being referenced.
    Output: N/A
    */
    public void setSalary(double salary) {
        
        this.salary = salary;
        
    }
    
    
}
