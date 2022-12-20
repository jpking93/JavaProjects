
package w15jpkingarraylist;
// import java.util library
import java.util.*;

/**
 *
 * @author jpking
 */
public class W15JPKingArrayList {

    /* IPO Chart
    Input: None
    Process: Create array list of Course objects, create four course object and add them to the arraylist.
    Output: Output the return value of courseSearch() called on each of the four objects and then 1 course name
    that is not in the array.
    */
    public static void main(String[] args) {
        
        // Create new array list of Course objects
        ArrayList<Course> courses = new ArrayList<>();
        
        // create a new Course object for each class I am taking this semester using constructor
        Course computerOrg = new Course("CS 190", "Computer Organization", "Prof. Haney", "Assembly Language");
        Course fundamentals = new Course("CS 105", "Fundamentals of Computer Science", "Dr. Jacobs", "Loops");
        Course techComm = new Course("BA 250", "Technology and Communication in Business", "Prof. Scroggins", "Excel");
        Course projMgmt= new Course("BN 377", "Project Management", "Prof. Hutcheson", "Gantt Charts");
        
        // add each Course object to the courses array list
        courses.add(computerOrg);
        courses.add(fundamentals);
        courses.add(techComm);
        courses.add(projMgmt);
        
        // print the contents of each array list element for those that are found or print "course not found"
        System.out.println(courseSearch(courses, "CS 190"));
        System.out.println(courseSearch(courses, "CS 105"));
        System.out.println(courseSearch(courses, "BA 250"));
        System.out.println(courseSearch(courses, "BN 377"));
        System.out.println(courseSearch(courses, "CS 106"));
        
        System.out.println();
        
        // print out entire courses array using overriden toString method
        System.out.println(courses.toString());
    }
    
    
    /* IPO Chart
    Input: ArrayList<Course> courseList and String courseName
    Process: Use for loop to iterate through arraylist, if the number of one of the courses matches courseName
    return the contents of the object, if not return "course not found".
    Output: contents of matching object or "course not found depending on whether there is a match or not.
    */
    public static String courseSearch(ArrayList<Course> courseList, String courseName) {
        
        // for loop to iterate through list of courses
        for(int i = 0; i < courseList.size(); i++) {
            
            // if the course number for the object corresponds to the course number passed in by user return the contents of the course object
            if ((courseList.get(i).getNumber()).equals(courseName)) {
                
                return (courseList.get(i)).toString();
            
            }
            
        }
        
        // if there is no mathc for the course searched return this message to the user
        return "Course not found for " + courseName;
        
   }
    
}
