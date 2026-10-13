class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        int max = 0;
        int a = 0;
        for(int i =0;i<minutes;i++){
            if(grumpy[i] == 1){
                sum += customers[i];
                max = Math.max(max,sum);
            }
        }
        for(int i = minutes;i<customers.length;i++){
            if(grumpy[i-minutes] == 1){
                sum -= customers[i-minutes];
            }if(grumpy[i] == 1){
                sum += customers[i];
            }
            if(max < sum){
                a = i-minutes+1;
                max = sum;
            }
        }
        for(int i = a;i < a+minutes;i++){
            grumpy[i] = 0;
        }
        int sum1 = 0;
        for(int i =0;i<grumpy.length;i++){
            if(grumpy[i] == 0){
                sum1 += customers[i];
            }
        }
        return sum1;
    }
}