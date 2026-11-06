class Solution {
    public int lengthOfLastWord(String s) {
        // String[] s1 = s.trim().split(" ");
        // return s1[s1.length-1].length();
        int answer = 0;
        String s1 = s.trim();

        for(int i=s1.length()-1;i>=0;i--){
            if(s1.charAt(i) != ' '){
                answer++;
            }else{
                break;
            }
        }

        return answer;
    }
}