class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> hashMap1 = new HashMap<>();
        HashMap<Character,Integer> hashMap2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            hashMap1.put(s.charAt(i),hashMap1.getOrDefault(s.charAt(i),0)+1);
            hashMap2.put(t.charAt(i),hashMap2.getOrDefault(t.charAt(i),0)+1);
        }

       if(hashMap1.size() != hashMap2.size()){
        return false;
       }

       for(char x : hashMap1.keySet()){

        char key = x;
        int value = hashMap1.get(key);

        if(!hashMap2.containsKey(key) || hashMap2.get(key) != value){
            return false;
        }
        
       }

        return true;
        
    }
}