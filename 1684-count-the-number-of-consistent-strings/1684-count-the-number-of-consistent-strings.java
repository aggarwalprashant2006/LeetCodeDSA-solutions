class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i =0; i<words.length;i++){
            String str = words[i];
            int count1 = 0;
            for(int j =0;j<str.length();j++){
                String str1 = String.valueOf(str.charAt(j));
                if(!allowed.contains(str1)){
                    count1++;
                }
            }
            if(count1 == 0){
                count++;
            }
        }
        return count;
    }
}