class Solution {
    public int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int count = 0;
        int ei = ages.length-1;
        int si = ei-1;
        while(si >= 0){
            int a = (int)(0.5*ages[ei]+7);
            if((ages[si] <= a || ages[si] > ages[ei] )|| (ages[si] > 100 && ages[ei]<100)){
                ei--;
                si = ei-1;
            }else{
                if(ages[si] == ages[ei]){
                    count+= 2;
                    si--;
                }else{
                    count++;
                    si--;
                }if(si < 0 && ei != si+1){
                    ei--;
                    si= ei-1;
                }
            }
        }
        return count;
    }
}