class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }

        for(int key : hashMap.keySet()){

            if(hashMap.get(key) > 1){
                return true;
            }
        }

        return false;
    }
}