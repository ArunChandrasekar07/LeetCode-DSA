class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int ans = 0;

        boolean negative = (dividend < 0) != (divisor < 0);

        long one = Math.abs((long) dividend);
        long two = Math.abs((long) divisor);

        while (one >= two) {

            long n = two;
            int count = 1;

            while (one >= n + n) {
                n += n;
                count += count;
            }

            one -= n;
            ans += count;
        }

        if (negative) {
            return -ans;
        }

        return ans;
    }
}