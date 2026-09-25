class Solution {
    public int trap(int[] height) {
        int max1 = 0;
        int max2 = 0;
        int sum = 0;
        int si = 0;
        int ei = height.length-1;
        while(si < ei){
            max1 = Math.max(max1,height[si]);
            max2 = Math.max(max2,height[ei]);
            if(max1 < max2){
                sum += max1-height[si];
                si++;
            }else{
                sum+= max2 - height[ei];
                ei--;
            }
        }
        return sum;
    }
}