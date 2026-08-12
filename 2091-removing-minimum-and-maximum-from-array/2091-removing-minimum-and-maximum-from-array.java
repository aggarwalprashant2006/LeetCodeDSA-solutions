class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        int si = 0;
        int sum1 = 0;
        int count = 0;
        while(count != 2 && si < nums.length){
            if(nums[si] == max || nums[si] == min){
                count++;
            }
            si++;
        }
        sum1 = si;
        si = nums.length-1;
        int sum2 = 0;
        count = 0;
        while(count < 2 && si >= 0){
            if(nums[si] == max || nums[si] == min){
                count++;
            }
            si--;
        }
        sum2 = nums.length-si-1;
        si = 0;
        int ei = nums.length - 1;
        while(si < ei){
            if((nums[si] == min || nums[si] == max) &&
                (nums[ei] == min || nums[ei] == max)){
                break;
            }

            if(nums[si] != max && nums[si] != min){
                si++;
            }

            if(nums[ei] != max && nums[ei] != min){
                ei--;
            }
        }

        int sum3 = nums.length - ei + si + 1;


        return Math.min(sum1,Math.min(sum3,sum2));
    }
}