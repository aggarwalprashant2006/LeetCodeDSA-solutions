class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int si = 0;
        int si1 = 0;
        List<Integer> lst = new ArrayList<>();
        while(si < nums1.length && si1 < nums2.length){
            if(nums1[si] < nums2[si1]){
                si++;
            }else if(nums1[si] > nums2[si1]){
                si1++;
            }else{
                lst.add(nums1[si]);
                si++;
                si1++;
            }
        }
        int arr[] = new int[lst.size()];
        for(int i =0;i<lst.size();i++){
            arr[i] = lst.get(i);
        }
        return arr;
    }
}