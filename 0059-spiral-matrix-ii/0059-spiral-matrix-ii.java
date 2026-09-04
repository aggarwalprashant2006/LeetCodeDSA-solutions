class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];
        int a = n;
        int b = n;
        int k = 1;
        int count = 0;
        int c = 0;
        int count1 = 0;
        while(k <= n*n){
            int i =n-b;
            int j = n-a;
            count++;
            while(j < a){
                arr[i][j] = k;
                if(k == n*n){
                    count1++;
                    break;
                }
                k++;
                j++;
            }
            if(count1 != 0){
                break;
            }
            i += 1;
            while(i < b){
                arr[i][a-1] = k;
                if(k == n*n){
                    count1++;
                    break;
                }
                k++;
                i++;
            }
            if(count1 != 0){
                break;
            }
            j =a-2;
            while(j >= n-a){
                arr[b-1][j] = k;
                if(k == n*n){
                    count1++;
                    break;
                }
                k++;
                j--;
            }
            if(count1 != 0){
                break;
            }
            i = b-2;
            while(i > n-a){
                arr[i][c] = k;
                if(k == n*n){
                    count1++;
                    break;
                }
                k++;
                i--;
            }
            if(count1 != 0){
                break;
            }
            c++;
            a--;
            b--;
            
        }
        return arr;
    }
}