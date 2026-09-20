class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int dp[][] = new int[m][n];
        return lcs(m-1,n-1,word1,word2,dp);
    }
    public int lcs(int i,int j,String word1, String word2,int[][] dp) {
        if (i < 0) {
            return j + 1;
        }

        if (j < 0) {
            return i + 1;
        }
        if(dp[i][j] != 0) return dp[i][j];
        if(word1.charAt(i) == word2.charAt(j)) return dp[i][j] = lcs(i-1,j-1,word1,word2,dp);
        return dp[i][j] =  Math.min(Math.min(1+lcs(i-1,j-1,word1,word2,dp),1+lcs(i-1,j,word1,word2,dp)),1+lcs(i,j-1,word1,word2,dp));
    }
}