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
        int count1 = 0;
        int sum = 0;
        for(int i = lst.size()-1;i > 0;i--){
            count1 +=lst.get(i);
            sum += count1; 
        }
        return sum;
    }
}