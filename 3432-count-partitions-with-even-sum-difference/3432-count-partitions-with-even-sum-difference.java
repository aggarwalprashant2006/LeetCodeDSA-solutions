class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
        }
        int sum1 = nums[0];
        int count = 0;
        for(int i =1;i<nums.length;i++){
            int a = sum-sum1;
            if((a-sum1)%2 == 0){
                count++;
            }
            sum1 += nums[i];
        }
        return count;
    }
}