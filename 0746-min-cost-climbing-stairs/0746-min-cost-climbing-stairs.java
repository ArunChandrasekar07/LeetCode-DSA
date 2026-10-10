class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int ans=0;
        int prev1=cost[0];
        int prev2=cost[1];
        for(int i=2;i<cost.length;i++){
            ans=Math.min(prev1+cost[i],prev2+cost[i]);
            prev1=prev2;
            prev2=ans;
        }
        if(prev1<prev2){
            return prev1;
        }
        else{
            return prev2;
        }
    }
}