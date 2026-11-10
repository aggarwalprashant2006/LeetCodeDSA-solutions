class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int arr[][] = new int[rows * cols][2];
        int i = 0;
        int j = rStart;
        int k = cStart;
        int count = 1;
        arr[i][0] = j;
        arr[i][1] = k;
        i++;
        while (i < rows * cols) {
            for (int x = 0; x < count; x++) {
                k++;

                if (j >= 0 && j < rows && k >= 0 && k < cols) {
                    arr[i][0] = j;
                    arr[i][1] = k;
                    i++;
                }
            }
            for (int x = 0; x < count; x++) {
                j++;

                if (j >= 0 && j < rows && k >= 0 && k < cols) {
                    arr[i][0] = j;
                    arr[i][1] = k;
                    i++;
                }
            }

            count++;
            for (int x = 0; x < count; x++) {
                k--;

                if (j >= 0 && j < rows && k >= 0 && k < cols) {
                    arr[i][0] = j;
                    arr[i][1] = k;
                    i++;
                }
            }
            for (int x = 0; x < count; x++) {
                j--;

                if (j >= 0 && j < rows && k >= 0 && k < cols) {
                    arr[i][0] = j;
                    arr[i][1] = k;
                    i++;
                }
            }

            count++;
        }

        return arr;
    }
}