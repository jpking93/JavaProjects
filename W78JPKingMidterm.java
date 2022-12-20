package w7.pkg8jpkingmidterm;
// import java.util library
import java.util.*;

/**
 *
 * @author jpking
 */
public class W78JPKingMidterm {
    
    /*IPO Chart
    Input: take input from user on their first name, last name, year of college, and major
           and store in String variables.
    Process: Store quiz question in int array quizQuestions, read input from user, and then
             call methods quizGame and printResults.
    Output: Output the number of questions user got correct to printResults method.
    */

    public static void main(String[] args) {
        
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // create String array to store questions
        String[] quizQuestions = new String[20];
        quizQuestions[0] = """
                           A computer can execute code in which of the following:
                           A) machine Language
                           B) assembly language
                           C) high level language
                           D) none of the above
                           Enter Answer """;
        quizQuestions[1] = """
                           Which of the following is not an object oriented language?
                           A) Java
                           B) C++
                           C) Python
                           D) C
                           Enter Answer """;
        quizQuestions[2] = ".class is the Java file extension for the source code file, true or false?";
        quizQuestions[3] = "The = sign is the Java assignment operator, true or false?";
        quizQuestions[4] = "If a program compiles fine but produces an incorrect result, what type of error is this?";
        quizQuestions[5] = "What is the name for the physical parts of a computer that can be seen?";
        quizQuestions[6] = "If x = 1, what is x after x += 2?";
        quizQuestions[7] = "If x = 3, what is x after x -= 1?";
        quizQuestions[8] = "What does Math.pow(2, 3) return?";
        quizQuestions[9] = "What does Math.pow(5, 2) return?";
        quizQuestions[10] = "What does 5.2 + 4.3 return?";
        quizQuestions[11] = "What does 21 / 2.0 return?";
        quizQuestions[12] = "What method should you use to convert degrees to radians?";
        quizQuestions[13] = "What does Math.cos(Math.PI) return?";
        quizQuestions[14] = "What does Math.ceil(2.1) return?";
        quizQuestions[15] = "What does Math.floor(2.9) return?";
        quizQuestions[16] = "What does Math.max(3, 13) return?";
        quizQuestions[17] = "What does Math.min(2.5, 1.2) return?";
        quizQuestions[18] = "What is the best type of loop to use if you want to loop through each element of an array?";
        quizQuestions[19] = """
                            What is it called when you have multiple methods of the same name that accept a different
                            number of parameters or a different data type of parameters?""";
        
        // ask user to input their first name
        System.out.print("Enter your first name: ");
        // read user input and store in String firstName
        String firstName = input.nextLine();
        
        // ask user to input their last name
        System.out.print("Enter your last name: ");
        // read user input and store in String lastName
        String lastName = input.nextLine();
        
        // ask user to input their major
        System.out.print("Enter your major: ");
        // read user input and store in String major
        String major = input.nextLine();
       
        // ask user for their college level
        System.out.print("Enter your year of college: ");
        // read user input and store in String collegeLevel
        String collegeLevel = input.nextLine();     
        
        // store the return value of quizGame in int variable numberCorrect
        int numberCorrect = quizGame(quizQuestions);
        
        // call print results method to output final message to user
        printResults(firstName, lastName, major, collegeLevel, numberCorrect);
        
    }
    
    /*IPO Chart
    Input: Input string array quizQuestions
    Process: Initialize variables containing answers to quiz questions, initialize varible to track number of questions
    answered correctly. Initialize an int array (questions) to store the question numbers and then pass to switch statement
    using a for-each loop. Switch statment asks questions and compares input to correct answers.
    Output: Output each question to the user and then return the number of questions answered correctly.
    */
 
