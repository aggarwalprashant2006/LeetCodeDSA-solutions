class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int sum1 = 0;
        int sum2 = 0;
        int si =0;
        while(si < k){
            sum2 += nums[si];
            si++;
        }
        int ei = nums.length-1;
        while(k > 0){
            sum1 += nums[ei];
            k--;
            ei--;
        }
        return sum1-sum2;
    }
}