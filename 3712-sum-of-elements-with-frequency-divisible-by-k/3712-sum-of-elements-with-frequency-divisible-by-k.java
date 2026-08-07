class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int count = 1;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                count++;
            }else{
                if(count % k == 0){
                    sum += nums[i]*count;
                }
                count = 1;
            }
        }
        if(count % k == 0){
            sum += nums[nums.length-1]*count;
        }
        return sum;
    }
}