class Solution {
    public int smallestNumber(int n, int t) {
        int i = n;
        while(i >= n){
            int a = i;
            int sum = 1;
            while(a > 0){
                int rev = a%10;
                sum = sum * rev;
                a /= 10;
            }
            if(sum%t == 0){
                return i;
            }else{
                i++;
            }

        }
        return -1;
    }
}