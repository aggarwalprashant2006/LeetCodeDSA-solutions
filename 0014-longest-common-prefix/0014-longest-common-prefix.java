class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if(strs.length == 1){
            return strs[0];
        }
        String str = strs[0];
        int i = 0;
        while(i < str.length()){
            int count = 0;
            for(int j = 1;j<strs.length;j++){
                String str1 = strs[j];
                if( i >= str1.length() || str.charAt(i) != str1.charAt(i)){
                    count++;
                    break;
                }
            }
            if(count == 0){
                sb.append(String.valueOf(str.charAt(i)));
            }else{
                break;
            }
            i++;
        }
        return sb.toString();
    }
}