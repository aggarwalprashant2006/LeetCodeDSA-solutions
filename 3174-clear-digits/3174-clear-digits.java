class Solution {
    public String clearDigits(String s) {
        Stack<Character> str = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                if(!str.isEmpty()){
                    str.pop();
                }
            }else{
                str.push(s.charAt(i));
            }
        }
        if(str.isEmpty()){
            return new String("");
        }
        List<Character> lst = new ArrayList<>();
        while(!str.isEmpty()){
            lst.add(str.pop());
        }
        StringBuilder sb = new StringBuilder();
        for(int i = lst.size()-1;i>= 0;i--){
            sb.append(lst.get(i));
        }
        return sb.toString();
    }
}