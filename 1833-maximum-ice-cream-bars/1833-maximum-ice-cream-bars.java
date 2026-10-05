class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i=0;
        int add=0;
        for(i=0;i<costs.length;i++){
            add+=costs[i];
            if(add>coins){
                return i;
            }
        }
        return i;
    }
}