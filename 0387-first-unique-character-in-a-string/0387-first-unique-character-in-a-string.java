class Solution {
    public int firstUniqChar(String s) {

        HashMap<Character,Integer> hashMap=new HashMap<>();

        for(int i=0;i<s.length();i++){
            hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<s.length();i++){
            int value = hashMap.get(s.charAt(i));
            if(value == 1){
                return i;
            }
        }

        return -1;
        
    }
}