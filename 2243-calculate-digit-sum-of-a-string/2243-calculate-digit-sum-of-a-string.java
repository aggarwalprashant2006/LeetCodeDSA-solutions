class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k){
            int sum1 = 0;
            int i = 0;
            StringBuilder sb = new StringBuilder();
            while(i < s.length()){
                int a = s.charAt(i)-'0';
                sum1 += a;
                if((i+1)%k == 0){
                    sb.append(sum1);
                    sum1 = 0;
                }
                i++;
            }
            if((i)%k != 0){
                sb.append(sum1);
            }
            s = sb.toString();
        }
        return s;
    }
}