class Solution {
    public int singleNumber(int[] nums) {

       HashMap<Integer,Integer> hashMap = new HashMap<>();

       for(int value : nums){
        hashMap.put(value,hashMap.getOrDefault(value,0)+1);
       }

       for(int key : hashMap.keySet()){
        if(hashMap.get(key) == 1){
            return key;
        }
       }
       
        return -1;
        
    }
}