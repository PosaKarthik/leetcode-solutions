class Solution {
    public int[] twoSum(int[] nums, int target) {

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
                
        //         if(nums[i]+nums[j] == target){
        //             return new int[] {i,j};
        //         }

        //     }
        // }
        
        // return new int[] {-1,-1};


        HashMap<Integer,Integer> answer = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int required = target-nums[i];

            if(answer.containsKey(required)){
                return new int[] {answer.get(required),i};
            }

            answer.put(nums[i],i);
        }

        return new int[] {-1,-1};

    }
}