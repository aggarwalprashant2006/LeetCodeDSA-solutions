class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int ei = nums.length-1;
        while(ei >= 0){
            if(!map.contains(nums[ei])){
                map.add(nums[ei]);
                ei--;
            }else{
                break;
            }
        }
        ei = ei+1;
        if(ei%3 == 0){
            return ei/3;
        }
        return ei/3+1;
    }
}