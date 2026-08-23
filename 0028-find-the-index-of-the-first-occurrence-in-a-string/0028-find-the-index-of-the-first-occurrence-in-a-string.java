class Solution {
    public int strStr(String haystack, String needle) {
        int j = 0;
        for(int i =0; i< haystack.length();i++){
            int count = 0;
            if(haystack.charAt(i) == needle.charAt(j)){
                int a = i;
                while(j < needle.length() && a < haystack.length()){
                    if(haystack.charAt(a) != needle.charAt(j)){
                        count++;
                        break;
                    }
                    a++;
                    j++;
                }
                if(count == 0 && (j == needle.length())){
                    return i;
                }else{
                    count = 0;
                    j = 0;
                }
            }
        }
        return -1;
    }
}