class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<words.size();i++){
            String str = words.get(i);
            sb.append(str.charAt(0));
        }
        String str1 = sb.toString();
        return str1.equals(s);
    }
}