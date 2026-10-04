class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        for(int i =0;i<nums.length;i++){
            high = Math.max(high,nums[i]);
        }
        while(low <= high){
            int mid = low+(high-low)/2;
            int count = 0;
            for(int i =0;i<nums.length;i++){
                count += nums[i]/mid;
                if(nums[i]%mid != 0){
                    count++;
                }
            }
            if(count > threshold){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
}