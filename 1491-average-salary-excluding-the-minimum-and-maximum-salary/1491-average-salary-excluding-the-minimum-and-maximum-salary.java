class Solution {
    public double average(int[] salary) {

        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        double totalSum = 0.0;

        for(int employeeSalary : salary){
            minimum = Math.min(minimum,employeeSalary);
            maximum = Math.max(maximum,employeeSalary);
            totalSum += employeeSalary;
        }

        return (double) (totalSum - minimum - maximum) / (salary.length - 2);
        
    }
}