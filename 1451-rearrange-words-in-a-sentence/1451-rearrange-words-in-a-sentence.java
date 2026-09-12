class Solution {
    public String arrangeWords(String text) {
        String[] arr = text.toLowerCase().split(" ");
        for(int i =0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j].length() > arr[j+1].length()){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        String str2 = String.join(" ",arr);

        return Character.toUpperCase(str2.charAt(0)) + str2.substring(1);

    }
}