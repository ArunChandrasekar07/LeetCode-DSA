class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mer[]=new int[nums1.length+nums2.length];
        int k=0;
        double ans=0;
        for(int i=0;i<nums1.length;i++){
            mer[k++]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            mer[k++]=nums2[j];
        }
        Arrays.sort(mer);
        if(mer.length%2==0){
            ans=((mer[(mer.length/2)-1])+(mer[mer.length/2]))/2.0;
        }
        else{
            ans=mer[mer.length/2];
        }
        return ans;
    }
}