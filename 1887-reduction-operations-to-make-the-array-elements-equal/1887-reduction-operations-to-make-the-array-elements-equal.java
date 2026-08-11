class Solution {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);
        List<Integer> lst = new ArrayList<>();
        int count = 1;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                count++;
            }else{
                lst.add(count);
                count = 1;
            }
        }
        lst.add(count);
        int sum = 0;
        for(int i = 1;i<lst.size();i++){
            sum += i*lst.get(i);
        }
        return sum;
    }
}