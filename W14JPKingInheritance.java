
package w14jpkinginheritance;

/**
 *
 * @author jpking
 */
public class W14JPKingInheritance {

    /* IPO Chart
    Input: N/A
    Process: create player objects using constructor methods from sport specific subclasses, use mutator methods to
    change the information contained in the created player objects.
    Output: Print out info for each player object using the getter methods before and after mutator methods are called.
    */
    
    public static void main(String[] args) {
       
       // creating new objects for each sport class
       Football footballPlayer = new Football("Patrick", "Mahomes", "Chiefs", 15, 50000000 , "QB", 3265);
       Baseball baseballPlayer = new Baseball("Yadier", "Molina", "Cardinals", 4, 15000000, "Catcher", 21);
       Basketball basketballPlayer = new Basketball("Kobe", "Bryant", "Lakers", 24, 32000000, "SG", 33643);
       
       // use accessor methods to to print football player info
       System.out.println("First Name: " + footballPlayer.getFirstName());
       System.out.println("Last Name: " + footballPlayer.getLastName());
       System.out.println("Team: " + footballPlayer.getTeam());
       System.out.println("Number: " + footballPlayer.getNumber());
       System.out.printf("Salary: $%.2f/year%n", footballPlayer.getSalary());
       System.out.println("Position: " + footballPlayer.getPosition());
       System.out.println("Yards This Season: " + footballPlayer.getYards());
       
       System.out.println();
       
       // use accessor methods to to print baseball player info
       System.out.println("First Name: " + baseballPlayer.getFirstName());
       System.out.println("Last Name: " + baseballPlayer.getLastName());
       System.out.println("Team: " + baseballPlayer.getTeam());
       System.out.println("Number: " + baseballPlayer.getNumber());
       System.out.printf("Salary: $%.2f/year%n", baseballPlayer.getSalary());
       System.out.println("Position: " + baseballPlayer.getPosition());
       System.out.println("Home Runs This Season: " + baseballPlayer.getHomeruns());
       
       System.out.println();
       
       // use accessor methods to to print basketball player info
       System.out.println("First Name: " + basketballPlayer.getFirstName());
       System.out.println("Last Name: " + basketballPlayer.getLastName());
       System.out.println("Team: " + basketballPlayer.getTeam());
       System.out.println("Number: " + basketballPlayer.getNumber());
       System.out.printf("Salary: $%.2f/year%n", basketballPlayer.getSalary());
       System.out.println("Position: " + basketballPlayer.getPosition());
       System.out.println("Career Points: " + basketballPlayer.getPoints());
       
       System.out.println();
       
       // call mutator methods to change information for footballPlayer
       footballPlayer.setFirstName("George");
       footballPlayer.setLastName("Kittle");
       footballPlayer.setTeam("49ers");
       footballPlayer.setNumber(85);
       footballPlayer.setSalary(15000000);
       footballPlayer.setPosition("TE");
       footballPlayer.setYards(424);
       
       // call mutator methods to change information for baseballPlayer
       baseballPlayer.setFirstName("Aaron");
       baseballPlayer.setLastName("Judge");
       baseballPlayer.setTeam("Yankees");
       baseballPlayer.setNumber(99);
       baseballPlayer.setSalary(20000000);
       baseballPlayer.setPosition("1B");
       baseballPlayer.setHomeruns(62);
       
       // call mutator methods to change information for basketballPlayer
       basketballPlayer.setFirstName("Ja");
       basketballPlayer.setLastName("Morant");
       basketballPlayer.setTeam("Grizzlies");
       basketballPlayer.setNumber(12);
       basketballPlayer.setSalary(18000000);
       basketballPlayer.setPosition("PG");
       basketballPlayer.setPoints(4361);
       
       
       // use accessor methods to to print updated football player info
       System.out.println("First Name: " + footballPlayer.getFirstName());
       System.out.println("Last Name: " + footballPlayer.getLastName());
       System.out.println("Team: " + footballPlayer.getTeam());
       System.out.println("Number: " + footballPlayer.getNumber());
       System.out.printf("Salary: $%.2f/year%n", footballPlayer.getSalary());
       System.out.println("Position: " + footballPlayer.getPosition());
       System.out.println("Yards This Season: " + footballPlayer.getYards());
       
       System.out.println();
       
       // use accessor methods to to print updated baseball player info
       System.out.println("First Name: " + baseballPlayer.getFirstName());
       System.out.println("Last Name: " + baseballPlayer.getLastName());
       System.out.println("Team: " + baseballPlayer.getTeam());
       System.out.println("Number: " + baseballPlayer.getNumber());
       System.out.printf("Salary: $%.2f/year%n", baseballPlayer.getSalary());
       System.out.println("Position: " + baseballPlayer.getPosition());
       System.out.println("Home Runs This Season: " + baseballPlayer.getHomeruns());
       
       System.out.println();
       
       // use accessor methods to to print updated basketball player info
       System.out.println("First Name: " + basketballPlayer.getFirstName());
       System.out.println("Last Name: " + basketballPlayer.getLastName());
       System.out.println("Team: " + basketballPlayer.getTeam());
       System.out.println("Number: " + basketballPlayer.getNumber());
       System.out.printf("Salary: $%.2f/year%n", basketballPlayer.getSalary());
       System.out.println("Position: " + basketballPlayer.getPosition());
       System.out.println("Career Points: " + basketballPlayer.getPoints());
        
    }
    
}
