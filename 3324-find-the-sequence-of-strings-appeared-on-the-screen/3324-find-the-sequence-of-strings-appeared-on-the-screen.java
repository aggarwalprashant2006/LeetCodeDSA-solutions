class Solution {
    public List<String> stringSequence(String target) {
        StringBuilder sb = new StringBuilder();
        List<String> lst = new ArrayList<>();
        int i =0;
        while(!sb.toString().equals(target)){
            sb.append("a");
            lst.add(sb.toString());
            String str1 = sb.toString();
            while(str1.charAt(str1.length()-1) != target.charAt(i)){
                sb.setCharAt(sb.length()-1,(char)(sb.charAt(sb.length()-1) + 1));
                lst.add(String.valueOf(sb));
                str1 = sb.toString();
            }
            i++;
        }
        return lst;
    }
}