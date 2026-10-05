class Solution {
    public int heightChecker(int[] heights) {
        /* int[] check = heights.clone(); copy array without loop */
        int[] check=new int[heights.length];
        int o=0;
        for(int i=0;i<heights.length;i++){
            check[o++]=heights[i];
        }
        Arrays.sort(check);
        int count=0;
        for(int j=0;j<check.length;j++){
            if(check[j]!=heights[j]){
                count++;
            }
        }
        return count;
    }
}