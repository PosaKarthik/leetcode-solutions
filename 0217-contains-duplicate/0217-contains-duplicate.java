class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hashSet = new HashSet<>();

        for(int value : nums){
            
            if(hashSet.contains(value)) return true;
            hashSet.add(value);

        }

        return false;
        
    }
}