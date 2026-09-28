class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,1);
        Arrays.sort(nums);
        int a =0;
        int max1 = 1;
        for(int i =1;i<nums.length;i++){
            int max = 0;
            for(int j = 0;j<i;j++){
                if(nums[i]%nums[j] == 0){
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] += max;
            if(max1 < dp[i]){
                max1 = dp[i];
                a = i;
            }
        }
        List<Integer> lst = new ArrayList<>();
        lst.add(nums[a]);
        int count = max1-1;
        int b = nums[a];
        for(int i = a-1;i>=0 &&count > 0;i--){
            if(b%nums[i] == 0 && count == dp[i]){
                count--;
                lst.add(nums[i]);
                b = nums[i];
            }
        }
        Collections.reverse(lst);
        return lst;
    }
}