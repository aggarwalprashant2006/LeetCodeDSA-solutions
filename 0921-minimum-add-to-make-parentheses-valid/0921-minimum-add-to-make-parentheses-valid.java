class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> str = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                str.push(ch);
            }else{
                if(!str.isEmpty() && str.peek() == '('){
                    str.pop();
                }else{
                    str.push(ch);
                }
            }
        }
        return str.size();
    }
}