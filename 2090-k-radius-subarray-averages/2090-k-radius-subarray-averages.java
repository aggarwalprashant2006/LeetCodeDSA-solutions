class Solution {
    public int[] getAverages(int[] nums, int k) {
        int arr[] = new int[nums.length];
        long sum =0;
        int i = 0;
        while(i < nums.length && i < k){
            arr[i] = -1;
            sum += nums[i];
            i++;
        }
        for(int j = i;j < nums.length && j < i+k;j++){
            sum += nums[j];
        }
        int j = i;
        while(j < nums.length){
            if(j+k >= nums.length){
                break;
            }
            sum += nums[j+k];
            arr[j] = (int)(sum/(2*k+1));
            sum -= nums[j-k];
            j++;
        }
        while(j < nums.length){
            arr[j] = -1;
            j++;
        }
        return arr;
    }
}