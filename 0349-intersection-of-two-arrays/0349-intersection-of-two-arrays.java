class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> hashSet = new HashSet<>();
        

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
            hashSet.add(nums1[i]);
                }
            }
        }

        int []interSection=new int[hashSet.size()];
        int j=0;
       for(int x : hashSet){
        interSection[j++] = x;
       }

        return interSection;
    }
}