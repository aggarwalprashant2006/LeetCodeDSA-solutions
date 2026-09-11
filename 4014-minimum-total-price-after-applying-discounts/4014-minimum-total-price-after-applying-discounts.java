class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i = prices.length-1;
        int j = discounts.length-1;
        double sum = 0;
        while(Math.min(i,j) >= 0){
            sum += prices[i] * (100 - discounts[j])/100.0;
            j--;
            i--;
        }
        while(i >= 0){
            sum += prices[i];
            i--;
        }
        return sum;
    }
}