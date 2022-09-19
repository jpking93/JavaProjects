/* IPO Chart
Input: Prompt user to enter their grades for first three chapter assignments.
       Store in float variables chapter1, chapter2 and chapter3
Process: Calculate the sum and store in float totalPoints, find the min value and 
         store in float finalMinScore, find the max value and store in float 
         finalMaxValue, calculate the average and store in float averageScore, find
         rounded average for floats chapter1, chapter2, and chapter3 and store
         in int roundedAvg
Output: Print out the users grade on each assignment (floats chapter1, chapter2,
        chapter3), print user's minimum and maximum scores (floats finalMinScore
        and finalMaxScore), print user's average score and rounded average score
        (float averageScore and int roundedAvg)
*/

package w4yournameformattedoutput;
// import java.util library
import java.util.*;
/**
 *
 * @author jpking
 */
public class W4YourNameFormattedOutput {

    public static void main(String[] args) {
        
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // ask user for chapter 1 assignment grade
        System.out.print("How many points did you get on chapter 1 assignment?: ");
        // read user input and store in float chapter1
        float chapter1 = input.nextFloat();
        
        // ask user for chapter 2 assignment grade
        System.out.print("How many points did you get on chapter 2 assignment?: ");
        // read user input and store in float chapter2
        float chapter2 = input.nextFloat();
        
        // ask user for chapter 3 assignment grade
        System.out.print("What was your grade on chapter 3 assignment?: ");
        // read user input and store in float chapter3
        float chapter3 = input.nextFloat();
        
        // check if user input a grade below 0 points or over 10 points using if/else statment
        if (chapter1 < 0 || chapter2 < 0 || chapter3 < 0) {
            System.out.println("Grade cannot be negative.");
            System.exit(1);
        } else if (chapter1 > 100.0 || chapter2 > 100.0 || chapter3 > 100.0) {
            System.out.println("Maximum grade is 100 percent.");
            System.exit(1);
        }
        
        // add all three chapters points together for sum of points
        float totalPoints = chapter1 + chapter2 + chapter3;
        
        // find min score for first and second chapters
        float minScore = Math.min(chapter1, chapter2);
        // find min score for all three chapters
        float finalMinScore = Math.min(chapter3, minScore);
        
        
        // find max score for first and second chapters
        float maxScore = Math.max(chapter1, chapter2);
        // find max score for all three chapters
        float finalMaxScore = Math.max(chapter3, maxScore);
        
        // find average score of all 3 values
        float averageScore = totalPoints / 3;
        
        // find rounded average
        int roundedAvg = Math.round(averageScore);
       
        
        // ouput 3 assignment grades with format specifier, float of length 5 with 2 decimal places
        System.out.printf("My three grades (%5.2f, %5.2f, %5.2f)%n", chapter1, chapter2, chapter3);
        // output min grade with format specifier, float of length 5 with 2 decimal places
        System.out.printf("My min grade (%5.2f)%n", finalMinScore);
        // output max grade with format specifier, float of length 5 with 2 decimal places
        System.out.printf("My max grade (%5.2f)%n", finalMaxScore);
        // output average grade with format specifier, float of length 5 with 2 decimal places
        System.out.printf("My average = (%5.2f)%n", averageScore);
        // output rounded average grade with format specifier, int of length 2 
        System.out.printf("My rounded average = (%2d)%n", roundedAvg);
                
    }
    
}
