class Solution {
    public int strStr(String haystack, String needle) {

        int start = 0;
        int k=0;
        int length = needle.length();


        while(start <= haystack.length()-length){
            if(haystack.charAt(start+k) == needle.charAt(k)){
                    k++;
                  
            }else{
                k=0;
                  start++;
            }
             if(k == length){
                return start;
            }
            

        }
       
        
        return -1;
    }
}