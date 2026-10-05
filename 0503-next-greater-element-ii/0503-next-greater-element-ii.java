class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
           while(!st.isEmpty() && nums[i%n]>=st.peek()){
            st.pop();
           }
           if(i<n){
            ans[i]=st.isEmpty()? -1: st.peek();
           }
           st.push(nums[i%n]);
        }
        return ans;
    }
}

/* class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr=new int[nums.length*2];
        int k=0;
        for(int x:nums){
            arr[k++]=x;
        }
        for(int x:nums){
            arr[k++]=x;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    nums[i]=arr[j];
                    break;
                }
                else{
                    nums[i]=-1;
                }
            }
        }
        return nums;
    }
} */