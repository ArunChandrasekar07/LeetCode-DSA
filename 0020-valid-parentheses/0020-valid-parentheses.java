class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char a=st.pop();
                if((a=='(' && c!=')') || (a=='{' && c!='}') || (a=='[' && c!=']')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}

/*
class Solution {
    public boolean isValid(String s) {
        Stack<String> st=new Stack<>();
        Boolean ans=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                String aa=Character.toString(s.charAt(i));
                st.push(aa);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                String a=st.pop();
                String bb=Character.toString(s.charAt(i));
                if(a.equals("(") && bb.equals(")")){
                    ans=true;
                }
                else if(a.equals("[") && bb.equals("]")){
                    ans=true;
                }
                else if(a.equals("{") && bb.equals("}")){
                    ans=true;
                }
                else{
                    ans=false;
                    break;
                }
            }
        }
        if(st.size()!=0){
            return false;
        }
        return ans;
    }
}
*/