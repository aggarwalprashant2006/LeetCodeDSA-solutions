class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < items1.length; i++){
            List<Integer> lst = new ArrayList<>();

            for(int j = 0; j < items2.length; j++){
                if(items1[i][0] == items2[j][0]){
                    items1[i][1] = items1[i][1] + items2[j][1];
                    break;
                }
            }

            lst.add(items1[i][0]);
            lst.add(items1[i][1]);
            list.add(lst);
        }

        // items2 ke jo items items1 me nahi mile, unhe add karo
        for(int i = 0; i < items2.length; i++){
            boolean found = false;

            for(int j = 0; j < items1.length; j++){
                if(items2[i][0] == items1[j][0]){
                    found = true;
                    break;
                }
            }

            if(!found){
                List<Integer> lst = new ArrayList<>();
                lst.add(items2[i][0]);
                lst.add(items2[i][1]);
                list.add(lst);
            }
        }

        Collections.sort(list, (a,b) -> a.get(0) - b.get(0));

        return list;
    }
}