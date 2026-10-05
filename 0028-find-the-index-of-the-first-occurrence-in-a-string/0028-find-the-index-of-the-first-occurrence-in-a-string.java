class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        while(true){
            while(!haystack.substring(i).startsWith(needle)){
                i++;
                if(needle.length()>haystack.substring(i).length()){
                    return -1;
                }
            }
            break;
        }
        return i;
    }
}

/*
for (int j = 0; j < needle.length(); j++) {
    if (haystack.charAt(i + j) != needle.charAt(j)) {
        return false;
    }
}
return true;
*/