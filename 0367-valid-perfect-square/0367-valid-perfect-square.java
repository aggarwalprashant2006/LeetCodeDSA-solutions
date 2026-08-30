class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        if(num == 1){
            return true;
        }
        while(i <= num/2){
            if(i*i == num){
                return true;
            }else if(i*i > num){
                break;
            }
            i++;
        }
        return false;
    }
}