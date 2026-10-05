class Solution {
    public String frequencySort(String s) {
        int len=0;
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String ss = new String(arr);
        char cur=ss.charAt(0);
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=1;i<ss.length();i++){
            if(cur==ss.charAt(i)){
                len++;
            }
            else{
                len++;
                hm.put(cur,len);
                len=0;
                cur=ss.charAt(i);
            }
        }
        len++;
        hm.put(cur,len);
        char cc=' ';
        StringBuilder sb=new StringBuilder();
        while(hm.size()!=0){
            int max=0;
            for(char trav: hm.keySet()){
               if(hm.get(trav)>max){
                   max=hm.get(trav);
                   cc=trav;
                }
            }
            while(max!=0){
                sb.append(cc);
                max--;
            }
            hm.remove(cc);
        }
        return sb.toString();
    }
}