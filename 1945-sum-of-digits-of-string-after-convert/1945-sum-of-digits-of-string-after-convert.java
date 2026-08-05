class Solution {
    public int getLucky(String s, int k) {
    StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            int a = s.charAt(i)-'a'+1;
            sb.append(a);
        }
        String str = sb.toString();
        while(k > 0){
            int sum = 0;
            for(int i =0;i<str.length();i++){
                sum += str.charAt(i) - '0';
            }
            str = String.valueOf(sum);
            k--;
        }
        int a = Integer.parseInt(str);
        return a;
    }
}