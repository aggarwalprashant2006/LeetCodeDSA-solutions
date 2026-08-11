class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count = 0;
        int count1 = 0;
        for(int i =0;i<arr1.length;i++){
            if(arr1[i] > arr2[i]){
                count++;
            }else if(arr1[i] == arr2[i]){
                count++;
                count1++;
            }else{
                count1++;
            }
        }
        if(count == arr1.length || count1 == arr1.length){
            return true;
        }
        return false;
    }
}