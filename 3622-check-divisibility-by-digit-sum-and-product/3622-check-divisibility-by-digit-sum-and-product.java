class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int i = n;
        while(i > 0){
            int rev = i%10;
            sum += rev;
            prod *= rev;
            i /= 10;
        }
        int a = sum+prod;
        if(n%a == 0){
            return true;
        }
        return false;
    }
}