class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for(int i =0;i<word1.length;i++){
            sb.append(word1[i]);
        }
        String str = sb.toString();
        for(int i =0;i<word2.length;i++){
            sb1.append(word2[i]);
        }
        String str1 = sb1.toString();
        if(str.equals(str1)){
            return true;
        }
        return false;
    }
}