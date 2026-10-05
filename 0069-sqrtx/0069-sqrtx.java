class Solution {
    public int mySqrt(int x) {
        long mul=0;
        long l=0;
        long r=x;
        while(l<=r){
            long mid=(l+r)/2;
            mul=mid*mid;
            if(mul==x){
                return (int)mid;
            }
            else if(mul>x){
                r=mid-1;
            }
            else if(mul<x){
                l=mid+1;
            }
        }
        return (int)r;
    }
}

/* class Solution {
    public int mySqrt(int x) {
        long i = 0;
        while (true) {
            if ((i * i) > x) {
                return (int)i - 1;
            }
            i++;
        }
    }
} */