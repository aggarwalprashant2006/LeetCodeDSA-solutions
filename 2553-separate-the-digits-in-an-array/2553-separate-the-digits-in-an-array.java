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
            for(int j =0;j<list.size();j++){
                lst.add(list.get(j));
            }
        }
        int arr[] = new int[lst.size()];
        for(int i =0;i<lst.size();i++){
            arr[i]  = lst.get(i);
        }
        return arr;
    }
}