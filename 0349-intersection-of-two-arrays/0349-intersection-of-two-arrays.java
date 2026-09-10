class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        List<Integer> lst = new ArrayList<>();
        for(int i =0;i<nums1.length;i++){
            for(int j =0;j<nums2.length;j++){
                if(nums1[i] == nums2[j] && !set1.contains(nums1[i])){
                    lst.add(nums1[i]);
                    set1.add(nums1[i]);
                }
            }
        }
        int arr[] = new int[lst.size()];
        for(int i =0;i<lst.size();i++){
            arr[i] = lst.get(i);
        }
        return arr;
    }
}