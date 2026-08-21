class Solution {
    public int[] processQueries(int[] queries, int m) {
        int arr[] = new int[queries.length];
        List<Integer> lst = new ArrayList<>();
        for(int i = 1;i<=m;i++){
            lst.add(i);
        }
        int a = 0;
        int min = 0;
        for(int i =0;i<queries.length;i++){
            Queue<Integer> q = new LinkedList<>();
            for(int j = 0;j<lst.size();j++){
                if(lst.get(j) == queries[i]){
                    a = j;
                    min = lst.get(j);
                }
                q.offer(lst.get(j));
            }
            lst = new ArrayList<>();
            lst.add(min);
            while(!q.isEmpty()){
                if(q.peek() != min){
                    lst.add(q.poll());
                }else{
                    q.poll();
                }
            }

            arr[i] = a;
        }
        return arr;
    }
}