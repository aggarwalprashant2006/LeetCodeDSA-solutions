class Solution {
    public boolean canAliceWin(int n) {
        int i = 0;
        int a = 10;
        while(n >= 0){
            if(i%2 == 0){
                if(n >= a){
                    n -= a;
                }else{
                    return false;
                }
            }else{
                if(n >= a){
                    n -= a;
                }else{
                    return true;
                }
            }
            a--;
            i++;
        }
        return false;
    }
}