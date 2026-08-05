class Solution {
    public boolean doesAliceWin(String s) {
        int count =0;
        String str = "aeiou";
        for(int i =0;i<s.length();i++){
            String st = String.valueOf(s.charAt(i));
            if(str.contains(st)){
                count++;
            }
        }
        return count >0;
    }
}