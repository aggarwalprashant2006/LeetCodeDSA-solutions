class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int count = 0;
        for(int i =0;i<nums.length;i++){
            if(!map.contains(nums[i])){
                count++;
                map.add(nums[i]);
            }
        }
        int count1 = 0;
        for(int i =0;i<nums.length;i++){
            HashSet<Integer> map1 = new HashSet<>();
            int count2 = 0;
            for(int j = i;j<nums.length;j++){
                if(!map1.contains(nums[j])){
                    map1.add(nums[j]);
                    count2++;
                    if(count2  == count){
                        count1++;
                    }
                }else{
                    if(count2 == count){
                        count1++;
                    }
                }
            }
        }
        return count1;
    }
}