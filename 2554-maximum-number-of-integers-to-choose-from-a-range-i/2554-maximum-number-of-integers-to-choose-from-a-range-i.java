class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int i =1;
        int sum = 0;
        int count = 0;
        Arrays.sort(banned);
        int k = 0;
        while(i <= n){
            while(k < banned.length && banned[k] < i){
                k++;
            }
            if( k < banned.length && banned[k] == i){
                k++;
                i++;
            }
            else{
                sum += i;
                if(sum > maxSum){
                    return count;
                }else{
                    count++;
                }
                i++;
            }
        }
        return count;
    }
}