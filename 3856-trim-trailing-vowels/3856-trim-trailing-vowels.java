class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb = new StringBuilder();
        int ei = s.length()-1;
        while(ei >= 0){
            if(s.charAt(ei) == 'a' || s.charAt(ei) == 'e' || s.charAt(ei) == 'i' || s.charAt(ei) == 'o' || s.charAt(ei) == 'u'){
                ei--;
            }else{
                break;
            }
        }
        for(int i =0;i<=ei;i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}