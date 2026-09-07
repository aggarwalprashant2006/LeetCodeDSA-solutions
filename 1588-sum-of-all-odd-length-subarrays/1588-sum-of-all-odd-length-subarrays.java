class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            int count = 1;
            int sum1 = 0;
            for(int j = i;j<arr.length;j++){
                sum1 += arr[j];
                if(count%2 != 0){
                    sum += sum1;
                }
                count++;
            }
        }
        return sum;
    }
}