class Solution {
    public int minSetSize(int[] arr) {
        Arrays.sort(arr);
        List<Integer> lst = new ArrayList<>();
        int count = 1;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                count++;
            }else{
                lst.add(count);
                count = 1;
            }
        }
        lst.add(count);
        Collections.sort(lst);
        int sum = arr.length;
        int ei = lst.size()-1;
        while(ei >= 0){
            sum -= lst.get(ei);
            if(sum <= arr.length/2){
                return lst.size()-ei;
            }
            ei--;
        }
        return -1;
    }
}