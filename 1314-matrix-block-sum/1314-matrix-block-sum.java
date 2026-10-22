class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int arr[][] = new int[mat.length][mat[0].length];
        for(int i =0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                int c = i-k;
                int sum = 0;
                while(c < mat.length && c <= i+k){
                    if(c >= 0){
                        int d = j-k;
                        while(d < mat[0].length && d <= j+k){
                            if(d >= 0){
                                sum += mat[c][d];
                            }
                            d++;
                        }
                    }
                    c++;
                }
                arr[i][j] = sum;
            }
        }
        return arr;
    }
}