class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i = 1;i<s.length();i++){
            if(i % 2 == 0){
                sb.append(s.charAt(i));
            }else{
                sb.append((char) (sb.charAt(i-1) + (s.charAt(i)-'0')));
            }
        }
        return sb.toString();
    }
}