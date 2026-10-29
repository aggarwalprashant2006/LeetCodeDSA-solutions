class Solution {
    public long[] findPrefixScore(int[] nums) {
        long max = 0;
        long sum = 0;
        long arr[] = new long[nums.length];
        for(int i = 0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            sum += max+nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}