class Solution {
    public int findMiddleIndex(int[] nums) {
        int arr[] = new int[nums.length];
        int arr1[] = new int[nums.length];
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            arr[i] = sum;
            sum += nums[i];
        }
        int sum1 = 0;
        for(int i = nums.length-1;i>=0;i--){
            arr1[i] = sum1;
            sum1 += nums[i];
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i] == arr1[i]){
                return i;
            }
        }
        return -1;
    }
}