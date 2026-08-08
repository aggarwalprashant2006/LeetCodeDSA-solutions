class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            map.add(nums[i]);
            max = Math.max(max,nums[i]);
        }
        int i =1;
        if(max < Integer.MAX_VALUE){
            max = max+1;
        }
        while(i <= max){
            if(!map.contains(i)){
                return i;
            }else{
                i++;
            }
        }
        return 1;
    }
}