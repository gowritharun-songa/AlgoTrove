class Main {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int res = bestTimeToBuyAndSellStock(prices);
        
        System.out.println(res);
    }

    private static int bestTimeToBuyAndSellStock(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        //Traverse through the prices

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
