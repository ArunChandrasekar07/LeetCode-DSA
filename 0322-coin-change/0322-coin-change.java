class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] df=new int[amount+1];
        for(int j=0;j<df.length;j++){
            df[j]=Integer.MAX_VALUE;
        }
        df[0]=0;
        for(int i=1;i<=amount;i++){
            for(int x:coins){
                if(x<=i){
                    if(df[i-x]!=Integer.MAX_VALUE){
                        df[i]=Math.min(df[i], df[i-x]+1);
                    }
                }
            }
        }
        if(df[amount]==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return df[amount];
        }
    }
}