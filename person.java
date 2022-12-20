
package w12jpkingbasicclass;

/**
 *
 * @author jpking
 */
public class person {
   
   // initialze private fields with default values
   private String firstName = "Bob";
   private String lastName = "Smith";
   private String type = "Hawk";
   
   /*IPO Chart
   Input: Strings are input as parameters first, last, and personality type.
   Process: the parameters are stored as the values for Strings firstName, lastName, and personalityType
   Output: No output
   */
   
   // constructor method that takes parmeters for new user first name, last name, and personality type
   public person(String first, String last, String personalityType) {
       firstName = first;
       lastName = last;
       type = personalityType;
   }
   
   /* IPO Chart
   Input: No input
   Process: Get the value of String firstName
   Output: returns the value of firstName
   */
   
   // getter method to return the value of firstName from person object
   public String getFirstName() {
       return firstName;
   }
   
   /* IPO Chart
   Input: String userFirst
   Process: sets the value of firstName to the String passed in as userFirst
   Output: No output
   */
   
   // setter method to set the value of firstName to new String when passed in
   public void setFirstName(String userFirst) {
       firstName = userFirst;
   }
   
   /* IPO Chart
   Input: No input
   Process: Get the value of String lastName
   Output: returns the value of lastName
   */
   
   // getter method to return the value of lastName from person object when called
   public String getLastName() {
       return lastName;
   }
   
   /* IPO Chart
   Input: String userLast
   Process: sets the value of lastName to the String passed in as userLast
   Output: No output
   */
   
   // setter method to set the value of lastName to new String when passed in
   public void setLastName(String userLast) {
       lastName = userLast;
   }
   
   /* IPO Chart
   Input: No input
   Process: Get the value of String type
   Output: returns the value of type
   */
   
   // getter method to return the value of type from person object when called
   public String getType() {
       return type;
   }
   
   /* IPO Chart
   Input: String userType
   Process: sets the value of type to the String passed in as userType
   Output: No output
   */
   
   // setter method to set the value of type to new String when passed in
   public void setType(String userType) {
       type = userType;
   }
   
}
