/*
* Program       : loanCalculator.java
* Purpose       : To calculate the monthly payments for a loan
                    over an extended amount of time with various
                    incremental rates.
* Programmer    : Justin Kennelly
* Date          : 6/27/2021
*/

import java.util.List;
import java.util.ArrayList; 
import java.text.DecimalFormat;
import java.util.Scanner;

public class loanCalculator {

    // This method returns the number of intrest increments that will be applied to calculation
    public static int getNumOfInterestIncrements(float startingInterest, float endingInterest, float incrementPercent) {
        int numOfInterests = (int)((endingInterest - startingInterest) / incrementPercent) + 1;
        return numOfInterests;
    }

    // This method returns the number of years that will be incremented for calculation
    public static int getNumOfYears(int firstYear, int secondYear, int incrementYear) {
        int numOfYears = (int) ((secondYear - firstYear) / incrementYear) + 1;
        return numOfYears;
    }

    // This Method prints the header information dependent on the info from the user
    public static void getHeaderInfo(int firstYear, int secondYear, int incrementYear) {
        List<Integer> header = new ArrayList<Integer>(); // Initialise a new list
        // Iterate through the dates given by the user and add to the list
        for(int i = firstYear; i < (secondYear + incrementYear); i += incrementYear) {
            header.add(i);
        }

        System.out.print("Interest \n");
        System.out.print("Rate");
        // Iterate through the list and apply the dates to the header
        for(int val : header) {
            System.out.printf("%14s", val + " Years");
        }
        System.out.println("\n");
    }
    
    // This method takes all of the user input info and calulates the monthly payment plan for the user
    static void calcMonthlyPayment(float startingInterest, float incrementPercent, int numOfInterests, int firstYear, int incrementYear, int numOfYear, float loanAmount) {
      
        // Initalise a format used for the interests
        DecimalFormat df = new DecimalFormat("0.0000"); 
      

        // Iterates through the number interests
        for(int i = 0; i < numOfInterests; i++) {
           
            // Calculates the Monthly Interest Rate
            float mir = (startingInterest / (12 * 100));
          
            System.out.printf("%5s",df.format(startingInterest));
            float Year = firstYear; // Initalise a float year for calculation purposes
            // Iterate through the number of years
            for(int j = 0; j < numOfYear; j++) {
                float mtp = Year * 12; // Initialise Months To Pay
                float Numerator = (float) (mir * Math.pow((1 + mir), mtp)); 
                float Denominator =(float) ((((Math.pow((1 + mir), mtp)))-1));
                float AnnuityFactor = Numerator / Denominator;
                double Payment = (double) loanAmount * AnnuityFactor;
              
                Payment = (double) Math.round(Payment * 100) / 100; // Calculate the monthly payment
              
                System.out.printf("%13s", Payment);
                Year += incrementYear; // Increment to the next year
            }
          
            startingInterest += incrementPercent; // Increment to the next interest percentage
            System.out.println("\n");
          
        }

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); //Creating a scanner object to take the input from the user
      
        //Asking for the input from the user and storing into their respective variables.
        System.out.println("Enter the starting annual interest rate as a percent (n.nnn): ");
        float startingInterest = sc.nextFloat();

        System.out.println("Enter the ending annual interest rate as a percent (n.nnn): ");
        float endingInterest = sc.nextFloat();

        System.out.println("Enter the annual interest rate increment as a percent (n.nnn): ");
        float incrementPercent = sc.nextFloat();

        System.out.println("Enter the first term in years for calculating payments : ");
        int firstYear = sc.nextInt();

        System.out.println("Enter the last term in years for calculating payments : ");
        int secondYear = sc.nextInt();

        System.out.println("Enter the term increment in years : ");
        int incrementYear = sc.nextInt();

        System.out.println("Enter the loan amount : ");
        float loanAmount = sc.nextFloat();
        System.out.println("\n");
        
        int numOfInterests = getNumOfInterestIncrements(startingInterest, endingInterest, incrementPercent);
        int numOfYears = getNumOfYears(firstYear, secondYear, incrementYear);
        
        getHeaderInfo(firstYear, secondYear, incrementYear);
        
        calcMonthlyPayment(startingInterest, incrementPercent, numOfInterests, 
                                firstYear, incrementYear, numOfYears, loanAmount);
       
        sc.close();
    }
}
