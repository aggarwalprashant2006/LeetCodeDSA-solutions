class Solution {
    public int countSubstrings(String s) {
        int sum = 0;
        int i =0;
        int si = i;
        int ei = si;
        while(i < s.length()){
            int count = 0;
            int a = ei;
            while(si <= ei){
                if(s.charAt(si) != s.charAt(ei)){
                    count++;
                    break;
                }
                si++;
                ei--;
            }
            if(count == 0){
                sum++;
            }
            if(a == s.length()-1){
                i++;
                si = i;
                ei = si;
            }else{
                si = i;
                ei = a+1;
            }
        }
        return sum;
    }
}