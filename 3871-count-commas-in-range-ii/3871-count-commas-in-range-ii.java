class Solution {
    public long countCommas(long n) {
        long sum = 0;
        if(n >= Math.pow(10,15)){
            sum += (n-(long)Math.pow(10,15)+1)*5;
            n = (long)Math.pow(10,15)-1;
        }
        if(n >= Math.pow(10,12)){
            sum += (n-(long)Math.pow(10,12)+1)*4;
            n = (long)Math.pow(10,12)-1;
        }
        if(n >= Math.pow(10,9)){
            sum += (n-(long)Math.pow(10,9)+1)*3;
            n = (long)Math.pow(10,9)-1;
        }
        if(n >= Math.pow(10,6)){
            sum += (n - (long)Math.pow(10,6)+1)*2;
            n = (long)Math.pow(10,6)-1;
        }
        if(n >= Math.pow(10,3)){
            sum += n - (long)Math.pow(10,3)+1;
        }
        return sum;
    }
}