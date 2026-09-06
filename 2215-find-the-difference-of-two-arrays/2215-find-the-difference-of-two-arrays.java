class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        for(int i =0;i<nums2.length;i++){
            set1.add(nums2[i]);
        }
        for(int i =0;i<nums1.length;i++){
            set2.add(nums1[i]);
        }
        List<Integer> lst = new ArrayList<>();
        for(int i =0;i<nums1.length;i++){
            if(!set1.contains(nums1[i]) && !set3.contains(nums1[i])){
                lst.add(nums1[i]);
                set3.add(nums1[i]);
            }
        }
        set3 = new HashSet<>();
        list.add(lst);
        lst = new ArrayList<>();
        for(int i =0;i<nums2.length;i++){
            if(!set2.contains(nums2[i]) && !set3.contains(nums2[i])){
                lst.add(nums2[i]);
                set3.add(nums2[i]);
            }
        }
        list.add(lst);
        return list;
    }
}