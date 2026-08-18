class Solution {
    public int largestInteger(int[] nums, int k) {
        int max = -1;
        if(nums.length == k){
            for(int i =0;i<nums.length;i++){
                max = Math.max(nums[i],max);
            }
        }
        if(max != -1){
            return max;
        }
        if((nums[0] == nums[nums.length-1] && nums.length == 2) || (nums[0] == nums[nums.length-1]) && k!= 1){
            return -1;
        }
        int min = -1;
        if(k == 1){
            for(int i =0;i<nums.length;i++){
            int count = 0;
                for(int j = 0;j<nums.length;j++){
                    if(nums[i] == nums[j]){
                        count++;
                    }
                }
                if(count == 1){
                    min = Math.max(min,nums[i]);
                }
            }
            return min;
        }
        if(min != -1){
            return min;
        }
        int a = nums[0];
        int b = nums[nums.length-1];
        int count1 = 1;
        int count2 = 1;
        for(int i =1;i<nums.length-1;i++){
            if(nums[i] == a){
                count1++;
            }else if(nums[i] == b){
                count2++;
            }
        }
        if(count1 == 1 && count2 == 1){
            return Math.max(a,b);
        }else if(count2 == 1){
            return b;
        }else if(count1 == 1){
            return a;
        }
        return -1;
    }
}