class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int arr[][] = new int[rowSum.length][colSum.length];
        for(int i =0;i<rowSum.length;i++){
            for(int j =0;j<colSum.length;j++){
                if(rowSum[i] > 0 && colSum[j] > 0){
                    int a = Math.min(rowSum[i],colSum[j]);
                    arr[i][j] = a;
                    rowSum[i] -= a;
                    colSum[j] -= a;
                }
            }
        }
        return arr;
    }
}