package day1;

public class BestTimeToSellAndBuyStocks {
    public static int bestTimeToSellAndBuyStocks(int[] arr){
        int min = arr[0];
        int profit = 0 ;
        for (int index = 0; index < arr.length; index++) {
            int cost = arr[index]-min;
            profit = Math.max(profit ,cost);
            min = Math.min(arr[index],min);
        }
        return profit;
    }

    public static void main(String[] args) {
        int [] stocksPrices = new int[]{7,1,5,6,3,4};
        int result = bestTimeToSellAndBuyStocks(stocksPrices);
        System.out.println("result = " + result);
    }
}
