class Solution {
    public int removeDuplicates(int[] nums) {
        
        int prev = 0;
        for(int current=1;current<nums.length;current++){
            if(nums[prev] != nums[current]){
                prev++;
                nums[prev]=nums[current];
            }
        }

        return prev+1;

    }
}