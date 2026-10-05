class Solution {
    public void dfs(int[][] image, int sr, int sc, int color,int org){
        int rows=image.length;
        int columns=image[0].length;
        if(sr<rows && sr>=0 && sc<columns && sc>=0 && image[sr][sc]==org){
            image[sr][sc]=color;
            dfs(image,sr+1,sc,color,org);
            dfs(image,sr-1,sc,color,org);
            dfs(image,sr,sc+1,color,org);
            dfs(image,sr,sc-1,color,org);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int org=image[sr][sc];
        if (org==color) {
            return image;
        }
        dfs(image,sr,sc,color,org);
        return image;
    }
}