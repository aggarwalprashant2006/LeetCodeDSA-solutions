class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int a = -1;
        int b = -1;
        int count = 1;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                count++;
            }else{
                if(count == 1){
                    if(a == -1){
                        a = nums[i];
                    }else{
                        b = nums[i];
                    }
                }
                count = 1;
            }
        }
        if(nums[nums.length-1] != nums[nums.length-2]){
            b = nums[nums.length-1];
        }
        return new int[]{a,b};
    }
}