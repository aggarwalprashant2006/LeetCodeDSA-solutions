class Solution {
    public String maximumOddBinaryNumber(String s) {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        int si1 = 0;
        int ei1 = arr.length-1;
        while(si1 < ei1){
            char temp = arr[si1];
            arr[si1] = arr[ei1];
            arr[ei1] = temp;
            si1++;
            ei1--;
        }
        int ei = arr.length-1;
        while(ei >= 0){
            if(arr[ei] == '1'){
                char temp = arr[ei];
                arr[ei] = arr[arr.length-1];
                arr[arr.length-1] = temp;
                break;
            }
            ei--;
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}