class Solution {
    public double average(int[] salary) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double totalSum = 0;

        for(int i=0;i<salary.length;i++){
            min=Math.min(min,salary[i]);
            max=Math.max(max,salary[i]);
        }

        int count = 0;

        for(int x : salary){
            if(x == min || x == max){
                continue;
            }else{
            totalSum += x;
            count++;
            }
        }

        double result = totalSum/count;

        return result;
    }
}