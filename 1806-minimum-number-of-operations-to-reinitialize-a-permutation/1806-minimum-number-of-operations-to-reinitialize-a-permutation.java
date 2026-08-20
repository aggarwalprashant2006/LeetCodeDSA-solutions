class Solution {
    public int reinitializePermutation(int n) {
        int count = 1;
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = i;
        }
        int k = 0;
        int count1 = 1;
        while(count1 != 0){
            count1 = 1;
            int arr1[] = new int[n];
            for(int i =0;i<n;i++){
                if(i%2 == 0){
                    arr1[i] = arr[i/2];
                }else{
                    arr1[i] = arr[n/2+(i-1)/2];
                }
            }
            for(int i =0;i<n;i++){
                if(arr1[i] != i){
                    count1++;
                }
                arr[i] = arr1[i];
            }
            if(count1 == 1){
                count1 = 0;
                break;
            }
            count++;
        }
        return count;
    }
}