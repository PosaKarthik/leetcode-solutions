class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        

        for(int x : nums1){
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        }

        for(int x : nums2){

            if(hashMap.containsKey(x)){

                if(hashMap.get(x) > 0){
                    list.add(x);
                    hashMap.put(x,hashMap.get(x)-1);
                }
            }
        }

        int[] interSection = new int[list.size()];
        int j = 0;

        for(int x : list){
            interSection[j++] = x;
        }

        return interSection;

    }
        
    } 