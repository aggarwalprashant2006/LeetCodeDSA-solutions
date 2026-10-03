class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int low = 1;
        int high = 0;
        for(int i =0;i<quantities.length;i++){
            high = Math.max(high,quantities[i]);
        }
        while(low <= high){
            int mid = low+(high-low)/2;
            int count = 0;
            for(int i =0;i<quantities.length;i++){
                count += quantities[i]/mid;
                if(quantities[i]%mid != 0){
                    count++;
                }
            }
            if(count <= n){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}