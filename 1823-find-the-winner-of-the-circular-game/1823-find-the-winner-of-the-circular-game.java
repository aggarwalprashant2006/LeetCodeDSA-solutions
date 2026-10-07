class Solution {
    public int findTheWinner(int n, int k) {
        if(n == 1) return 1;
        int arr[] = new int[n+1];
        for(int i =1;i<=n;i++){
            arr[i] = i;
        }
        int count = 0;
            int count1 = 0;
            for(int i = 1;i<=n;i++){
                if(arr[i] != -1){
                    count1++;
                }if(count1 == k){
                    arr[i] = -1;
                    count1 = 0;
                    count++;
                }if(i == n){
                    i = 0;
                }if(count == n-1){
                    break;
                }
            }
            for(int i = 1;i<arr.length;i++){
                if(arr[i] != -1){
                    return arr[i];
                }
            }
            return -1;
    }
}