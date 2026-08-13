class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        if(groupSizes.length == 1){
            return new ArrayList<>(List.of(List.of(0)));
        }
        List<List<Integer>> list = new ArrayList<>();
        int arr[][] = new int[groupSizes.length][2];
        for(int i =0;i<groupSizes.length;i++){
            arr[i][0] = groupSizes[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr,(a,b) -> a[0]-b[0]);
        List<Integer> lst = new ArrayList<>();
        for(int i =0;i<arr.length-1;i++){
            if(arr[i][0] == arr[i+1][0] && lst.size()+1 < arr[i][0]){
                lst.add(arr[i][1]);
            }else{
                lst.add(arr[i][1]);
                list.add(lst);
                lst = new ArrayList<>();
            }
        }
        if(arr[arr.length-1][0] == arr[arr.length-2][0] && lst.size()+1 < arr[arr.length-1][0]){
                lst.add(arr[arr.length-1][1]);
                list.add(lst);
            }else{
                lst.add(arr[arr.length-1][1]);
                list.add(lst);
            }
        return list;
    }
}