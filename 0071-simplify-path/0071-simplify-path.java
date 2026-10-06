class Solution {
    public String simplifyPath(String path) {
        Stack<Character> str = new Stack<>();
        int count = 0;
        int count1 = 0;
        int i = 0;
        path += "/";

        while(i < path.length()){
            if(path.charAt(i) == '.'){
                str.push(path.charAt(i));
                count++;
                count1++;
                i++;
            }else if(path.charAt(i) == '/'){
                if(count == 1 && count1 == 1){
                    str.pop();
                }

                if(!str.isEmpty() && str.peek() == '/'){
                    i++;
                }else if(count == 2 && count1 == 2){
                    int a = 0;
                    while(a != 2 && !str.isEmpty()){
                        if(str.peek() == '/'){
                            a++;
                        }
                        str.pop();
                    }
                    str.push('/');
                    i++;
                }else{
                    str.push(path.charAt(i));
                    i++;
                }
                count = 0;
                count1 = 0;
            }else{
                str.push(path.charAt(i));
                count1++;
                i++;
            }
        }

        if(str.size() > 1 && str.peek() == '/'){
            str.pop();
        }

        StringBuilder sb = new StringBuilder();
        while(!str.isEmpty()){
            sb.append(str.pop());
        }
        return sb.reverse().toString();
    }
}