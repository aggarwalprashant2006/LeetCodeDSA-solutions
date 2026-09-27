class Solution {
    public int longestMountain(int[] arr) {
        int dp1[] = new int[arr.length];
        int dp2[] = new int[arr.length];
        Arrays.fill(dp1,1);
        Arrays.fill(dp2,1);
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){
                dp1[i] += dp1[i-1];
            }
        }
        for(int i = arr.length-2;i >= 0;i--){
            if(arr[i] > arr[i+1]){
                dp2[i] += dp2[i+1];
            }
        }
        int max1 = 0;
        for(int i =0;i<dp1.length;i++){
           if (dp1[i] > 1 && dp2[i] > 1) {
                max1 = Math.max(max1, dp1[i] + dp2[i] - 1);
            }
        }
        return max1;
    }
}