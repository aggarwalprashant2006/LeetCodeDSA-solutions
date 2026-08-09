class Solution {
    public String firstPalindrome(String[] words) {
        for(int i =0;i<words.length;i++){
            String str = words[i];
            int count = 0;
            int si = 0;
            int ei = str.length()-1;
            while(si < ei){
                if(str.charAt(si) != str.charAt(ei)){
                    count++;
                    break;
                }
                si++;
                ei--;
            }
            if(count == 0){
                return str;
            }
        }
        return new String("");
    }
}