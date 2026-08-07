class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int si = 0;
        int ei = si+1;
        while(ei < nums.length){
            if(Math.abs(nums[si]-nums[ei]) <= k){
                ei++;
            }else{
                count++;
                si = ei;
                ei = si+1;
            }
        }
        return count+1;
    }
}