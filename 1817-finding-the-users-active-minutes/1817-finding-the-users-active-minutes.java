class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int arr[] = new int[k];
        List<Integer> lst = new ArrayList<>();
        Arrays.sort(logs,(a,b) -> a[0]-b[0]);
        HashSet<Integer> map = new HashSet<>();
        int count = 1;
        map.add(logs[0][1]);
        for(int i = 0;i<logs.length-1;i++){
            if(logs[i][0] == logs[i+1][0]){
                if(!map.contains(logs[i+1][1])){
                    map.add(logs[i+1][1]);
                    count++;
                }
            }else{
                lst.add(count);
                count = 1;
                map.clear();
                map.add(logs[i+1][1]);
            }
        }
        lst.add(count);
        Collections.sort(lst);
        int j = 0;
        int i = 0;
        int count1 = 0;
        while(i < arr.length && j < lst.size()){
            if(i+1 == lst.get(j)){
                count1++;
                j++;
            }else{
                arr[i] = count1;
                count1 = 0;
                i++;
            }
        }
        if(i < arr.length){
            arr[i] = count1;
        }

        i++;

        while(i < arr.length){
            arr[i] = 0;
            i++;
        }
        return arr;

    }
}