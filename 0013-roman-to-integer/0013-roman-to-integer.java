class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int cur=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I':
                cur=1;
                break;
                case 'V':
                cur=5;
                break;
                case 'X':
                cur=10;
                break;
                case 'L':
                cur=50;
                break;
                case 'C':
                cur=100;
                break;
                case 'D':
                cur=500;
                break;
                case 'M':
                cur=1000;
                break;
                default:
                break;
            }
            if(cur<prev){
                ans-=cur;
            }
            else{
                ans+=cur;
            }
            prev=cur;
        }
        return ans;
    }
}






/*class Solution {
    public int romanToInt(String s) {
        int[] num={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] val={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int size=s.length();
        int ans=0;
        for(int i=0;i<num.length;i++){
            while(val[i].equals(s.substring(size-1))){
                size--;
                s=s.substring(size-1);
                if(ans>num[i]){
                    ans-=num[i];
                }
                else{
                    ans+=num[i];
                }
            }
            if(i==num.length){
                i=0;
            }
        }
        return ans;
    }
} */