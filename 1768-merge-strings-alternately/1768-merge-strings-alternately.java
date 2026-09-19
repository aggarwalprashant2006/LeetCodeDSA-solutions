class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int si = 0;
        int si1 = 0;
        while(si < word1.length() || si1 < word2.length()){
            if(si < word1.length()){
                sb.append(word1.charAt(si));
                si++;
            }if(si1 < word2.length()){
                sb.append(word2.charAt(si1));
                si1++;
            }
        }
        return sb.toString();
    }
}