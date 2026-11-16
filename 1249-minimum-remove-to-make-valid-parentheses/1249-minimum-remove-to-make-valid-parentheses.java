class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> removable = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                stack.push(i);
            } else if(ch == ')'){
                if(stack.isEmpty()){
                    removable.add(i);
                } else {
                    stack.pop();
                }
            }
        }

        while(!stack.isEmpty()){
            removable.add(stack.pop());
        }

        StringBuilder tempResult = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(!removable.contains(i)){
                tempResult.append(s.charAt(i));
            }
        }

        return tempResult.toString();
    }
}