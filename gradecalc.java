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
        
        List<Double> amounts = new ArrayList<Double>();
        
        List<Integer> results = new ArrayList<Integer>();
        
        
        while(moreassignments) {
            System.out.println("Please enter name and amount of 1st assessment: ");
            String name = myObj.next();
            double amount = myObj.nextDouble(); ;
            System.out.println("Please enter your score on this assessment: ");
            int score = myObj.nextInt();
            
            int result = (int)calcG(amount, score);
            System.out.println("This assignment is worth " + result + " of your final grade.\n");
            results.add(result);
            
            myObj.nextLine();
            System.out.println("Do you have any other assignments to submit? ");
            String bool = myObj.nextLine();
            
            if(bool.equalsIgnoreCase("no")) {
                moreassignments = false;
            } else {
                System.out.println("* * *\n");
            }
        }
        
        int resultTotal = results.stream().mapToInt(f -> f.intValue()).sum();
        Double amountTotal = amounts.stream().mapToDouble(f -> f.doubleValue()).sum();
        
        
        System.out.println("In total, you have achieved " + resultTotal + "% of your grade");
        
        if(amountTotal < 100){
            System.out.println("However, you still have other assessments yet to be completed.");
        }
        

        
        
        
        System.out.println("bye!");
    }
}
