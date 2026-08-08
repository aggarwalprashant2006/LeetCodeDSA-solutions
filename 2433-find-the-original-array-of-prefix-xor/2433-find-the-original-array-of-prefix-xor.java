class Solution {
    public int[] findArray(int[] pref) {
        int a = pref[0];
        for(int i =1;i<pref.length;i++){
            int b = pref[i];
            pref[i] = a^b;
            a = a^pref[i];
        }
        return pref;
    }
}