class Solution {
    public int superEggDrop(int k, int n) {
        int dp[] = new int[k + 1], m = 0;
        for (m = 0; dp[k] < n; ++m)
            for (int i = k; i > 0; --i)
                dp[i] += dp[i - 1] + 1;
        return m;
    }
}
