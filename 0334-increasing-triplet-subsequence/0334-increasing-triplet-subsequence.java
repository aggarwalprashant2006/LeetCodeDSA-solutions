class Solution {
    public boolean increasingTriplet(int[] nums) {
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(lst.size() == 0 || lst.get(lst.size()-1)<nums[i]){
                lst.add(nums[i]);
            }else{
                lis(lst,nums[i]);
            }
            if(lst.size() == 3){
                return true;
            }
        }
        return false;
    }
    public void lis(ArrayList<Integer> lst ,int a){
        int si = 0;
        int ei = lst.size()-1;
        int lb = -1;
        while(si <= ei){
            int mid = si+(ei-si)/2;
            if(lst.get(mid) >= a){
                lb = mid;
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }
        lst.set(lb,a);
    }
}