class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> lst = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        for(int i =0;i<intervals.length;i++){
            lst2.add(intervals[i][0]);
            lst2.add(intervals[i][1]);
            lst.add(lst2);
            lst2 = new ArrayList<>();
        }
        lst2.add(newInterval[0]);
        lst2.add(newInterval[1]);
        lst.add(lst2);
        lst.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> lst1 = new ArrayList<>();
        lst1.add(lst.get(0).get(0));
        int max = lst.get(0).get(1);
        for(int i = 1;i<lst.size();i++){
            if(max >= lst.get(i).get(0)){
                max = Math.max(max,lst.get(i).get(1));
            }else{
                lst1.add(max);
                list.add(lst1);
                lst1 = new ArrayList<>();
                lst1.add(lst.get(i).get(0));
                max = lst.get(i).get(1);
            }
        }
        lst1.add(max);
        list.add(lst1);
        int[][] ans = new int[list.size()][2];

        for(int i = 0; i < list.size(); i++){
            ans[i][0] = list.get(i).get(0);
            ans[i][1] = list.get(i).get(1);
        }
        return ans;
    }
}