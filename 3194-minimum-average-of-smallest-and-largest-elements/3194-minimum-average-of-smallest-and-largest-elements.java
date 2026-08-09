class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int si =0;
        int ei = nums.length-1;
        double min = Integer.MAX_VALUE;
        while(si < ei){
            double a = (double)(nums[si]+nums[ei])/2.0;
            min = (double)Math.min(min,a);
            si++;
            ei--;
        }
        return (double)min;
    }
}