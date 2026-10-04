class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long min = Integer.MAX_VALUE;
        long low = 1;
        for(int i =0;i<time.length;i++){
            min = Math.min(min,time[i]);
        }
        long high = (long)min*totalTrips;
        while(low <= high){
            long mid = low+(high-low)/2;
            long count = 0;
            for(int i = 0;i<time.length;i++){
                count+= mid/time[i];
            }
            if(count >= totalTrips){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}