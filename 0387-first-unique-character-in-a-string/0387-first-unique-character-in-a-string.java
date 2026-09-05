class Solution {
    public int firstUniqChar(String s) {
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> set1 = new HashSet<>();
        for(int i =0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
               set.remove(s.charAt(i)); 
               set1.add(s.charAt(i));
            }else{
                set.add(s.charAt(i));
            }
        }
        for(int i =0;i<s.length();i++){
            if(set.contains(s.charAt(i)) && !set1.contains(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}