class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++){
            int sum = 0;
            for(int j = i; j < nums.size(); j++){
                sum += nums.get(j);
                if(j-i+1 >= l && j-i+1 <= r){
                    if(min > sum && sum > 0){
                        min = sum;
                    }
                }

                if(j-i+1 > r){
                    break;
                }
            }
        }
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}