class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        String str = lcs(str1, str2);
        int i = 0;
        int j = 0;
        int k = 0;
        StringBuilder sb1 = new StringBuilder();
        while (k < str.length()) {
            while (str1.charAt(i) != str.charAt(k)) {
                sb1.append(str1.charAt(i));
                i++;
            }
            while (str2.charAt(j) != str.charAt(k)) {
                sb1.append(str2.charAt(j));
                j++;
            }
            sb1.append(str.charAt(k));

            i++;
            j++;
            k++;
        }
        while (i < str1.length()) {
            sb1.append(str1.charAt(i));
            i++;
        }
        while (j < str2.length()) {
            sb1.append(str2.charAt(j));
            j++;
        }
    return sb1.toString();
    }

    public String lcs(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(
                        dp[i - 1][j],
                        dp[i][j - 1]
                    );
                }
            }
        }
        int i = m;
        int j = n;
        StringBuilder sb = new StringBuilder();

        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                sb.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return sb.reverse().toString();
    }
}