class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int i =0;
        int max = 0;
        int sum = 0;
        while(i < nums.length && !set.contains(nums[i])){
            set.add(nums[i]);
            sum += nums[i];
            i++;
        }
        max = Math.max(max,sum);
        int j = i;
        int a = 0;
        while(j < nums.length){
            while(set.contains(nums[j])){
                sum -= nums[a];
                set.remove(nums[a]);
                a++;
            }
            sum += nums[j];
            set.add(nums[j]);
            max = Math.max(max,sum);
            j++;
        }
        return max;
    }
}