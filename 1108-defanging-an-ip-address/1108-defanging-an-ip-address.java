class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        char arr[] = address.toCharArray();
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == '.'){
                sb.append("[.]");
            }else{
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}