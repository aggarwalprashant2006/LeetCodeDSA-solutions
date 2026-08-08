class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> lst= new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            List<Integer> list = new ArrayList<>();
            while(nums[i] > 0){
                list.add(nums[i]%10);
                nums[i] /= 10;
            }
            Collections.reverse(list);
            lst.addAll(list);
        }
        int arr[] = new int[lst.size()];
        for(int i =0;i<lst.size();i++){
            arr[i]  = lst.get(i);
        }
        return arr;
    }
}