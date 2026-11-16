class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int i = 1; i < n; i++) {
            // System.out.println(i);
            if (n % i == 0) {
                //  System.out.println(i);
                String pattern = s.substring(0, i);
                String repeated = pattern.repeat(n / i);

                if (s.equals(repeated)) {

                    return true;
                }

            }
        }

        return false;

    }
}