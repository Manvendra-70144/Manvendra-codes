public class leetcode_121 {
    public static void main(String[] args) {
        int [] arr = {7,6,4,3,1};
        System.out.println("Max Profit => " + best_time_to_Buy_sell_stocks(arr));
    }

    public static int best_time_to_Buy_sell_stocks(int [] prices){

        int min = prices[0];
        int maxProfit = 0;
        for (int i : prices) {
            min = Math.min(min, i);
            int Profit = i-min ;
            maxProfit = Math.max(Profit, maxProfit);
        }
        return maxProfit;
    }
}
