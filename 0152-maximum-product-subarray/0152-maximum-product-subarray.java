class Solution {
    public int maxProduct(int[] nums) {
        int i = 0;
        int max = nums[0];
        while(i < nums.length){
            int prefix[] = new int[nums.length];
            for(int j =i;j<nums.length;j++){
                if(j == i){
                    prefix[j] = nums[i];
                    max = Math.max(max,prefix[j]);
                }else{
                    prefix[j] = prefix[j-1]*nums[j];
                    max = Math.max(max,prefix[j]);
                }
            }
            i++;
        }
        return max;
    }
}