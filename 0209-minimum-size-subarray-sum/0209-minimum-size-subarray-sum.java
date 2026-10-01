class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int si = 0;
        int a = -1;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
            while(sum >= target){
                min = Math.min(min,i-si+1);
                sum -= nums[si];
                si++;
                a=1;
            }
        }
        if(a == -1){
            return 0;
        }
        return min;
    }
}