class Solution {
    public int[] decompressRLElist(int[] nums) {
        int sum = 0;
        for(int i =0;i<nums.length;i+=2){
            sum += nums[i];
        }
        int arr[] = new int[sum];
        int j = 0;
        for(int i =0;i<nums.length;i+=2){
            int a = 0;
            while(a < nums[i]){
                arr[j] = nums[i+1];
                j++;
                a++;
            }
        }
        return arr;
    }
}