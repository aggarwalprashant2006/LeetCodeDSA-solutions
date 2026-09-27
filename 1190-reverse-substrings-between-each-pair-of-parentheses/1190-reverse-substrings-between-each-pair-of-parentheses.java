class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> str = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ')'){
                StringBuilder sb = new StringBuilder();
                while(str.peek() != '('){
                    sb.append(str.pop());
                }
                str.pop();
                for(int j = 0;j<sb.length();j++){
                    str.push(sb.charAt(j));
                }
            }else{
                str.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!str.isEmpty()){
            sb.append(str.pop());
        }
        return sb.reverse().toString();
    }
}