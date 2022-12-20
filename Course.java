
package w15jpkingarraylist;

/**
 *
 * @author jpking
 */
public class Course {
    
    // initialize private fields for course data
    private String number;
    private String title;
    private String instructor;
    private String topic;
    
    // constructor method to create new course objects
    public Course (String number, String title, String instructor, String topic) {
        
        // use this keyword to set parameter to its variable counterpart
        this.number = number;
        this.title = title;
        this.instructor = instructor;
        this.topic = topic;
    
    }
    
    /* IPO Chart
    Input: none
    Process: use return keyword to return the value of number
    Output: value of number
    */
    public String getNumber() {
        
        return number;
        
    }
    
    /* IPO Chart
    Input: String number
    Process: use this keyword to set the value of number
    Output: none
    */
    public void setNumber(String number) {
        
        this.number = number;
        
    }    
    
    /* IPO Chart
    Input: none
    Process: use return keyword to return the value of title
    Output: value of title
    */
    public String getTitle() {
        
        return title;
        
    }
    
    /* IPO Chart
    Input: String title
    Process: use this keyword to set the value of title
    Output: none
    */
    public void setTitle(String title) {
        
        this.title = title;
        
    }
    
    /* IPO Chart
    Input: none
    Process: use return keyword to return the value of instructor
    Output: value of instructor
    */
    public String getInstructor() {
        
        return instructor;
        
    }
    
    /* IPO Chart
    Input: String instructor
    Process: use this keyword to set the value of instructor
    Output: none
    */
    public void setInstructor(String instructor) {
        
        this.instructor = instructor;
        
    }
    
    /* IPO Chart
    Input: none
    Process: use return keyword to return the value of topic
    Output: value of topic
    */
    public String getTopic() {
        
        return topic;
        
    }
    
    /* IPO Chart
    Input: String topic
    Process: use this keyword to set the value of topic
    Output: none
    */
    public void setTopic(String topic) {
        
        this.topic = topic;
        
    }
    
    /* IPO Chart
    Input: none
    Process: use this keyword to return a String containing the value of each data field
    Output: String showing the value of each data field
    */
    @Override
    public String toString() {
        return ("Course Number: " + this.getNumber() + "\n" +
                    "Course Name: " + this.getTitle() + "\n" +
                    "Instructor: " + this.getInstructor() + "\n" +
                    "Favorite Topic: " + this.getTopic()) + "\n"; 
    }
    
}
