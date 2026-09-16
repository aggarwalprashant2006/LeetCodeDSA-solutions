class Solution {
    public int[] frequencySort(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        int arr[][] = new int[set.size()][2];
        Arrays.sort(nums);
        int j = 0;
        int count = 1;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                count++;
            }else{
                arr[j][0] = nums[i];
                arr[j][1] = count;
                count = 1;
                j++;
            }
        }
        arr[j][0] = nums[nums.length-1];
        arr[j][1] = count;
        Arrays.sort(arr,(a,b) -> {
        if(a[1] == b[1]){
            return b[0]-a[0];
        }
        return a[1]-b[1];
        });
        int si = 0;
        int k = 0;
        while(si < nums.length){
            if(arr[k][1] >= 1){
                nums[si] = arr[k][0];
                arr[k][1]--;
                si++;
            }else{
                k++;
            }
        }
        return nums;
    }
}