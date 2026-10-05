class Solution {
    public int countCommas(int n) {
        int ans=0;
        if(n>=1000){
            ans+=(n-1000+1);
        }
        else if(n>=1000000){
            ans+=(n-1000000+1);
        }
        else if(n>=1000000000){
            ans+=(n-100000000+1);
        }
        return ans;
    }
}

/* class Solution {
    public int countCommas(int n) {
        if(n<1000)
        return 0;
        int ans=0;
        for(int i=1000;i<=n;i++){
            ans+=((Integer.toString(i).length()-1)/3);
        }
        return ans;
    }
} */