class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int si = 0;
        
        while(si < s.length()){
            HashSet<Character> map = new HashSet<>();
            int count = 0;
            int i = si;
            while(i < s.length()){
                if(!map.contains(s.charAt(i))){
                    map.add(s.charAt(i));
                    count++;
                    max = Math.max(max,count);
                }else{
                    break;
                }
                i++;
            }
            si++;
        }
        return max;
    }
}