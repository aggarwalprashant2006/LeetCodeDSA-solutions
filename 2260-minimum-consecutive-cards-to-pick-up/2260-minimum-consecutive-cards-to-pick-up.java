class Solution {
    public int minimumCardPickup(int[] cards) {
        HashSet<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int si = 0;
        for(int i =0;i<cards.length;i++){
            while(set.contains(cards[i])){
                min = Math.min(min,i-si+1);
                set.remove(cards[si]);
                si++;
            }
            set.add(cards[i]);
        }
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}