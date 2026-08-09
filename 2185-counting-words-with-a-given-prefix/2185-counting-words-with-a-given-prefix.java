class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i =0;i< words.length;i++){
            String str = words[i];
            if(str.length() >= pref.length()){
                int count1 = 0;
                for(int j = 0;j < pref.length();j++){
                    if(pref.charAt(j) == str.charAt(j)){
                        count1++;
                    }
                }
                if(count1 == pref.length()){
                    count++;
                }
            }
        }
        return count;
    }
}