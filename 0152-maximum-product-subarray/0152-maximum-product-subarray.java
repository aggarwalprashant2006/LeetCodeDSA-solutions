class Solution {
    public int maxProduct(int[] nums) {
        int i = 0;
        int max = nums[0];
        while(i < nums.length){
            int sum = 1;
            for(int j =i;j<nums.length;j++){
                sum = sum * nums[j];
                max = Math.max(max,sum);
            }
            i++;
        }
        return max;
    }
}