class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        // int result = 0;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> hs1 = new HashMap<>();
        HashMap<Integer,Integer> hs2 = new HashMap<>();

        for(int x : nums1){
            hs1.put(x,hs1.getOrDefault(x,0)+1);
        }

        for(int x : nums2){
            hs2.put(x,hs2.getOrDefault(x,0)+1);
        }


        for(int x : hs1.keySet()){

            if(hs2.containsKey(x)){

                int h1v = hs1.get(x);
                int h2v = hs2.get(x);

                if(h1v < h2v){
                    for(int i=0;i<h1v;i++){
                        list.add(x);
                    }
                }else{
                    for(int i=0;i<h2v;i++){
                        list.add(x);
                    }
                }

            }
        }

        int[] result = new int[list.size()];
        int i = 0;


        for(int x : list){
            result[i++] = x;
        }

        System.out.println(Arrays.toString(result));
        

        return result;
    }
}