class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int total=0;
        for(int i=0;i<matrix.length;i++){
            total+=matrix[i].length;
        }
        int[] ans=new int[total];
        int l=0;
        for(int j=0;j<matrix.length;j++){
            for(int m=0;m<matrix[j].length;m++){
                ans[l++]=matrix[j][m];
            }
        }
        Arrays.sort(ans);
        return ans[k-1];
    }
}