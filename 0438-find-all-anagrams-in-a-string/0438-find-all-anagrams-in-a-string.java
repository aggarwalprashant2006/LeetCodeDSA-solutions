class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lst = new ArrayList<>();
        char ch[] = p.toCharArray();
        Arrays.sort(ch);
        String str3 = new String(ch);
        int si = 0;
        int ei = p.length()-1;
        while(ei < s.length()){
            char[] arr2 = new char[p.length()];
            int a = si;
            int i =0;
            while(a<ei+1){
                arr2[i] = s.charAt(a);
                a++;
                i++;
            }
            Arrays.sort(arr2);
            String str = new String(arr2);
            if(str3.equals(str)){
                lst.add(si);
            }
            ei++;
            si++;
        }
        return lst;
    }
}