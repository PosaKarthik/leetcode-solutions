class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        index = haystack.indexOf(needle);
        if(index != -1){
            return index;
        }

        return -1;
    }
}