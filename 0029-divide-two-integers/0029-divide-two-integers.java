class Solution {
    public int divide(int dividend, int divisor) {
        int a = dividend;
        int b = divisor;

        long dividend1 = dividend;
        long divisor1 = divisor;

        if (dividend1 < 0) {
            dividend1 = 0 - dividend1;
        }
        if (divisor1 < 0) {
            divisor1 = 0 - divisor1;
        }
        long count = 0;
         while (dividend1 >= divisor1) {
            long temp = divisor1;
            long times = 1;

            while (temp + temp <= dividend1) {
                temp += temp;
                times += times;
            }

            count += times;
            dividend1 -= temp;
        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            count = 0 - count;
        }

        if (count > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int) count;
    }
}