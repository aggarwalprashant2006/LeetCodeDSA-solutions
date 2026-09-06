class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        int si = 0;
        int si1 = 0;
        while(si < nums1.length && si1 < nums2.length){
            List<Integer> lst = new ArrayList<>();
            if(nums1[si][0] == nums2[si1][0]){
                lst.add(nums1[si][0]);
                lst.add(nums1[si][1]+nums2[si1][1]);
                si++;
                si1++;
            }else if(nums1[si][0] > nums2[si1][0]){
                lst.add(nums2[si1][0]);
                lst.add(nums2[si1][1]);
                si1++;
            }else{
                lst.add(nums1[si][0]);
                lst.add(nums1[si][1]);
                si++;
            }
            list.add(lst);
        }
        while(si < nums1.length){
            List<Integer> lst = new ArrayList<>();
            lst.add(nums1[si][0]);
            lst.add(nums1[si][1]);
            list.add(lst);
            si++;
        }
        while(si1 < nums2.length){
            List<Integer> lst = new ArrayList<>();
            lst.add(nums2[si1][0]);
            lst.add(nums2[si1][1]);
            list.add(lst);
            si1++;
        }
        int arr[][] =new int[list.size()][2];
        for(int i =0;i<arr.length;i++){
            arr[i][0] = list.get(i).get(0);
            arr[i][1] = list.get(i).get(1);
        }
        return arr;
    }
}