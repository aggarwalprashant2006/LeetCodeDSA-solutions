class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int i =0;i<nums.length;i++){
            high += nums[i];
            low = Math.max(low,nums[i]);
        }
        while(low <= high){
            int mid = low+(high-low)/2;
            int a = mid;
            int count = 1;
            for(int i =0;i<nums.length;i++){
                if(nums[i] <= mid){
                    mid -= nums[i];
                }else{
                    count++;
                    mid = a-nums[i];
                }
            }
            if(count <= k){
                high = a-1;
            }else{
                low = a+1;
            }
        }
        return low;
    }
}