class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        for(int i  =0;i<nums.length;i++){
            if(!set.contains(nums[i]) && !set1.contains(nums[i])){
                sum += nums[i];
                set.add(nums[i]);
            }else if(set.contains(nums[i]) && !set1.contains(nums[i])){
                sum -= nums[i];
                set.remove(nums[i]);
                set1.add(nums[i]);
            }
        }
        return sum;
    }
}