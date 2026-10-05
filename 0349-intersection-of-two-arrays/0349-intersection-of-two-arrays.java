class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1=new HashSet<>();
        for(int num:nums1){
            hs1.add(num);
        }
        HashSet<Integer> hs2=new HashSet<>();
        for(int x:nums2){
            if(hs1.contains(x)){
                hs2.add(x);
            }
        }
        int ans[]=new int[hs2.size()];
        int k=0;
        for(int y:hs2){
            ans[k++]=y;
        }
        return ans;
    }
}

/* class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            if(!hs.contains(nums1[i])){
                int l=0;
                int r=nums2.length-1;
                int mid=0;
                while(l<=r){
                    mid=(l+r)/2;
                    if(nums1[i]<nums2[mid]){
                        r=mid-1;
                    }
                    else if(nums1[i]>nums2[mid]){
                        l=mid+1;
                    }
                    else{
                        hs.add(nums1[i]);
                        break;
                    }
                }
            }
        }
        int[] ans=new int[hs.size()];
        int k=0;
        for(int num:hs){
            ans[k++]=num;
        }
        return ans;
    }
} */