
package w12jpkingbasicclass;
// import java.util library
import java.util.*;

/**
 *
 * @author jpking
 */
public class W12JPKingBasicClass {
    
    /* IPO Chart
    Input: User inputs their first and last name.
    Process: user first and last name are stored in person object and questionChecker method is called.
    Output: String[] traits is passed the the questionChecker method
    */

    // main method stores array of traits and calls object methods to give results of personality test
    public static void main(String[] args) {
        
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // create new person object named user and input parameters
        person user = new person("Billy", "Bob", "Sparrow");
        
        // output the value of firstName, lastName, and type
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getType());
        
        // ask user for their first name
        System.out.print("What is your first name?: ");
        // call setFirstName method to store user input as firstName in person object
        user.setFirstName(input.next());
        
        // ask user for their last name
        System.out.print("What is your last name?: ");
        // call setLastName method to store user input as lastName in person object
        user.setLastName(input.next());
        
        // create new string array to store the 20 traits the user will be asked about
        String[] traits = new String[20];
        traits[0] = "take-charge";
        traits[1] = "implement";
        traits[2] = "reponsible";
        traits[3] = "leader";
        traits[4] = "strong willed";
        traits[5] = "outgoing";
        traits[6] = "spontaneous";
        traits[7] = "flexible";
        traits[8] = "dramatic";
        traits[9] = "entertaining";
        traits[10] = "loyal";
        traits[11] = "giving";
        traits[12] = "sentimental";
        traits[13] = "team-oriented";
        traits[14] = "sensative";
        traits[15] = "planner";
        traits[16] = "logical";
        traits[17] = "creative";
        traits[18] = "analytical";
        traits[19] = "thoretical";
        
        // call set type method and set String type in person object as the return value of questionChecker method
        user.setType(questionChecker(traits));
        
        // print the results of the quiz and user's name to show the setter methods worked
        System.out.println("First Name: " + user.getFirstName());
        System.out.println("Last Name: " + user.getLastName());
        System.out.println("Personality Type: " + user.getType());

    }
    
    /*IPO Chart
    Input: Recieves traits array from main method.
    Process: initialzes counter variables for each personality type. Iterates through trait array using for loop and asks user
    if each trait describes them. If their response is yes one of the trait variables is incremented depending on
    the array index the loop is on. The loop ends and there is another if/else block that checks which trait counter
    has the highest total.
    Output: Returns a String telling which personality type the user is.
    */
    
    /* create String returning questionCheck method to ask user questions and keep track of each personality trait
       and then return a string telling which personality type they are based on the questions answered yes.
    */
    public static String questionChecker(String[] array) {
        
        // initialze int counter variables to keep track of the amount of questions answered for each trait
        int hawk = 0;
        int swan = 0;
        int sparrow = 0;
        int raven = 0;
        
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // for loop iterates through each question in the array parameter and asks the user
        for (int i = 0; i < array.length; i++) {
            System.out.print("Does the trait " + array[i] + " describe you?: ");
            
            // userResponse variable stores the user input to check against if/else statement
            String userResponse = input.nextLine();
            
            // if/else block to check user responses and increment counter for each trait
            if (userResponse.equalsIgnoreCase("Yes") && i <= 4) {
                hawk++;  
            } else if (userResponse.equalsIgnoreCase("Yes") && i <= 9) {
                swan++; 
            } else if (userResponse.equalsIgnoreCase("Yes") && i <= 14) {
                sparrow++;
            } else if (userResponse.equalsIgnoreCase("Yes")) {
                raven++;
            } // end of if/else
             
        } // end of loop
        
        // if/else block checks the total of the counter variables against each other to determine which personality
        // type the user is based on which trait counter has the highest total.
        if (hawk > swan && hawk > sparrow && hawk > raven) {
            return "Hawk";
        } else if (swan > hawk && swan > sparrow && swan > raven) {
            return "Swan";
        } else if (sparrow > hawk && sparrow > swan && sparrow > raven) {
            return "Sparrow";
        } else {
            return "Raven";
        }
        
    } // end of questionChecker
     
}
