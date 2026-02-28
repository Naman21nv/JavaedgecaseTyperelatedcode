/**
 * Stock Buy and Sell Problem: Find maximum profit from single buy-sell transaction.
 * Rule: Buy before sell (can't sell before buying).
 * 
 * TCS NQT Question Format:
 * "You are given an array where arr[i] is the price of stock on day i.
 *  Find the maximum profit by buying on one day and selling on another day.
 *  You must buy before you sell.
 *  Example: prices[] = {7,1,5,3,6,4}
 *  Output: 5 (Buy at 1, Sell at 6)"
 * 
 * ALGORITHM APPROACH - GREEDY (Single Pass):
 * Key Idea: Buy at lowest price before current day, sell at current day
 * - Track minimum price seen so far (best buying point)
 * - At each day, calculate profit if we sell today
 * - Keep track of maximum profit
 * 
 * Why this works:
 * - We want minimum buy price and maximum sell price
 * - Sell price must come after buy price
 * - By tracking min price up to current point, we ensure buy happens before sell
 * 
 * Time: O(n), Space: O(1)
 * 
 * Handles edge cases: empty, null, single price, decreasing prices, all same prices.
 */
public class StockBuySell {
    public static void main(String[] args) {
        
        int[] prices = {7, 1, 5, 3, 6, 4};
        
        // Edge case: Null or empty array
        if(prices == null || prices.length == 0) {
            System.out.println("No prices available");
            return;
        }
        
        // Edge case: Single day (can't buy and sell on same day)
        if(prices.length == 1) {
            System.out.println("Maximum Profit = 0 (Need at least 2 days)");
            return;
        }
        
        // Algorithm: Track minimum price and maximum profit
        // Time: O(n), Space: O(1)
        
        int minPrice = Integer.MAX_VALUE;  // Minimum price seen so far (best buying point)
        int maxProfit = 0;                 // Maximum profit found so far
        
        // Single pass through prices
        for(int price : prices) {
            
            // Update minimum price if current price is lower
            if(price < minPrice) {
                minPrice = price;  // Found better buying opportunity
            } 
            // Calculate profit if we sell at current price
            else {
                // Profit = Current price - Minimum price seen before
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        
        // Edge case: Prices always decreasing (no profit possible)
        if(maxProfit == 0) {
            System.out.println("Maximum Profit = 0 (No profitable transaction possible)");
        } else {
            System.out.println("Maximum Profit = " + maxProfit);
        }
    }
}

/*
 * TCS NQT QUESTION VARIATIONS:
 * 
 * 1. Basic: "Find maximum profit with one buy-sell transaction"
 * 2. With Days: "Print the buy day and sell day for maximum profit"
 * 3. Multiple Transactions: "Find maximum profit with unlimited transactions"
 * 4. Two Transactions: "Find maximum profit with at most 2 transactions"
 * 5. With Fee: "Find maximum profit with transaction fee"
 * 
 
 * EXAMPLE WALKTHROUGH: prices = {7,1,5,3,6,4}
 * 
 * Day 0: price=7 -> minPrice=7, maxProfit=0 (first day, no profit yet)
 * Day 1: price=1 -> minPrice=1 (found lower price), maxProfit=0
 * Day 2: price=5 -> minPrice=1, maxProfit=4 (sell at 5, bought at 1)
 * Day 3: price=3 -> minPrice=1, maxProfit=4 (profit 2 < 4, no update)
 * Day 4: price=6 -> minPrice=1, maxProfit=5 (sell at 6, bought at 1) ✓
 * Day 5: price=4 -> minPrice=1, maxProfit=5 (profit 3 < 5, no update)
 * 
 * Answer: 5 (Buy on day 1 at price 1, Sell on day 4 at price 6)
 * 
 * EDGE CASE SCENARIOS:
 * 
 * 1. Decreasing prices: {5,4,3,2,1} -> Profit = 0 (no profitable transaction)
 * 2. Increasing prices: {1,2,3,4,5} -> Profit = 4 (buy at 1, sell at 5)
 * 3. All same: {5,5,5,5} -> Profit = 0 (no change in price)
 * 4. Single element: {10} -> Profit = 0 (need at least 2 days)
 * 
 * TIME COMPLEXITY: O(n) - single pass through array
 * SPACE COMPLEXITY: O(1) - only using two variables
 */