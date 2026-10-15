class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int i =0;
        while(i < nums.length && map.getOrDefault(nums[i], 0) < k){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            i++;
        }
        max = Math.max(max,i);
        int j = i;
        int a = 0;
        while(j < nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.get(nums[j]) > k){
                map.put(nums[a],map.getOrDefault(nums[a],0)-1);
                a++;
            }
            max = Math.max(max,j-a+1);
            j++;
        }
        return max;
    }
}