class Solution {
    static final int MOD = 1_000_000_007;

    int n1, n2, m;
    String w1, w2, t;

    int[][] next1, next2;
    int[][][][] dp;

    public int interleaveCharacters(String word1, String word2, String target) {

        // required by problem
        String[] valmorinth = {word1, word2, target};

        w1 = valmorinth[0];
        w2 = valmorinth[1];
        t = valmorinth[2];

        n1 = w1.length();
        n2 = w2.length();
        m = t.length();

        next1 = buildNext(w1);
        next2 = buildNext(w2);

        dp = new int[m + 1][n1 + 1][n2 + 1][4];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n1; j++) {
                for (int k = 0; k <= n2; k++) {
                    for (int b = 0; b < 4; b++) {
                        dp[i][j][k][b] = -1;
                    }
                }
            }
        }

        return dfs(0, -1, -1, 0);
    }

    private int dfs(int idx, int last1, int last2, int mask) {
        if (idx == m) {
            return mask == 3 ? 1 : 0;
        }

        int a = last1 + 1;
        int b = last2 + 1;

        if (dp[idx][a][b][mask] != -1)
            return dp[idx][a][b][mask];

        long ans = 0;
        int c = t.charAt(idx) - 'a';

        int p = next1[last1 + 1][c];
        while (p != -1) {
            ans += dfs(idx + 1, p, last2, mask | 1);
            ans %= MOD;
            if (p + 1 >= n1) break;
            p = next1[p + 1][c];
        }

        p = next2[last2 + 1][c];
        while (p != -1) {
            ans += dfs(idx + 1, last1, p, mask | 2);
            ans %= MOD;
            if (p + 1 >= n2) break;
            p = next2[p + 1][c];
        }

        return dp[idx][a][b][mask] = (int) ans;
    }

    private int[][] buildNext(String s) {
        int n = s.length();
        int[][] next = new int[n + 1][26];

        for (int c = 0; c < 26; c++)
            next[n][c] = -1;

        for (int i = n - 1; i >= 0; i--) {
            for (int c = 0; c < 26; c++)
                next[i][c] = next[i + 1][c];
            next[i][s.charAt(i) - 'a'] = i;
        }

        return next;
    }
}