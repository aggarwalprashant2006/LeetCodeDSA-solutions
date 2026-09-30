class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int m =s1.length();
        int n = s2.length();
        int dp[][] = new int[m][n];
        for(int i =0;i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return lcs(m-1,n-1,s1,s2,dp);
    }
    public int lcs(int i ,int j ,String s1,String s2,int[][] dp) {
        if(i < 0 ){
            int sum = 0;
            for(int k = 0;k<=j;k++){
                sum += (int)s2.charAt(k);
            }
            return sum;
        }
        if(j < 0 ){
            int sum = 0;
            for(int k = 0;k<=i;k++){
                sum += (int)s1.charAt(k);
            }
            return sum;
        }
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] = lcs(i-1,j-1,s1,s2,dp);
        return dp[i][j] = Math.min((int)s1.charAt(i)+lcs(i-1,j,s1,s2,dp),(int)s2.charAt(j)+lcs(i,j-1,s1,s2,dp));
    }
}