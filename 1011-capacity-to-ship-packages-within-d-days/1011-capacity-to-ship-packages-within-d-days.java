class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int i =0;i<weights.length;i++){
            high += weights[i];
            low = Math.max(low,weights[i]);
        }
        while(low <= high){
            int mid = low+(high-low)/2;
            int a = mid;
            int count = 1;
            for(int i =0;i<weights.length;i++){
                if(weights[i] <= mid){
                    mid -= weights[i];
                }else{
                    count++;
                    mid = a-weights[i];
                }
            }
            if(count <= days){
                high = a-1;
            }else{
                low = a+1;
            }
        }
        return low;
    }
}