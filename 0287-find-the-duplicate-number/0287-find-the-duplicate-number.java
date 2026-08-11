class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(!map.contains(nums[i])){
                map.add(nums[i]);
            }else{
                return nums[i];
            }
        }
        return -1;
    }
}