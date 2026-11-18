class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet = new HashSet<>();

        int i=0;
        int j =0;
        int count = 0;
        int longestSubstring = 0;
        while(i<s.length()){
            if(!hashSet.contains(s.charAt(i))){
                hashSet.add(s.charAt(i));
                count++;
                longestSubstring = Math.max(longestSubstring,count);
                i++;
            }else{
                count=0;
               hashSet.clear();
               j++;
               i=j;
              
              
            }
        }
        return longestSubstring;
        
    }
}