class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long low = 1;
        long high = 0;
        for(int i =0;i<piles.length;i++){
            high += piles[i];
        }
        while(low <= high){
            long mid = low+(high-low)/2;
            long count = 0;
            for(int i = 0;i<piles.length;i++){
                count+= piles[i]/mid;
                if(piles[i]%mid != 0){
                    count++;
                }
            }
            if(count <= h){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return (int)low;
    }
}