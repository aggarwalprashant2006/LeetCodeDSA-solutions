class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int max = 0;
        int i =0;
        int count = 0;
        while(i < s.length() && count < maxCost){
            count += Math.abs((s.charAt(i)-'a') - (t.charAt(i)-'a'));
            i++;
        }
        max = Math.max(max,i-1);
        int j = i-1;
        int a = 0;
        while(j < s.length()){
            if(j >= i){
                count += Math.abs((s.charAt(j)-'a') - (t.charAt(j)-'a'));
            }
            while(count > maxCost){
                count -= Math.abs((s.charAt(a)-'a') - (t.charAt(a)-'a'));
                a++;
            }
            max = Math.max(max,j-a+1);
            j++;
        }
        return max;
    }
}