    /* method generates a integer array of length 10 and then runs each number through
       a switch statement to ask user 10 quiz questions and compare their response
       with the correct answer and then returns the number of questions they answered correctly
    */
    public static int quizGame(String[] quizQuestions) {
        
        // create new scanner object
        Scanner input = new Scanner(System.in);
        
        // initialize answers to quiz questions
        char answer0 = 'A';
        char answer1 = 'D';
        boolean answer2 = false;
        boolean answer3 = true;
        String answer4 = "logic error";
        String answer5 = "hardware";
        int answer6 = 3;
        int answer7 = 2;
        double answer8 = Math.pow(2, 3);
        double answer9 = Math.pow(5, 2);
        double answer10 = (5.2 + 4.3);
        double answer11 = (21 / 2.0);
        String answer12 = "Math.toRadians";
        double answer13 = Math.cos(Math.PI);
        double answer14 = Math.ceil(2.1);
        double answer15 = Math.floor(2.9);
        int answer16 = Math.max(3, 13);
        double answer17 = Math.min(2.5, 1.2);
        String answer18 = "For-Each";
        String answer19 = "Method Overloading";
        
        // initialize int variable to keep track of number of questions answered correctly
        int numberCorrect = 0;
        
        // initialize int array question of size 10 to store questions to be asked
        int[] questions = new int[10];

        /* for loop generates random number between 1 and 20 and checks questions array to see
        if question has already been selected by calling searhArray method,
        if it has decrement the counter variable and generate a new random number. If question has not 
        been used store that question number at the next index in the array.
        */
        for (int i = 0; i < 10; i++) {
            
            int randomNumber = (int) ((Math.random() * 20) + 1);
            
            if(searchArray(questions, randomNumber)) {
                i--;
            } else {
                questions[i] = randomNumber;
            }
            
        }
        
        // for-each loop iterates through each question in question array
        for (int index : questions) {
            
            /* this switch statement takes the number at each index of the array and asks the user
               the question associated with it. It subtracts 1 from the array value because otherwise
               the question at index 0 would get left out.
            */
            switch (index - 1) { 
                
                case 0: // if case is 0
                    System.out.print(quizQuestions[0] + ": "); // print question at index 0 of quizQuestions array to user
                    char guess0 = input.next().charAt(0); // read user input and store in char guess0
                    input.nextLine(); // process newline character at end of line
                    if (Character.toUpperCase(guess0) == answer0 ) { // if user input matches answer, increment numberCorrect
                        numberCorrect ++;
                    }
                    break; // break out of switch statement
                case 1:
                    System.out.print(quizQuestions[1] + ": ");
                    char guess1 = input.next().charAt(0);
                    input.nextLine();
                    if (Character.toUpperCase(guess1) == answer1) {
                        numberCorrect++;
                    }
                    break;
                case 2:
                    System.out.print(quizQuestions[2] + ": ");
                    boolean guess2 = input.nextBoolean();
                    input.nextLine();
                    if (guess2 == answer2) {
                        numberCorrect++;
                    }
                    break;
                case 3:
                    System.out.print(quizQuestions[3] + ": ");
                    boolean guess3 = input.nextBoolean();
                    input.nextLine();
                    if (guess3 == answer3) {
                        numberCorrect++;
                    }
                    break;
                case 4:
                    System.out.print(quizQuestions[4] + ": ");
                    String guess4 = input.nextLine();
                    if (guess4.equalsIgnoreCase(answer4)) {
                        numberCorrect++;
                    }
                    break;
                case 5:
                    System.out.print(quizQuestions[5] + ": ");
                    String guess5 = input.nextLine();
                    if (guess5.equalsIgnoreCase(answer5)) {
                        numberCorrect++;
                    }
                    break;
                case 6:
                    System.out.print(quizQuestions[6] + ": ");
                    int guess6 = input.nextInt();
                    input.nextLine();
                    if (guess6 == answer6) {
                        numberCorrect++;
                    }
                    break;
                case 7:
                    System.out.print(quizQuestions[7] + ": ");
                    int guess7 = input.nextInt();
                    input.nextLine();
                    if (guess7 == answer7) {
                        numberCorrect++;
                    }
                    break;
                case 8:
                    System.out.print(quizQuestions[8] + ": ");
                    double guess8 = input.nextDouble();
                    input.nextLine();
                    if (guess8 == answer8) {
                        numberCorrect++;
                    }
                    break;
                case 9:
                    System.out.print(quizQuestions[9] + ": ");
                    double guess9 = input.nextDouble();
                    input.nextLine();
                    if (guess9 == answer9) {
                        numberCorrect++;
                    }
                    break;
                case 10:
                    System.out.print(quizQuestions[10] + ": ");
                    double guess10 = input.nextDouble();
                    input.nextLine();
                    if (guess10 == answer10) {
                        numberCorrect++;
                    }
                    break;
                case 11:
                    System.out.print(quizQuestions[11] + ": ");
                    double guess11 = input.nextDouble();
                    input.nextLine();
                    if (guess11 == answer11) {
                        numberCorrect++;
                    }
                    break;
                case 12:
                    System.out.print(quizQuestions[12] + ": ");
                    String guess12 = input.nextLine();
                    if (guess12.equalsIgnoreCase(answer12)) {
                        numberCorrect++;
                    }
                    break;
                case 13:
                    System.out.print(quizQuestions[13] + ": ");
                    double guess13 = input.nextDouble();
                    input.nextLine();
                    if (guess13 == answer13) {
                        numberCorrect++;
                    }
                    break;
                case 14:
                    System.out.print(quizQuestions[14] + ": ");
                    double guess14 = input.nextDouble();
                    input.nextLine();
                    if (guess14 == answer14) {
                        numberCorrect++;
                    }
                    break;
                case 15:
                    System.out.print(quizQuestions[15] + ": ");
                    double guess15 = input.nextDouble();
                    input.nextLine();
                    if (guess15 == answer15) {
                        numberCorrect++;
                    }
                    break;
                case 16:
                    System.out.print(quizQuestions[16] + ": ");
                    int guess16 = input.nextInt();
                    input.nextLine();
                    if (guess16 == answer16) {
                        numberCorrect++;
                    }
                    break;
                case 17:
                    System.out.print(quizQuestions[17] + ": ");
                    double guess17 = input.nextDouble();
                    input.nextLine();
                    if (guess17 == answer17) {
                        numberCorrect++;
                    }
                    break;
                case 18:
                    System.out.print(quizQuestions[18] + ": ");
                    String guess18 = input.nextLine();
                    if (guess18.equalsIgnoreCase(answer18)) {
                        numberCorrect++;
                    }
                    break;
                case 19:
                    System.out.print(quizQuestions[19] + ": ");
                    String guess19 = input.nextLine();
                    if (guess19.equalsIgnoreCase(answer19)) {
                        numberCorrect++;
                    }
                    break;
                default: // if index does not match any cases print this message
                    System.out.println("Error, invalid index value. Check randomNumber");
                             
            } // end switch statement
           

        } // end for loop
        
        return numberCorrect; // once all ten questions have been asked return the number the user got correct
        
    } // end of quizGame method
    
    
    /*
    IPO Chart-
    Input: Accepts paramters String firstName, String lastName, String major, String collegeLevel and int numberCorrect.
    Process: Calculate number of question incorrect and store in int numberIncorrect. Calculate percentage correct and
    store in double percentCorrect.
    Output: Message to user tells them their name, major and year in college followed by their results on the quiz
    */
    
    
    
