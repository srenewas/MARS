package com.seenu.DSA;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices = {7, 6, 5, 1, 6, 8};
        int minPrice = Integer.MAX_VALUE;  // Initialize minPrice with the maximum possible integer value.
        int maxProfit =0;  // Initialize maxProfit to 0, assuming no profit at the start.

        for (int price : prices){
            if (price<minPrice){
                minPrice=price;
            }else{
                maxProfit=Math.max(maxProfit, price - minPrice);
            }
        }
        System.out.println("Maximum_Profit is: "+maxProfit);
    }
}
