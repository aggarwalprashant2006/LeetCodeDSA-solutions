class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count = 0;
        for(int i =0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(j != i){
                    String arr[] = new String[2];
                    arr[0] = nums[i];
                    arr[1] = nums[j];
                    String str = String.join("",arr);
                    if(str.equals(target)){
                     count++;
                    }
                }
            }
        }
        return count;
    }
}