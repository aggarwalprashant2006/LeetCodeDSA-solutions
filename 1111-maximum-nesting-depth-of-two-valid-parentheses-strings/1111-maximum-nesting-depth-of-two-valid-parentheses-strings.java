class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int arr[] = new int[seq.length()];
        int count1 = 0;
        int count2 = 0;
        for(int i =0;i<seq.length();i++){
            int a = count1;
            int b = count2;
            if(seq.charAt(i) == '('){
                if(count1 <= count2){
                    count1++;
                }else{
                    count2++;
                }
            }else{
                if(count2 >= count1){
                    count2--;
                }else{
                    count1--;
                }
            }
            if(count1 != a){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
        return arr;
    }
}