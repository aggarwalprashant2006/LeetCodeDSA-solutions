class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int count1 = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '*' && count%2 == 0){
                count1++;
            }else if(s.charAt(i) == '|'){
                count++;
            }
        }
        return count1;
    }
}