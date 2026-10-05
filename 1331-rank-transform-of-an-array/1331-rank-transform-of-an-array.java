class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] temp=new int[arr.length];
        int k=0;
        for(int x:arr){
            temp[k++]=x;
        }
        Arrays.sort(temp);
        int rank=1;
        for(int i=0;i<temp.length;i++){
            hm.put(temp[i],rank);
            if(i!=temp.length-1 && temp[i]!=temp[i+1]){
                rank++;
            }
        }
        for(int j=0;j<arr.length;j++){
            arr[j]=hm.get(arr[j]);
        }
        return arr;
    }
}