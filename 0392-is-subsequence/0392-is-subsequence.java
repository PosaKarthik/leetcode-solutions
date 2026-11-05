class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int count = 0;
        int length = s.length();
        int j = 0;

        while (i < length && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {

               i++;
               j++;
               count++;
            }else{
            j++;
            }

        }

        if (count == length) {
            return true;
        }

        return false;

    }
}