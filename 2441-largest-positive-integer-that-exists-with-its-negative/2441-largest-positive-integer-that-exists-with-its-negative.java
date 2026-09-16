class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int max = -1;
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i] < 0){
                if(!set.contains(nums[i])){
                    set.add(nums[i]);
                }
            }else{
                int a = nums[i]*-1;
                if(set.contains(a)){
                    max = Math.max(max,nums[i]);
                }
            }
        }
        return max;
    }
}