class Solution {
    public int countRotations(String s, int k) {
        char[] let=s.toCharArray();
        int n=s.length();
        int ans=0;
        while(n!=0){
            int count=0;
            for(int i=0;i<s.length()-1;i++){
                if(let[i]==let[i+1]){
                    count++;
                }
            }
            if(count==k){
                ans++;
            }
            char temp=let[0];
            for(int j=1;j<s.length();j++){
                let[j-1]=let[j];
            }
            let[let.length-1]=temp;
            n--;
        }
        return ans;
    }
}