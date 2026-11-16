class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> str1 = new Stack<>();
        Stack<Integer> str2 = new Stack<>();
        Stack<Integer> str3 = new Stack<>();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '('){
                str1.push(s.charAt(i));
                str2.push(i);
            }else if(s.charAt(i) == ')'){
                if(!str1.isEmpty()){
                    str1.pop();
                    str2.pop();
                }else{
                    str3.push(i);
                }
            }
        }
        int arr[] = new int[str3.size()+str2.size()];
        int j = 0;
        while(!str2.isEmpty()){
            arr[j] = str2.pop();
            j++;
        }
        while(!str3.isEmpty()){
            arr[j] = str3.pop();
            j++;
        }
        Arrays.sort(arr);
        int k = 0;
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(k < arr.length && i == arr[k]){
                k++;
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}