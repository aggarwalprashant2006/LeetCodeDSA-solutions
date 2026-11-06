class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int arr1[] = new int[nums.length];
        int arr2[] = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(i > 0){
                arr1[i] = arr1[i-1]+nums[i];
            }else{
                arr1[i] = nums[i];
            }
        }
        for(int i = nums.length-1;i >= 0;i--){
            if(i < nums.length-1){
                arr2[i] = arr2[i+1]+nums[i];
            }else{
                arr2[i] = nums[i];
            }
        }
        int arr3[] = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            if(i == 0){
                int a = arr1[arr1.length-1]-nums[i];
                int b = nums[i]*(nums.length-1);
                arr3[i] = Math.abs(a-b);
            }else if(i == nums.length-1){
                int a = arr2[0]-nums[i];
                int b = nums[i]*(nums.length-1);
                arr3[i] = Math.abs(a-b);
            }else{
                int a = arr1[i-1];
                int b = arr2[i+1];
                int c = nums[i]*i;
                int d = (nums.length-i-1)*nums[i];
                arr3[i] = Math.abs(c-a)+Math.abs(d-b);
            }
        }
        return arr3;
    }
}