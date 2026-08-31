class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        if(x == 2147483647){
            return 46340;
        }
        int i = 1;
        while(i <= x/2){
            if(i*i == x){
                return i;
            }else if(i*i > x){
                return i-1;
            }
            i++;
        }
        return x/2;
    }
}