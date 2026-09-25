class Solution {
    public int trap(int[] height) {
        int arr1[] = new int[height.length];
        int arr2[] = new int[height.length];
        int sum = 0;
        arr1[0]= height[0];
        for(int i =1;i<height.length;i++){
            arr1[i] = Math.max(arr1[i-1],height[i]);
        }
        arr2[height.length-1] = height[height.length-1];
        for(int i = height.length-2;i >= 0;i--){
            arr2[i] = Math.max(arr2[i+1],height[i]);
        }
        for(int i = 1;i<height.length-1;i++){
            sum += Math.min(arr1[i],arr2[i])-height[i];
        }
        return sum;
    }
}