class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i =0;i<nums1.length;i++){
            max1 = Math.max(nums1[i],max1);
            max2 = Math.max(nums2[i],max2);
        }
        return max2-max1;
    }
}