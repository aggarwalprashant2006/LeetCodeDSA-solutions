class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int arr[] = new int[prices.length];
        long max = 0;
        for(int i =0;i<prices.length;i++){
            arr[i]= prices[i]*strategy[i];
            max += arr[i];
        }
        int i =k/2;
        long sum2 = 0;
        int j = i;
        while(i < prices.length && i < k){
            sum2 += prices[i]*1;
            i++;
        }
        long sum3 = 0;
        while(i < prices.length){
            sum3 += arr[i];
            i++;
        }
        int a = 0;
        long sum1 = 0;
        long sum = sum1+sum2+sum3;
        max = Math.max(max,sum);
        while(j+(k/2) < prices.length){
            sum1 += arr[a];
            sum2 -= prices[j]*1;
            sum2 += prices[j+(k/2)]*1;
            sum3 -= arr[j+(k/2)];
            a++;
            j++;
            sum = sum1+sum2+sum3;
            max = Math.max(max,sum);
        }
        return max;
    }
}