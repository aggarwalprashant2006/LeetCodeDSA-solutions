class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        while(low <= high){
            int sum1 = 0;
            int sum2 = 0;
            List<Integer> lst = new ArrayList<>();
            int a = low;
            while(a > 0){
                lst.add(a%10);
                a /= 10;
            }
            if(lst.size()%2 == 0){
                int si = 0;
                int ei = lst.size()-1;
                while(si < ei){
                    sum1 += lst.get(si);
                    sum2 += lst.get(ei);
                    si++;
                    ei--;
                }
                if(sum1 == sum2){
                    count++;
                }
            }
            low++;
        }
        return count;
    }
}