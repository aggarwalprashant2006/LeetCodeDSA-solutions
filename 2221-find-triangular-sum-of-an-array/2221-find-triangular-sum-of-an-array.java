class Solution {
    public int triangularSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            list.add(nums[i]);
        }
        while(list.size() > 1){
            List<Integer> lst = new ArrayList<>();
            for(int i =0;i<list.size()-1;i++){
                int a = list.get(i)+list.get(i+1);
                int rev = a % 10;
                lst.add(rev);
            }
            list.clear();
            list.addAll(lst);
        }
        return list.get(0);
    }
}