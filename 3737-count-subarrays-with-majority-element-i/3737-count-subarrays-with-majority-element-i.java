class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int count = 0;
        for(int i =0;i<nums.length;i++){
            int c1 = 0;
            for(int j = i;j<nums.length;j++){
                if(nums[j] == target){
                    c1++;
                }
                int a = j-i+1;
                a /= 2;
                if(c1 > a){
                    count++;
                }
            }
        }
        return count;
    }
}