/*
* Program       : ParkCharge.java
* Purpose       : To calculate the cost of a duration of 
                  a customer stay within a parking garage.
* Programmer    : Justin Kennelly
* Date          : 6/13/2021
*/

import java.util.Scanner;

public class ParkCharge {
    static float rate;
    public static void main(String args[]) {
        
        // Initialize the scanner to get user input
        Scanner userIn = new Scanner(System.in);

        // Initialize all of the required variables
        String day;
        int arrTime, departTime, arrMin, 
            departMin, durTime, numOfIntervals;
        float parkCharge;

        // Prompt the user for the day of the week
        System.out.print("\n\nPlease enter the day of the week: ");
        day = userIn.nextLine();
        day = day.toUpperCase(); // Convert the string to uppercase 

        // Prompt the user for the vehicle's arrival time
        System.out.print("\nPlease Enter the vehicle's arrival time: ");
        arrTime = userIn.nextInt();

        // Prompt the user for the vehicle's departure time
        System.out.print("\nplease enter the vehicle's departure time: ");
        departTime = userIn.nextInt();

        // Calculate the arrival and departure times in minutes 
        arrMin = (arrTime % 100) + (arrTime / 100) * 60;
        departMin = (departTime % 100) + (departTime / 100) * 60;

        // Calculate the duration of the vehicle's stay in minutes
        durTime = departMin - arrMin;
        if (durTime < 0) {
            System.out.print("Invalid Duration!\n");
        }

        // Calculate the intervals of 15 that the vehicle stayed
        numOfIntervals = durTime / 15;
        if (numOfIntervals % 15 > 0) {
            numOfIntervals += 1;
        }
        
        // Set the pay rate based on the day of the week the vehicle stayed
        switch(day) {
            case "MON":
                rate= (float)1.25;
                break;
            case "TUE":
                rate= (float)1.25;
                break;
            case "WED":
                rate= (float)1.25;
                break;
            case "THU":
                rate= (float)1.25;
                break;
            case "FRI":
                rate= (float)1.25;
                break;
            case "SAT":
                rate= (float)0.50;
                break;
            case "SUN":
                rate= (float)0.50;
                break;
            default :
                System.out.println("Invalid Day Selection\n");
                break;
        }

        // Calculate the charge the vehicle owner received for their stay
        parkCharge = (numOfIntervals * rate);
        if (parkCharge > 15) {
            parkCharge= 15;
        }

        // Output tge data to the user
        System.out.printf("\n\nDay of week: %s", day);
        System.out.printf("\nParking duration in minutes: %s, rate: $%s", durTime, rate);
        System.out.printf("\nAmount charged: $%s", parkCharge);

        // Close the scanner
        userIn.close();
    
    }
}
