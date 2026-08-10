class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length < 2){
            return false;
        }
        int si = 0;
        int ei = si+2;
        while(ei < arr.length){
            if(((arr[si]%2 != 0) && (arr[si+1] % 2 != 0 ))&& arr[ei] %2 != 0){
                return true;
            }
            si++;
            ei++;
        }
        return false;
    }
}