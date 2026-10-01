class Solution {
    public String reverseVowels(String s) {

        HashSet<Character> hashSet = new HashSet<>(List.of('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'));

        char[] c = s.toCharArray();

        int i = 0;
        int j = c.length - 1;

        while (i < j) {
            while (i < j && !hashSet.contains(c[i])) {
                i++;
            }
            while (i < j && !hashSet.contains(c[j])) {
                j--;
            }

            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;

            i++;
            j--;

        }

        return String.valueOf(c);
    }
}