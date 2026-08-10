class Solution {
    public int[] numberOfPairs(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        Arrays.sort(nums);
        int count = 1;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                count++;
            }else{
                if(count % 2 != 0 || count > 1){
                    count1 += count/2;
                }if(count % 2 != 0){
                    count2++;
                }
                count = 1;
            }
        }
        if(count % 2 != 0 || count > 1){
                count1 += count/2;
        }if(count % 2 != 0){
                count2++;
        }
        return new int[]{count1,count2};
    }
}