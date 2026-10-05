class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        HashMap<Integer,Long> hm=new HashMap<>();
        long curday=0;
        for(int i=0;i<tasks.length;i++){
            if(!hm.containsKey(tasks[i])){
                hm.put(tasks[i],curday);
                curday++;
            }
            else{
                long reqday=hm.get(tasks[i])+space+1;
                if(curday<reqday){
                    curday=reqday;
                }
                hm.put(tasks[i],curday);
                curday++;
            }
        }
        return curday;
    }
}