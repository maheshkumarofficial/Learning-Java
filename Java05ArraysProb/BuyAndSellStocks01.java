/*
Given an array prices where prices[i] is the price of a given stock on the ith day. 
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. 
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0. 
*/

package Java05ArraysProb;

public class BuyAndSellStocks01
{
    public static int buyAndSellStocks(int currentPrices[]) {
        // Step 1: Initialize variables to keep track of buy price and maximum profit.
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        /* This code initializes two variables: buyPrice and maxProfit. 
        The buyPrice variable will store the price at which you buy the stock, 
        and the maxProfit variable will store the maximum profit you have made so far. 
        */

        // Step 2: Iterate through the array of stock prices.
        for (int i = 0; i < currentPrices.length; i++) { // This loop iterates over the array of stock prices, one price at a time.
            // Step 3: Check if the current stock price is a better selling opportunity.
            if (buyPrice < currentPrices[i]) { // If the current price is higher than the buy price, it's a potential profit.
                // Step 4: Calculate today's profit.
                int profit = currentPrices[i] - buyPrice; // Today's Profit

                // Step 5: Update the global/maximum profit if today's profit is higher.
                maxProfit = Math.max(maxProfit, profit); // Global/Maximum Profit
            } else {
                // Step 6: If the current price is not a good selling opportunity, update the buy price.
                buyPrice = currentPrices[i]; // Today's Buy Price {Better to buy the stocks}
            }
        }

        // Step 7: Return the maximum profit obtained.
        return maxProfit;
    }
    
    public static void main(String[] args) 
    {
        // Step 8: Example usage - an array representing stock prices over days.
        int CurrentPrices[] = {7, 1, 5, 3, 6, 4};
        
        // Step 9: Call the function and print the result.
        System.out.println(buyAndSellStocks(CurrentPrices));
    }
}

// Input: [7, 1, 5, 3, 6, 4]

// Output: CurrentPrices = 5
// Kaise aaya?
// minimum price = Rs. 1 on second day [index 1]
// maximum price = Rs. 6 on fifth day [index 4]
// (maximum price = Rs. 6) - (minimum price = Rs. 1) = CurrentPrices = 5 which is the maxProfit that can be obtained.