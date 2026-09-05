class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int arr[] = new int[nums.length];
        int si = 0;
        while(si < nums.length){
            int ei = si+1;
            int count = 0;
            while(ei < nums.length){
                if(nums[ei] > nums[si]){
                    arr[si] = nums[ei];
                    count++;
                    break;
                }
                ei++;
            }
            if(count == 0){
                ei = 0;
                while(ei < si){
                    if(nums[ei] > nums[si]){
                        arr[si] = nums[ei];
                        count++;
                        break;
                    }
                    ei++;
                }
            }
            if(count == 0){
                arr[si] = -1;
            }
            si++;
        }
        return arr;
    }
}