class Solution {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder();
        if(n == 1){
            return "1";
        }
        if(n == 2){
            return "11";
        }
        sb.append("1");
        sb.append("1");
        int i =2;
        while(i < n){
            int j =0;
            int count = 0;
            StringBuilder sb1 = new StringBuilder();
            HashSet<Character> map = new HashSet<>();
            while(j < sb.length()){
                if(map.isEmpty() || map.contains(sb.charAt(j))){
                    map.add(sb.charAt(j));
                    count++;
                }else{
                    sb1.append(count);
                    sb1.append(sb.charAt(j-1));
                    map = new HashSet<>();
                    map.add(sb.charAt(j));
                    count = 1;
                }
                j++;
            }
            sb1.append(count);
            sb1.append(sb.charAt(sb.length()-1));
            sb = new StringBuilder();
            sb.append(sb1);
            i++;
        }
        return sb.toString();
    }
}