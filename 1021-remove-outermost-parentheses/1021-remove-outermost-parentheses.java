class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        int sum1 = 1;
        int sum2 = 0;
        while(i < s.length()){
            if(s.charAt(i) == '('){
                sum1++;
            }else{
                sum2++;
            }
            if(sum1 != sum2){
                sb.append(s.charAt(i));
            }else{
                if(i != s.length()-1){
                    sum1 = 1;
                    sum2 = 0;
                    i++;
                }
            }
            i++;
        }
        return sb.toString();
    }
}