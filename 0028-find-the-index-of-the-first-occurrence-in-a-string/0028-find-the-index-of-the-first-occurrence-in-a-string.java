class Solution {
    public int strStr(String haystack, String needle) {

        int start = 0;
        int k = 0;
        int length = needle.length();

        while (start <= haystack.length() - length) {
           k = 0;
           while(k<length){
                if(haystack.charAt(start+k) == needle.charAt(k)){
                    k++;
                }else{
                    break;
                }
           }
           if (k == length){
            return start;
           }
           start++;
        }

        return -1;
    }
}