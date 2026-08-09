class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        int count = 0;
        while(count < nums.length){
            List<Integer> lst = new ArrayList<>();
            for(int i =0;i<nums.length;i++){
                if(!map.contains(nums[i]) && nums[i] != -1){
                    map.add(nums[i]);
                    lst.add(nums[i]);
                    nums[i] = -1;
                }
            }
            count+= lst.size();
            list.add(lst);
            map.clear();
        }
        return list;
    }
}