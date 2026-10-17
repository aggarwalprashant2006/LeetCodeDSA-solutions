class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int i =0;
        int count = 0;
        while(i < nums.length && count < 1){
            if(nums[i] == 0){
                count++;
            }
            i++;
        }
        int j = i-1;
        int a = 0;
        while(j < nums.length){
            if(j >= i){
                if(nums[j] == 0){
                    count++;
                }
            }
            while(count > 1){
                if(nums[a] == 0){
                    count--;
                }
                a++;
            }
            max = Math.max(max,j-a);
            j++;
        }
        return max;
    }
}