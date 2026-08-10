class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> map = new HashSet<>();
        List<Integer> lst = new ArrayList<>();
        Arrays.sort(nums);
        int i = nums.length-1;
        while(k > 0 && i >= 0){
            if(!map.contains(nums[i])){
                map.add(nums[i]);
                lst.add(nums[i]);
                k--;
            }
            i--;
        }
        int arr[] = new int[lst.size()];
        for(int j =0;j<lst.size();j++){
            arr[j] = lst.get(j);
        }
        return arr;
    }
}