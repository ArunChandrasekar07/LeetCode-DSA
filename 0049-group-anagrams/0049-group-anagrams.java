class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        String[] st=new String[strs.length];
        int k=0;
        for(String a:strs){
            char[] ch=a.toCharArray();
            Arrays.sort(ch);
            st[k++]=String.valueOf(ch);
        }
        for(int i=0;i<st.length;i++){
            List<String> ad=new ArrayList<>();
            ad.add(strs[i]);
            if(!hs.contains(i)){
            for(int j=0;j<st.length;j++){
                if(i!=j && !hs.contains(j)){
                    if(st[i].equals(st[j])){
                        ad.add(strs[j]);
                        hs.add(j);
                    }
                }
            }
            hs.add(i);
            ans.add(ad);
            }
        }
        return ans;
    }
}