/*
* Program       : BrighterLights.java
* Purpose       : Merchandise Order Application - Allows customers to 
                  purchase products from an online company.
* Programmer    : Justin Kennelly
* Date          : 6/20/2021
*/

import java.util.Scanner;

public class BrighterLights {

    // Initialize CONSTANT item costs
    final static double itemCost1 = 1.50;
    final static double itemCost2 = 3.00;
    final static double itemCost3 = 4.00;

    // Initialize CONSTANT discount values
    final static double discount1 = .10;
    final static double discount2 = .15;
    final static double discount3 = .20;

    public static void main(String args[]) {

        // Initializes variables to track the quantity of each product individually
        int quantProd1 = 0;
        int quantProd2 = 0;
        int quantProd3 = 0;

        // Initialize a new scanner to receive users input
        Scanner sc = new Scanner(System.in);

        int choice;     // Initialize a varible to track the user's decisions
        char ch = 'y';  // Character set to y "yes" for continuation loop condition
        int quantity;   // Variable to track the user input quantity of each product 

        // Total quantity of all items selected
        int totalQuantity = 0;
        
        // Loop that will not close until the user enters "n" or "N" when prompted
        while(true)
        {
            //showing items details
            System.out.println("\n[ID]    [Product]      [Cost per Item]\n");
            System.out.println("[1]     13 watt bulb : $1.50 ");
            System.out.println("[2]     18 watt bulb : $3.00 ");
            System.out.println("[3]     23 watt bulb : $4.00 \n");
            System.out.println("Please enter the Product ID to continue: ");
            
            // Scanner that takes user input and sets it to the choice variable
            choice = sc.nextInt();

            // Input Validation to check whether user input is within the bounds of choices
            if(choice < 1 || choice > 3)
            {
                System.out.println("Invalid Entry");
                continue;
            }

            System.out.println("\nPlease Enter the quantity of the selected Item: ");
            quantity = sc.nextInt();    // Scanner used to get the quantity from user input
            totalQuantity += quantity;  // Adds the quantity of product selected to the total running quantity

            // Input validation to check whether the user put in a quantity for the items selected
            if(quantity < 0)
            {
                System.out.println("Invalid Entry");
                continue;
            }
            
            // Logic used to assign the quantity to the correct product selected
            if(choice == 1) {
                quantProd1 += quantity;
            }
            if(choice == 2) {
                quantProd2 += quantity;
            }
            if(choice == 3) {
                quantProd3 += quantity;
            }

            System.out.println("\nWould you like to select another item? Enter [y] Yes or [n] No");
            ch = sc.next().charAt(0);   // Scanner used to get the character input from user
            ch = Character.toLowerCase(ch);     // Sets the charachter to lowercase 

            // Logic to check the user input, if n the loop is ended, if y the lopp continues
            if(ch == 'n') {
                break;
            }
            else if(ch == 'y') {
               continue;
            }
            else {
                System.out.println("Invalid Entry");
                continue;
            }

        }
    
    // Initalize the variables used to calculate costs
    double calcDiscount = 0;
    double shippingCost = 0;
    double netValue = 0;
    double totalCost = 0; 

    // Calculate the cost of items before discounts & shipping costs
    netValue = (itemCost1 * quantProd1) + (itemCost2 * quantProd2) + (itemCost3 * quantProd3);
    
    // Logic used to calculate the total number of items and apply discounts
    if(totalQuantity > 4 && totalQuantity < 8) {
        calcDiscount = discount1 * netValue;
    }
    else if(totalQuantity >= 8 && totalQuantity <= 9) {
        calcDiscount = discount2 * netValue;
    }
    else if(totalQuantity >= 10) {
        calcDiscount = discount3 * netValue;
    }

    // Logic used to calculate the shipping costs
    if(netValue - calcDiscount < 15) {
        shippingCost = 5.00;
    }

    // Logic used to calculate the final total
    totalCost = (netValue - calcDiscount) + shippingCost;

    // Logic used to display the proper data
    if(quantProd1 > 0) {
        System.out.printf("%n%nProduct 1: 13 watt bulb unit price: $1.50 quantity: %s extended price: $ %.2f %n%n", quantProd1, quantProd1 * itemCost1);
    }
    if(quantProd2 > 0) {
        System.out.printf("Product 2: 18 watt bulb unit price: $3.00 quantity %s extended price: $ %.2f %n%n", quantProd2, quantProd2 * itemCost2);
    }
    if(quantProd3>0) {
        System.out.printf("Product 3: 23 watt bulb unit price: $4.00 quantity %s extended price: $ %.2f %n", quantProd3, quantProd3 * itemCost3);
    }

    String s = " ";     // Space charachter initialized for formatting purposes
    
    // Display the final data to the user
    System.out.printf("%n%nPrice of Products %48s : $ %.2f", s, netValue);
    System.out.printf("%n%nDiscounts %56s : $ %.2f", s, calcDiscount);
    System.out.printf("%n%nNet Purchase amount %46s : $ %.2f", s, netValue - calcDiscount);
    System.out.printf("%n%nShipping Cost %52s : $ %.2f", s, shippingCost);
    System.out.printf("%n%nTotal %60s : $ %.2f %n%n", s, totalCost);

    sc.close();     // Close the scanner
    }
}
