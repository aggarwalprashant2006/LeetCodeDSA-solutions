class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] == b[0]) {
            return Integer.compare(b[1], a[1]);
        }
        return Integer.compare(a[0], b[0]);
        });
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i =0;i<envelopes.length;i++){
            if(lst.size()==0 || lst.get(lst.size()-1) < envelopes[i][1]){
                lst.add(envelopes[i][1]);
            }else{
                lcs(lst,envelopes[i][1]);
            }
        }
        return lst.size();
    }
    public void lcs(ArrayList<Integer> lst,int a){
            int si = 0;
            int ei = lst.size()-1;
            int lb = -1;
            while(si<= ei){
                int mid = si+(ei-si)/2;
                if(lst.get(mid) >= a){
                    lb = mid;
                    ei = mid-1;
                }
                else{
                    si = mid+1;
                }
            }
            lst.set(lb,a);
    }
}