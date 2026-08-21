class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int k = (int)Math.pow(2,maximumBit)-1;
        int arr[] = new int[nums.length]; 
        int a = 0;
        for(int i =0;i<nums.length;i++){
            a ^= nums[i];
            arr[i] = a;
        }
        int arr1[] = new int[nums.length];
        int e = 0;
        for(int i = arr.length-1; i >= 0;i--){
            int c = arr[i]^k;
            arr1[e] = c;
            e++;
        }
        return arr1;
    }
}