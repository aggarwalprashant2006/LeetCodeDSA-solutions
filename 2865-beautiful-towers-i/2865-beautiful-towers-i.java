class Solution {
    public long maximumSumOfHeights(int[] heights) {
        long max = 0;

        for (int a = 0; a < heights.length; a++) {
            int min = heights[a];
            long sum = 0;

            for (int i = a - 1; i >= 0; i--) {
                if (heights[i] <= min) {
                    sum += heights[i];
                    min = heights[i];
                } else {
                    sum += min;
                }
            }

            min = heights[a];
            long sum1 = 0;
            for (int i = a; i < heights.length; i++) {
                if (heights[i] <= min) {
                    sum1 += heights[i];
                    min = heights[i];
                } else {
                    sum1 += min;
                }
            }

            max = Math.max(max, sum + sum1);
        }

        return max;
    }
}