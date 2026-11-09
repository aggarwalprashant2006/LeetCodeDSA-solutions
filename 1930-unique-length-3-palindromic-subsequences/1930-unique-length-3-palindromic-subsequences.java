class Solution {
    public int countPalindromicSubsequence(String s) {
        HashSet<Character> set2 = new HashSet<>();
        int si = 0;
        int ei = s.length()-1;
        int sum = 0;

        while(si+2 < s.length()){
            if(set2.contains(s.charAt(si))){
                si++;
                ei = s.length()-1;
            }
            else if(s.charAt(si) == s.charAt(ei)){
                HashSet<Character> set1 = new HashSet<>();
                int i = si+1;

                while(i < ei){
                    set1.add(s.charAt(i));
                    i++;
                }

                set2.add(s.charAt(si));
                sum += set1.size();
                si++;
                ei = s.length()-1;
            }else{
                ei--;
            }
        }
        return sum;
    }
}
