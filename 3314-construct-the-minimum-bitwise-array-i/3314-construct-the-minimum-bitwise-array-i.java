class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int arr[] = new int[nums.size()];
        for(int i =0;i<nums.size();i++){
            arr[i] = -1;
            for(int a =0;a<nums.get(i);a++){
                if((a|(a+1)) == nums.get(i)){
                    arr[i] = a;
                    break;
                }
            }
            
        }
        return arr;
    }
}