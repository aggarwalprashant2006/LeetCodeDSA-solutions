class Solution {
    public int[] closestDivisors(int num) {
        int a = (int)Math.sqrt(num+2);
        int i = 1;
        int b = 0;
        int c = 0;
        int min = Integer.MAX_VALUE;
        while(i <= a){
            if((num+2) % i == 0){
                if(min > ((num+2)/i - i)){
                    min = (num+2)/i - i;
                    b = i;
                    c = (num+2)/i;
                }
            }if((num+1) % i == 0){
                if(min > ((num+1)/i - i)){
                    min = (num+1)/i - i;
                    b = i;
                    c = (num+1)/i;
                }
            }
            i++;
        }
        return new int[]{b,c};
    }
}