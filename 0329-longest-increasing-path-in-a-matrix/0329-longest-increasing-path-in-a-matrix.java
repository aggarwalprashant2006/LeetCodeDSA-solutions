class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int max = 1;
        int m = matrix.length;
        int n = matrix[0].length;
        int dp[][] = new int[m][n];
        for(int i =0;i<dp.length;i++){
            for(int j =0;j<dp[0].length;j++){
                max = Math.max(max,lip(i,j,matrix,dp));
            }
        }
        return max;
    }
    public int lip(int i ,int j ,int[][] matrix,int[][] dp){
        if(dp[i][j] != 0){
            return dp[i][j];
        }
        int max1 = 0;
        if(j-1 >= 0 && matrix[i][j] > matrix[i][j-1]){
            max1= Math.max(max1,lip(i ,j-1 ,matrix,dp));
        }
        if(i-1 >= 0 && matrix[i][j] > matrix[i-1][j]){
            max1= Math.max(max1,lip(i-1 ,j ,matrix,dp));
        }
        if(j+1 < matrix[0].length && matrix[i][j] > matrix[i][j+1]){
            max1= Math.max(max1,lip(i ,j+1 ,matrix,dp));
        }
        if(i+1 < matrix.length && matrix[i][j] > matrix[i+1][j]){
            max1= Math.max(max1,lip(i+1 ,j,matrix,dp));
        }
        return dp[i][j] = 1+max1;
    }
}