class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String arr[] = sentence.split(" ");
        for(int i =0;i<arr.length;i++){
            String str = arr[i];
            if(str.length() >= searchWord.length()){
                int count1 = 0;
                for(int j = 0;j < searchWord.length();j++){
                    if(searchWord.charAt(j) == str.charAt(j)){
                        count1++;
                    }
                }
                if(count1 == searchWord.length()){
                    return i+1;
                }
            }
        }
        return -1;
    }
}