class Solution {
    public int minimumChairs(String s) {
        int sum1 =0;
        int max = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'E'){
                sum1++;
            }else{
                sum1--;
            }
            max = Math.max(max,sum1);
        }
        return max;
    }
}