class Solution {
    public boolean isValid(String s) {
      Stack<Character> str = new Stack<>();
      for(int i=0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch =='{' || ch == '[' || ch =='(' ){
                str.push(ch);
            }
            else{
                if(str.isEmpty()){
                   return  false;
                }
                else if(str.peek() == '{' && ch=='}'){
                    str.pop();
                }else if(str.peek() =='[' && ch == ']'){
                    str.pop();
                }else if (str.peek() == '(' && ch == ')'){
                    str.pop();
                }else{
                    return false;
                }
            }
      }
      if(str.isEmpty()){
    return true;
      }else{
        return false;
      }
    }
}