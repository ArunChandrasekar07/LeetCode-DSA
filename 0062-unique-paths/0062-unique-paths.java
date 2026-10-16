class Solution {
    public static int ans(int[][] dp,int m,int n){
        if(m==1 || n==1){
            return 1;
        }
        if(dp[m][n]!=0){
            return dp[m][n];
        }
        int result=ans(dp,m-1,n)+ans(dp,m,n-1);
        dp[m][n]=result;
        return result;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m+1][n+1];
        return ans(dp,m,n);
    }
}