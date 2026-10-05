class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                }
                else{
                    mat[i][j]=-1;
                }
            }
        }
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int x=cur[0];
            int y=cur[1];
            if(x+1<r && mat[x+1][y]==-1){
                mat[x+1][y]=mat[x][y]+1;
                q.offer(new int[]{x+1,y});
            }
            if(x-1>=0 && mat[x-1][y]==-1){
                mat[x-1][y]=mat[x][y]+1;
                q.offer(new int[]{x-1,y});
            }
            if(y+1<c && mat[x][y+1]==-1){
                mat[x][y+1]=mat[x][y]+1;
                q.offer(new int[]{x,y+1});
            }
            if(y-1>=0 && mat[x][y-1]==-1){
                mat[x][y-1]=mat[x][y]+1;
                q.offer(new int[]{x,y-1});
            }
        }
        return mat;
    }
}