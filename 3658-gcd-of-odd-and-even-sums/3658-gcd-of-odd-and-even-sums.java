class Solution {
    public int gcdOfOddEvenSums(int n) {
        int e=2;
        int o=1;
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            even+=e;
            odd+=o;
            e+=2;
            o+=2;
        }
        while(even!=0){
            int temp=even;
            even=odd%even;
            odd=temp;
        }
        return odd;
    }
}