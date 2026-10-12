class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        int i = 0;
        int a = 0;

        while(i < nums.length && a < k){
            if(nums[i] % 2 != 0){
                a++;
            }
            i++;
        }

        if(a < k){
            return 0;
        }

        int j = i - 1;
        int c = 0;
        int b = k;
        a = 0;

        while(j < nums.length){
            if(j >= i && nums[j] % 2 != 0){
                b++;
                a = 0;
            }

            while(b == k){
                if(nums[c] % 2 != 0){
                    b--;
                }
                c++;
                a++;
            }

            count += a;
            j++;
        }

        return count;
    }
}