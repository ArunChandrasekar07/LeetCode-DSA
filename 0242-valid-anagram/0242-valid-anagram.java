class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a=String.valueOf(ch1);
        String b=String.valueOf(ch2);
        if(a.equals(b)){
            return true;
        }
        else{
            return false;
        }
    }
}