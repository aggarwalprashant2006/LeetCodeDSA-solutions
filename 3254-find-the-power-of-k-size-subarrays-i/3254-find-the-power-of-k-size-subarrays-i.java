class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int arr[]= new int[nums.length-k+1];
        int a =0;
        for(int i = 0;i<nums.length-k+1;i++){
            int max = 0;
            int count = 0;
            for(int j = i;j<i+k-1;j++){
                if(nums[j]+1 != nums[j+1]){
                    count++;
                    break;
                }
            }
            if(count == 0){
                arr[a] = nums[i+k-1];
            }else{
                arr[a] = -1;
            }
            a++;
        }
        return arr;
    }
}