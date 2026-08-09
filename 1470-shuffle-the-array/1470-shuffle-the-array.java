class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] result = new int[n*2];
        int j=0;

        for(int i=0;i<n;i++){
            result[j++] = nums[i];
            result[j++] = nums[n+i];
        }

    System.out.println(Arrays.toString(result));

        return result;
    }
}