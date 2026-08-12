class Solution {
    public String largestMerge(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int si1 = 0;
        int si2 = 0;
        while(si1< word1.length() && si2 < word2.length()){
            char ch1 = word1.charAt(si1);
            char ch2 = word2.charAt(si2);
            if(ch1 > ch2){
                sb.append(ch1);
                si1++;
            }else if(ch1 < ch2){
                sb.append(ch2);
                si2++;
            }else{
                if(word1.substring(si1).compareTo(word2.substring(si2)) >= 0){
                    sb.append(ch1);
                    si1++;
                }else{
                    sb.append(ch2);
                    si2++;
                }
            }
        }
        while(si1 < word1.length()){
            sb.append(word1.charAt(si1));
            si1++;
        }
        while(si2 < word2.length()){
            sb.append(word2.charAt(si2));
            si2++;
        }
        return sb.toString();
    }
}