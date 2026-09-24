class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low = 1;
        int high = 10_000_000;
        int a = high;
        while(low <= high){
            int mid = low + (high-low)/2;
            double count = 0;
            for(int i =0;i<dist.length;i++){
                if (i == dist.length - 1) {
                    count += (double) dist[i] / mid;
                } else {
                    count += dist[i] / mid;
                    if (dist[i] % mid != 0) {
                        count++;
                    }
                }
            }
            if(count <= hour){
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return low > a ? -1:low;
    }
}