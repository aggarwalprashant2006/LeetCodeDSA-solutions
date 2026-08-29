class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[] = text.split(" ");
        int count = 0;
        for(int i =0;i<arr.length;i++){
            int count1 =0;
            for(int j =0;j<brokenLetters.length();j++){
                if(arr[i].contains(String.valueOf(brokenLetters.charAt(j)))){
                    count1++;
                    break;
                }
            }
            if(count1 == 0){
                count++;
            }
        }
        return count;
    }
}