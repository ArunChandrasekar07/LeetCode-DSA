class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int nextgrt=-1;
            int sub1=nums1[i];
            for(int j=0;j<nums2.length;j++){
                if(sub1==nums2[j]){
                    j++;
                    while(j<nums2.length){
                        if(sub1<nums2[j]){
                            nextgrt=nums2[j];
                            break;
                        }
                        j++;
                    }
                    ans[i]=nextgrt;
                }
            }
        }
        return ans;
    }
}