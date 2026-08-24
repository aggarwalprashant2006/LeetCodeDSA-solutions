class Solution {
    public int romanToInt(String s) {
        int arr[] = new int[s.length()];
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'I'){
                arr[i] = 1;
            }else if(ch == 'V'){
                arr[i] = 5;
            }else if(ch == 'X'){
                arr[i] = 10;
            }else if(ch == 'L'){
                arr[i] = 50;
            }else if(ch == 'C'){
                arr[i] = 100;
            }else if(ch == 'D'){
                arr[i] = 500;
            }else if(ch == 'M'){
                arr[i] = 1000;
            }
        }
        if(arr.length == 1){
            return arr[0];
        }
        int sum = 0;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                sum += arr[i+1] - arr[i];
                i++;
            }else{
                sum += arr[i];
            }
        }
        if(arr[arr.length-1] <= arr[arr.length-2]){
            sum += arr[arr.length-1];
        }
        
        return sum;
    }
}