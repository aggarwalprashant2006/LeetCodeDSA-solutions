class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m][n];
        int a = word1.length()+word2.length();
        int b = lcs(m-1,n-1,word1,word2,dp);
        return a-(b*2);
    }
    public int lcs(int i ,int j , String word1,String word2,int[][] dp){
        if(i < 0 || j < 0){
            return 0;
        }
        if(dp[i][j] != 0) return dp[i][j];
        else if(word1.charAt(i) == word2.charAt(j)) return dp[i][j] = 1+lcs(i-1,j-1,word1,word2,dp);
        return dp[i][j] = Math.max(lcs(i-1,j,word1,word2,dp),lcs(i,j-1,word1,word2,dp));
    }
}