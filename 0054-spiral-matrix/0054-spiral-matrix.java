import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int a = 0;
        int b = 0;

        List<Integer> lst = new ArrayList<>();

        while (a < m && b < n) {

            int i = a;
            int j = b;
            while (j < n) {
                lst.add(matrix[i][j]);
                j++;
            }

            i = a + 1;
            while (i < m) {
                lst.add(matrix[i][n - 1]);
                i++;
            }
            if (a < m - 1) {
                j = n - 2;
                while (j >= b) {
                    lst.add(matrix[m - 1][j]);
                    j--;
                }
            }
            if (b < n - 1) {
                i = m - 2;
                while (i > a) {
                    lst.add(matrix[i][b]);
                    i--;
                }
            }

            a++;
            b++;
            m--;
            n--;
        }

        return lst;
    }
}