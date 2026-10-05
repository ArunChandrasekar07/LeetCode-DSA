class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N<0){
            N=-N;
        }
        double ans=1;
        while(N!=0){
            if(N%2==1){
                ans*=x;
            }
            x*=x;
            N/=2;
        }
        return n < 0 ? 1.0 / ans : ans;
    }
}
