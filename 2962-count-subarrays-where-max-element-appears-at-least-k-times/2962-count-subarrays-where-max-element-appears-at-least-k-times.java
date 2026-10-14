class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0;
        for(int i =0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        long sum = 0;
        int i =0;
        int count = 0;
        while(i < nums.length && count < k){
            if(nums[i] == max){
                count++;
            }
            i++;
        }
        int j = i-1;
        int a = 0;
        while(j < nums.length){
            if(j >= i){
                if(nums[j] == max){
                    count++;
                }
            }
            while(count >= k){
                sum += nums.length-j;
                if(nums[a] == max){
                    count--;
                }
                a++;
            }
            j++;
        }
        return sum;
    }
}