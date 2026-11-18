class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 1;
        int x = 0;
        for(int i = 0; i < nums.size(); i++){
            map.put(nums.get(i), map.getOrDefault(nums.get(i), 0) + 1);
            int a = map.get(nums.get(i));
            if(max < a){
                max = a;
                x = nums.get(i);
            }
        }
        int b = max;
        for(int i =0;i<nums.size();i++){
            if(nums.get(i) == x){
                b--;
            }
            if(b != max){
                int c = max-b;
                if((c > ((i+1)/2)) && (b > (nums.size()-i-1)/2)){
                    return i;
                }
            }
        }
        return -1;
    }
}