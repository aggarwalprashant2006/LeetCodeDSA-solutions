class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i =0;i<words.length;i++){
            StringBuilder sb = new StringBuilder();
            sb.append(words[i]);
            sb.reverse();
            String str = sb.toString();
            for(int j = i+1;j<words.length;j++){
                if(str.equals(words[j])){
                    count++;
                }
            }
        }
        return count;
    }
}