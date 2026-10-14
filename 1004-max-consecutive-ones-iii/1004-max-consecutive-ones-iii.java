class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int max = 0;
        int i =0;
        while(i < nums.length && count < k){
            if(nums[i] == 0){
                count++;
            }
            i++;
        }
        max = Math.max(max,i);
        int j = i;
        int a = 0;
        while(j < nums.length){
            if(nums[j] == 0){
                count++;
            }
            while(count > k){
                if(nums[a] == 0){
                    count--;
                }
                a++;
            }
            max = Math.max(max,j-a+1);
            j++;
        }
        return max;
    }
}