public class leetcode_122 {
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        System.out.println("Max Profit => " + best_time_to_Buy_sell_stocks_II(arr));
    }

    public static int best_time_to_Buy_sell_stocks_II(int [] prices){

        int maxProfit = 0;
        for (int i=1; i<prices.length; i++) {
            if(prices[i] > prices[i-1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
    
}
