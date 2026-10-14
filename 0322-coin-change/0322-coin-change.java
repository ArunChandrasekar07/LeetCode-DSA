class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] df=new int[amount+1];
        for(int i=0;i<df.length;i++){
            df[i]=Integer.MAX_VALUE;
        }
        df[0]=0;
        for(int j=1;j<=amount;j++){
            for(int x:coins){
                if(x<=j){
                    if(df[j-x]!=Integer.MAX_VALUE){
                        df[j]=Math.min(df[j],df[j-x]+1);
                    }
                }
            }
        }
        if(df[amount]!=Integer.MAX_VALUE){
            return df[amount];
        }
        else{
            return -1;
        }
    }
}