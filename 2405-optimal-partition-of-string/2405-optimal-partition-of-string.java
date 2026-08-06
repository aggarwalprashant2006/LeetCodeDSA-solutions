class Solution {
    public int partitionString(String s) {
        HashSet<Character> map = new HashSet<>();
        int count = 0;
        for(int i =0;i<s.length();i++){
            if(!map.contains(s.charAt(i))){
                map.add(s.charAt(i));
            }else{
                map.clear();
                map.add(s.charAt(i));
                count++;
            }
        }
        if(!map.isEmpty()){
            return count+1;
        }
        return count;
    }
}