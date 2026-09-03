class Solution {
    public int countTriplets(int[] arr) {
        int count = 0;
        for(int i =0;i<arr.length;i++){
            int a = 0;
            for(int j = i+1;j<arr.length;j++){
                int b = 0;
                a = a^arr[j-1];
                for(int k = j;k<arr.length;k++){
                    b = b ^ arr[k];
                    if(a == b){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}