class Solution {
    public boolean dfs(List<Integer>[] graphs,boolean[] check,int current,int target){
        if(current==target){
            return true;
        }
        check[current]=true;
        for(int n:graphs[current]){
            if(!check[n]){
                if(dfs(graphs,check,n,target)){
                    return true;
                }
            }
        }
        return false;
    }
    public int[] findRedundantConnection(int[][] edges) {
        List<Integer>[] graphs=new ArrayList[edges.length+1];
        for(int i=1;i<graphs.length;i++){
            graphs[i]=new ArrayList<>();
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            boolean[] check=new boolean[edges.length+1];
            if(dfs(graphs,check,u,v)){
                return edge;
            }
            graphs[u].add(v);
            graphs[v].add(u);

        }
        return new int[0];
    }
}