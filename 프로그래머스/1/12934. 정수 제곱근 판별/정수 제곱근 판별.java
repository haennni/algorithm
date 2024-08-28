class Solution {
    public long solution(long n) {
        long sqrt = (long)Math.sqrt(n);

        if (n == (sqrt * sqrt)) {
            return (sqrt + 1) * (sqrt + 1);
        }
        return -1;

    }
}