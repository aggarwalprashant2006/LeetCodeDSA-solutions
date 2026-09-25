class Solution {
    public String reverseByType(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }else{
                sb1.append(s.charAt(i));
            }
        }
        sb.reverse();
        sb1.reverse();
        StringBuilder sb2 = new StringBuilder();
        int k1 = 0;
        int k2 = 0;
        for(int i =0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                sb2.append(sb.charAt(k1));
                k1++;
            }else{
                sb2.append(sb1.charAt(k2));
                k2++;
            }
        }
        return sb2.toString();
    }
}