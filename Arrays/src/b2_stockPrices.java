public class b2_stockPrices {

    public static int findProfit(int[] prices){
//        bp buying price , sp = selling price
        int bp = Integer.MAX_VALUE;

        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){

            int profit = 0;
            if(bp<prices[i]){
                profit = prices[i]-bp;
                maxProfit = Math.max(maxProfit,profit);
            } else{
                bp = prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};

        int pr = findProfit(arr);
        System.out.println("Maximum Profit is: " + pr);
    }
}
