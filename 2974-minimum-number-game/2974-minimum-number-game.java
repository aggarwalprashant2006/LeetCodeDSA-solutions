class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int i = 0;
        while(!pq.isEmpty()){
            int a = pq.remove();
            int b = pq.remove();
            nums[i++] = b;
            nums[i++] = a;
        } 
        return nums;
    }
}