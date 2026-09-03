class Solution {
    public int minLength(String s) {
        Stack<Character> str = new Stack<>();
        int i = 0;
        while(i < s.length()){
            if(str.isEmpty()){
                str.push(s.charAt(i));
                
            }else{
                if(s.charAt(i) == 'B' && str.peek() == 'A'){
                    str.pop();
                }else if(s.charAt(i) == 'D' && str.peek() == 'C'){
                    str.pop();
                }else{
                    str.push(s.charAt(i));
                }
            }
            i++;
        }
        return str.size();
    }
}