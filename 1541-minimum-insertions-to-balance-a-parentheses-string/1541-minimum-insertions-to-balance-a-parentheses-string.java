class Solution {
    public int minInsertions(String s) {
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '('){
                if(sum2%2 != 0){
                    sum++;
                    sum2++;
                }if(sum2 != 0 && sum1 < sum2/2){
                    sum += sum2/2-sum1;
                    sum1 = sum2/2;
                }
                sum1++;
            }else{
                sum2++;
            }
        }
        if(sum2%2 != 0){
            sum++;
            sum2++;
        }
        int a = sum1 - sum2/2;
        if(a >= 0){
            sum += a*2;
        }else{
            sum += a*-1;
        }
        return sum;
    }
}