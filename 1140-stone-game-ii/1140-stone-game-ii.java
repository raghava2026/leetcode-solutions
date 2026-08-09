class Solution {

    int[][] dp;
    int[] suffix;
    int n;

    public int stoneGameII(int[] piles) {

        n = piles.length;

        dp = new int[n][n + 1];

        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

       
        suffix = new int[n];

        suffix[n - 1] = piles[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = piles[i] + suffix[i + 1];
        }

        return solve(0, 1);
    }

    int solve(int i, int M) {

        
        if (i >= n) {
            return 0;
        }

        
        if (dp[i][M] != -1) {
            return dp[i][M];
        }

        int best = 0;

        for (int X = 1; X <= 2 * M; X++) {

            if (i + X > n) {
                break;
            }

            int newM = Math.max(M, X);

            int opponent = solve(i + X, newM);

            int current = suffix[i] - opponent;

            best = Math.max(best, current);
        }

        return dp[i][M] = best;
    }
}