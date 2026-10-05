class Solution {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            if(!hm.containsKey(tasks[i])){
                hm.put(tasks[i],1);
            }
            else{
                hm.put(tasks[i],hm.get(tasks[i])+1);
            }
        }
        int max=0;
        for(char x:hm.keySet()){
            if(hm.get(x)>max){
                max=hm.get(x);
            }
        }
        int count=0;
        for(char y:hm.keySet()){
            if(max==hm.get(y)){
                count++;
            }
        }
        count--;
        int ans=((max-1)*n+max+count);
        if(ans<tasks.length){
            return tasks.length;
        }
        else{
            return ans;
        }
    }
}