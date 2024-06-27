import java.util.*;
import java.util.Scanner;

/**
 * Grade calculator
 * @version 01
 */
public class gradecalc
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class gradecalc
     */
    public gradecalc()
    {
        // initialise instance variables
        x = 0;
    }

    public static double calcG(double amount, int score)
    {
        // put your code here
        return (amount * score) / 100;
    }
    
    public static void main(String[] args) {
        boolean moreassignments = true;
        Scanner myObj = new Scanner(System.in);
        
        while(moreassignments) {
            System.out.println("Please enter name and amount of 1st assessment: ");
            String name = myObj.next();
            double amount = myObj.nextDouble(); 
            System.out.println("Please enter your score on this assessment: ");
            int score = myObj.nextInt();
            
            double result = calcG(amount, score);
            System.out.println("This assignment is worth " + (int)result + " of your final grade.\n");

            myObj.nextLine(); // Consume the newline left-over
            System.out.println("Do you have any other assignments to submit? ");
            String bool = myObj.nextLine();
            
            if(bool.equalsIgnoreCase("no")) {
                moreassignments = false;
            } else {
                System.out.println("* * *\n");
            }
        }
        
        System.out.println("bye!");
    }
}
