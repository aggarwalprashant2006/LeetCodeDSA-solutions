class Solution {
    public String stringHash(String s, int k) {
        char[] arr =  s.toCharArray();
        char[] arr1 = new char[s.length()/k];
        int si = 0;
        int ei = k-1;
        int i =0;
        while(ei < arr.length){
            int a = si;
            int b = ei;
            int sum = 0;
            while(a<=b){
                sum += arr[a]-'a';
                a++;
            }
            arr1[i] = (char)('a'+ sum%26);
            i++;
            si += k;
            ei += k;
        }
        return new String(arr1);
    }
}