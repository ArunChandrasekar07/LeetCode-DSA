class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int ans=0;
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while(pq.size()!=0){
            int fir=pq.poll();
            if(pq.size()==0){
                return fir;
            }
            int sec=pq.poll();
            ans=fir-sec;
            if(ans!=0){
                pq.add(ans);
            }
        }
        return ans;
    }
}