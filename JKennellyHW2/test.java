package src;

public class test {
/*

Merchandise Order Application - Allows customers to purchase products from an online company.

Program input:

    decision of items
    quantity of items

Calculated intermediate values
    Final Cost of items
        totalCost = (netValue - calcDiscount) + shippingCost
    Net cost of Items before discounts / shipping
        netValue = (itemCost1 * quantProd1) + (itemCost2 * quantProd2) + (itemCost3 * quantProd3)
    Discounts applied
        calcDiscount = discount1 * netValue
    Cost of shipping
    if(netValue - calcDiscount < 15) {
        shippingCost = 5.00;
    }

Program output:
    Item descriptions, quanties, costs per item
    
    Net value
    Discounts applied
    shipping cost
    final cost

Validation rules:
    Selection of products must be within the bounds
        choice < 1 || choice > 3
    Quantity should be more than 0
        quantity < 0

Calculation of results: 
    Total charge
      totalCost = (netValue - calcDiscount) + shippingCost;  

Test Cases

            Product     Quantity        Input       Output

Test 1:
            1           3               1,3         
            3           3               3,3         correct

Test 2:
            2           2               4,2         incorrect
            3           5               3,5         correct

Test 3:
            1           100             1,100
            2           25              2,25
            3           10              3,10        correct

Test 4:
            1           0               1,0         incorrect
            3           2               3,2
            2           1               2,1
            4           2               4,2         incorrect
            3           2               3,2         correct
*/
}
