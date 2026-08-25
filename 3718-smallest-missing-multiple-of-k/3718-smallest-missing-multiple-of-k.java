class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int i = k;
        int j = 2;
        int a = i;
        while(set.contains(i)){
            i = a*j;
            j++;
        }
        return i;
    }
}