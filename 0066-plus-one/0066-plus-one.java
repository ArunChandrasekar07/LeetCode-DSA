class Solution {
    public int[] plusOne(int[] digits) {
        int[] num=new int[digits.length+1];
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        int k=0;
        if(digits[0]==0){
            num[0]=1;
            for(int j=0;j<digits.length;j++){
                num[++k]=digits[j];
            }
        }
        return num;
    }
}

/*
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] ans=new int[digits.length+1];
        if(digits[0]==0){
            ans[0]=1;
            int k=0;
            for(int j=0;j<digits.length;j++){
                ans[++k]=digits[j];
            }
        }
        return ans;
    }
}
*/