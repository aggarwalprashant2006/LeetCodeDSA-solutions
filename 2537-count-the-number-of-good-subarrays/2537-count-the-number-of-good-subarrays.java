class Solution {
    public long countGood(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long pairs = 0;
        int i = 0;
        while(i < nums.length && pairs < k){
            pairs += map.getOrDefault(nums[i], 0);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            i++;
        }
        int j = i-1;
        int a = 0;
        long count = 0;
        while(j < nums.length){
            if(j >= i){
                pairs += map.getOrDefault(nums[j], 0);
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            }
            while(pairs >= k){
                count += nums.length-j;

                map.put(nums[a], map.get(nums[a]) - 1);
                pairs -= map.get(nums[a]);
                a++;
            }
            j++;
        }
        return count;
    }
}