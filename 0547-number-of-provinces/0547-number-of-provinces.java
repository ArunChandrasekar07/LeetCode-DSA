class Solution {
    public void dfs(int[][] isConnected,boolean[] check,int i){
        check[i]=true;
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[i][j]==1 && !check[j]){
                dfs(isConnected,check,j);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        boolean[] check=new boolean[isConnected.length];
        int ans=0;
        for(int i=0;i<isConnected.length;i++){
            if(!check[i]){
                ans++;
                dfs(isConnected,check,i);
            }
        }
        return ans;
    }
}