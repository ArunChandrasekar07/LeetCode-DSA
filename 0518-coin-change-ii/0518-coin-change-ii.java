class Solution {
    public int change(int amount, int[] coins) {
        int[] dp=new int[amount+1];
        dp[0]=1;
        for(int x:coins){
            for(int j=1;j<=amount;j++){
                if(x<=j){
                    dp[j]=dp[j]+dp[j-x];
                }
            }
        }
        return dp[amount];
    }
}