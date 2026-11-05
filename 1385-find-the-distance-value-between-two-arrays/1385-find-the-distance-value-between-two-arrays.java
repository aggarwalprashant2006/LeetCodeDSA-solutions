class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count1 =0;
        for(int i =0;i<arr1.length;i++){
            int count =0;
            for(int j = 0;j<arr2.length;j++){
                int a = arr1[i] - arr2[j];
                int b = Math.abs(a);
                if(b <= d){
                    count++;
                }
            }
            if(count == 0){
                count1++;
            }
        }
        return count1;
    }
}