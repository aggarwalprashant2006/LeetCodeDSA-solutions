class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i =0;i<nums.length;i++){
            if(nums[i] < 0){
                nums[i] *= -1;
            }
        }
        Arrays.sort(nums);
        long sum = 0;
        int si = 0;
        int ei = nums.length-1;
        while(si < ei){
            sum += (nums[ei]*nums[ei])-(nums[si]*nums[si]);
            si++;
            ei--;
        }
        if(nums.length%2 != 0){
            sum += nums[nums.length/2]*nums[nums.length/2];
        }
        return sum;
    }
}