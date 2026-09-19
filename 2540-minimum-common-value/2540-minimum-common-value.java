class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(nums1[0] > nums2[nums2.length-1] || nums2[0] > nums1[nums1.length-1]){
            return -1;
        }
        int si = 0;
        int si1 = 0;
        int min = Integer.MAX_VALUE;
        while(si < nums1.length && si1 < nums2.length){
            if(nums1[si] == nums2[si1]){
                min = Math.min(min,nums1[si]);
                si++;
                si1++;
            }else if(nums1[si] < nums2[si1]){
                si++;
            }else{
                si1++;
            }
        }
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}