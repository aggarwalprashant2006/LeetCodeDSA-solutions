class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int sum1 = 0;
        for(int i =0;i<travel.length;i++){
            sum1 += travel[i];
        }
        sum1 = sum1*3;
        for(int i =0;i<garbage.length;i++){
            String str = garbage[i];
            sum1 += str.length();
        }
        int a = 0;
        int b =0;
        int c = 0;
        int j = travel.length-1;
        for(int i = garbage.length-1; i > 0;i--){
            String str = garbage[i];
            if( a == 0){
                if(str.contains("G")){
                    a = 1;
                }else{
                    sum1 -= travel[j];
                }
            }
            if( b == 0){
                if(str.contains("P")){
                    b = 1;
                }else{
                    sum1 -= travel[j];
                }
            }
            if( c == 0){
                if(str.contains("M")){
                    c = 1;
                }else{
                    sum1 -= travel[j];
                }
            }
            j--;
        }
        return sum1;
    }
}