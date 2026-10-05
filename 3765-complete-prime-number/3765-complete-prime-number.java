class Solution {
    public boolean isPrime(int temp){
        if(temp<2){
            return false;
        }
        for(int i=2;i*i<=temp;i++){
            if(temp%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean completePrime(int num) {
        if(!isPrime(num)){
            return false;
        }
        String s=String.valueOf(num);
        int j=0;
        while(j<s.length()){
            String tempp=s.substring(j);
            int temp=Integer.parseInt(tempp);
            if(!isPrime(temp)) return false;
            j++;
        }
        j=1;
        while(j<s.length()){
            String tempp=s.substring(0,j);
            int temp=Integer.parseInt(tempp);
            if(!isPrime(temp)) return false;
            j++;
        }
        return true;
    }
}