class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        for(int i =0;i<nums1.length;i++){
            min = Math.min(min,nums1[i]);
        }
        int count = 0;
        for(int i =0;i<nums1.length;i++){
            if(min % 2 == 0){
                if(nums1[i]%2 == 0){
                    count++;
                }else if((nums1[i]-min)%2 == 0 && nums1[i] != min){
                    count++;
                }else{
                    return false;
                }
            }else{
                if(nums1[i]%2 != 0){
                    count++;
                }else if((nums1[i]-min)%2 != 0 && nums1[i] != min){
                    count++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}