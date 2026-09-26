class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < knowledge.size(); i++) {
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        int count = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '('){
                count = 1;
            }else if(count == 1 && s.charAt(i) != ')'){
                sb1.append(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                sb.append(map.getOrDefault(sb1.toString(), "?"));
                count = 0;
                sb1 = new StringBuilder();
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}