class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> lst = new ArrayList<>();
        int i = 0;
        int a = 0;
        int max = 0;
        while(i < s.length()){
            int si = i;
            int ei = s.length()-1;
             a = max;
             max = 0;
            HashSet<Character> map = new HashSet<>();
            while(s.charAt(si) != s.charAt(ei)){
                ei--;
            }
            while(si <= ei){
                map.add(s.charAt(si));
                si++;
            }
            while(ei < s.length()){
                if(map.contains(s.charAt(ei))){
                    while(si <= ei && si!= ei){
                        map.add(s.charAt(si));
                        si++;
                    }
                    max = ei+1;
                }
                ei++;
            }
            i = max;
            lst.add(max-a);
        }
        return lst;
    }
}