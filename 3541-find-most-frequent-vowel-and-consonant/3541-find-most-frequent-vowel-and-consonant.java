class Solution {
    public int maxFreqSum(String s) {
        int max1 = 0;
        int max2 = 0;
        for(int i =0;i<s.length();i++){
            int count = 0;
            int count1 = 0;
            for(int j = i;j<s.length();j++){
                char ch = s.charAt(j);
                if(s.charAt(i) == ch &&(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){
                    count++;
                }else if(s.charAt(i) == ch){
                    count1++;
                }
            }
            if(count > 0 && count > max1){
                max1 = count;
            }else if(count1 > 0 && count1 > max2){
                max2 = count1;
            }
        }
        return max1+max2;
    }
}