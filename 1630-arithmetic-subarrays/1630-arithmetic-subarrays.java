class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> lst = new ArrayList<>();
        for(int i =0;i<l.length;i++){
            List<Integer> list = new ArrayList<>();
            for(int j = l[i];j <= r[i];j++){
                list.add(nums[j]);
            }
            Collections.sort(list);
            int count = 0;
            int a = -1;
            for(int j = 1;j<list.size();j++){
                if(a == -1){
                    a = list.get(j)-list.get(j-1);
                }else if((list.get(j)-list.get(j-1)) != a){
                    count++;
                    break;
                }
            }
            if(count == 0){
                lst.add(true);
            }else{
                lst.add(false);
            }
        }
        return lst;
    }
}