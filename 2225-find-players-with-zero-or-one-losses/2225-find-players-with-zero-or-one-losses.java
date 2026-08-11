class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashSet<Integer> map1 = new HashSet<>();
        HashSet<Integer> map2 = new HashSet<>();
        HashSet<Integer> map3 = new HashSet<>();
        for(int i =0;i<matches.length;i++){
            int a = matches[i][0];
            int b = matches[i][1];
            if((!map2.contains(a) && !map3.contains(a))&& !map1.contains(a)){
                map1.add(a);
            }else{
                if(map2.contains(a) || map2.contains(a)){
                    map1.remove(a);
                }
            }
            if(!map2.contains(b) && !map3.contains(b)){
                map2.add(b);
                map1.remove(b);
            }else{
                if(map2.contains(b)){
                    map2.remove(b);
                    map3.add(b);
                }
            }
        }
        List<Integer> lst1 = new ArrayList<>(map1);
        List<Integer> lst2 = new ArrayList<>(map2);
        Collections.sort(lst1);
        Collections.sort(lst2);
        List<List<Integer>> list = new ArrayList<>();
        list.add(lst1);
        list.add(lst2);
        return list;
    }
}