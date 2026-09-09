class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set4 = new HashSet<>();
        List<Integer> lst = new ArrayList<>();
        for(int i =0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i =0;i<nums2.length;i++){
            set1.add(nums2[i]);
        }
        for(int i =0;i<nums3.length;i++){
            set2.add(nums3[i]);
        }
        for(int i =0;i<nums1.length;i++){
            if(set1.contains(nums1[i]) && !set4.contains(nums1[i])){
                lst.add(nums1[i]);
                set4.add(nums1[i]);
            }else if(set2.contains(nums1[i]) && !set4.contains(nums1[i])){
                lst.add(nums1[i]);
                set4.add(nums1[i]);
            }
        }
        for(int i =0;i<nums2.length;i++){
            if(set.contains(nums2[i]) && !set4.contains(nums2[i])){
                lst.add(nums2[i]);
                set4.add(nums2[i]);
            }else if(set2.contains(nums2[i]) && !set4.contains(nums2[i])){
                lst.add(nums2[i]);
                set4.add(nums2[i]);
            }
        }
        for(int i =0;i<nums3.length;i++){
            if(set1.contains(nums3[i]) && !set4.contains(nums3[i])){
                lst.add(nums3[i]);
                set4.add(nums3[i]);
            }else if(set.contains(nums3[i]) && !set4.contains(nums3[i])){
                lst.add(nums3[i]);
                set4.add(nums3[i]);
            }
        }
        return lst;
    }
}