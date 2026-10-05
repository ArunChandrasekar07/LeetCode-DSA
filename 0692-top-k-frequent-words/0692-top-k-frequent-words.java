class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> hm=new HashMap<>();
        List<String> li=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String temp=words[i];
            int count=0;
            for(int j=0;j<words.length;j++){
                if(temp.equals(words[j])){
                    count++;
                }
            }
            hm.put(temp,count);
        }
        while(k!=0){
            int max=0;
            String ans="";
            for(String s:hm.keySet()){
                if(hm.get(s)>max || hm.get(s)==max && s.compareTo(ans)<0){
                    ans=s;
                    max=hm.get(s);
                }
            }
            li.add(ans);
            hm.remove(ans);
            k--;
        }
        return li;
    }
}