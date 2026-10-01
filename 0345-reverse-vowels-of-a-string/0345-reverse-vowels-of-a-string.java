class Solution {
    public String reverseVowels(String s) {

        char[] c = s.toCharArray();

        int i = 0;
        int j = c.length - 1;

        while (i < j) {
            while (i<j && c[i] != 'a' && c[i] != 'A' && c[i] != 'e' && c[i] != 'E' && c[i] != 'i' && c[i] != 'I' && c[i] != 'o'
                    && c[i] != 'O' && c[i] != 'u' && c[i] != 'U') {
                i++;
            }
            while (i<j && c[j] != 'a' && c[j] != 'A' && c[j] != 'e' && c[j] != 'E' && c[j] != 'i' && c[j] != 'I' && c[j] != 'o'
                    && c[j] != 'O' && c[j] != 'u' && c[j] != 'U') {
                j--;
            }

            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;

            i++;
            j--;

        }

        System.out.println(Arrays.toString(c));

        return String.valueOf(c);
    }
}