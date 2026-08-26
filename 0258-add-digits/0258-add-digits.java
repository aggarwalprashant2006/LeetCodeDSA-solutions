class Solution {
    public int addDigits(int num) {
        if(num < 10){
            return num;
        }
        int sum = 0;
        int count = 0;
        while(num > 0){
            sum += num%10;
            count++;
            num /= 10;
            if(num == 0 && count == 1){
                return sum;
            }else if(num == 0){
                num = sum;
                count = 0;
                sum = 0;
            }
            
        }
        return -1;
    }
}