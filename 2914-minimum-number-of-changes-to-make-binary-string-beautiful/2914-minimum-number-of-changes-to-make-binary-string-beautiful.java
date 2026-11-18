class Solution {
    public int minChanges(String s) {
        int ones = 0;
        int zeroes = 0;
        int sum = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                ones++;
            }else{
                zeroes++;
            }
            if(i%2 != 0){
                if(ones < 2 && zeroes < 2){
                    sum++;
                }
                ones = 0;
                zeroes = 0;
            }
        }
        return sum;
    }
}