    // method accepts parameters from main method and prints message
    public static void printResults(String firstName, String lastName, String major, String collegeLevel, int numberCorrect) {
        
        int numberIncorrect = 10 - numberCorrect; // subtract the number correct from 10 to get number of incorrect answers
        double percentCorrect = (numberCorrect / 10.0) * 100; // divide number correct by 10 and multiply by 100 to get percentage correct
        
        // output messages to user telling them their quiz results
        System.out.println(firstName + " " + lastName + ", your major is " + major + " and you are a " + collegeLevel);
        System.out.println("You answered " + numberCorrect + " questions correctly.");
        System.out.println("You answered " + numberIncorrect + " questions incorrectly.");
        System.out.printf("You were correct on %2.0f%% of the questions.%n", percentCorrect);

    } // end of method printResults
    
    /*
    IPO Chart-
    Input: Accepts int array list and int key as parameters.
    Process: Using for-each loop check each index of the array to see if it contains the integer key
    Output: If it does contain key return true, if it does not return false.
    */
    
    // method searches questions array for each new random number to make sure there are no repeat questions
    public static boolean searchArray(int[] list, int key) {
        
        for (int i = 0; i < list.length; i++) { // for loop iterates through each element of array
            
            if (key == list[i]) { // if the number generated matches any of the number already in the array
            
                return true; // return true
            
            }
        
        }
        
      return false; // if the number does not match any values already in the array return false
    }
       
}
