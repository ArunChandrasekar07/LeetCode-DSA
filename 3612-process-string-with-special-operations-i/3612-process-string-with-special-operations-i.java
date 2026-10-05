class Solution {
    public String processStr(String s) {
        StringBuilder st=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ss=s.charAt(i);
            switch(ss){
            case '*':
            if(st.length() > 0){
               st.deleteCharAt(st.length()-1);
            }
            break;
            case '#':
            st.append(st);
            break;
            case '%':
            st.reverse();
            break;
            default:
            st.append(ss);
            break;
            }
        }
        return st.toString();
    }
}