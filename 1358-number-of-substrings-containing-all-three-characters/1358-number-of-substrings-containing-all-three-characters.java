class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int arr[] = new int[3];
        int a = 0;
        for(int i =0;i<s.length()&&a<s.length();i++){
            if(s.charAt(i) == 'a'){
                arr[0]++;
            }else if(s.charAt(i) == 'b'){
                arr[1]++;
            }else if(s.charAt(i) == 'c'){
                arr[2]++;
            }
            while(arr[0] > 0 && arr[1] > 0 && arr[2] > 0){
                count += s.length()-i;
                if(s.charAt(a) == 'a'){
                    arr[0]--;
                }else if(s.charAt(a) == 'b'){
                    arr[1]--;
                }else{
                    arr[2]--;
                }
                a++;
            }
        }
        return count;
    }
}