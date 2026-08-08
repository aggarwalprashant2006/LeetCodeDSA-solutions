class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i = 0;i<nums1.length;i++){
            int j = 0;
            while(nums2[j] != nums1[i]){
                j++;
            }
            int a = nums2[j];
            j++;
            while(j < nums2.length){
                if(nums2[j] > a){
                    nums1[i] = nums2[j];
                    break;
                }
                j++;
            }
            if(nums1[i] == a){
                nums1[i] = -1;
            }
        }
        return nums1;
    }
}