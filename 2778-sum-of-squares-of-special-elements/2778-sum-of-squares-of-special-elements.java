class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int count = 1;
        for(int i = 0;i<nums.length;i++){
            if(nums.length%count == 0){
                sum += nums[i]*nums[i];
            }
            count++;
        }
        return sum;
    }
}