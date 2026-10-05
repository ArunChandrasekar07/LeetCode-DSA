class Solution {
    public int minOperations(String s1, String s2) {
        int ans=0;
        int n=s1.length();
        char[] one=s1.toCharArray();

if(n==1){
    if(s1.charAt(0)==s2.charAt(0)){
        return 0;
    }
    if(s1.charAt(0)=='0' && s2.charAt(0)=='1'){
        return 1;
    }
    return -1;
}

        boolean changed=false;

        for(int i=0;i<n;i++){

            if(changed){
                one[i]='0';
                changed=false;
            }

            if(one[i]==s2.charAt(i)){
                continue;
            }

            if(one[i]=='0'){
                one[i]='1';
                ans++;
            }
            else{
                if(i<n-1){
                    if(one[i+1]=='1'){
                        ans++;
                    }
                    else{
                        ans+=2;
                    }

                    one[i]='0';
                    one[i+1]='0';
                    changed=true;
                }
                else{
                    ans+=2;
                }
            }
        }

        return ans;
    }
}