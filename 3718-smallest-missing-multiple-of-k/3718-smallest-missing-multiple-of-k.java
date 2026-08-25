class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int j = 2;
        int a = k;
        while(set.contains(k)){
            k = a*j;
            j++;
        }
        return k;
    }
}