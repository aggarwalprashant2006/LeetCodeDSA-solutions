class Solution {
    public char findTheDifference(String s, String t) {
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        if(s.length() == 0){
            return t.charAt(0);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i =0;i<arr1.length;i++){
            if(arr2[i] != arr1[i]){
                return arr2[i];
            }
        }
        return arr2[arr2.length-1];
    }
}