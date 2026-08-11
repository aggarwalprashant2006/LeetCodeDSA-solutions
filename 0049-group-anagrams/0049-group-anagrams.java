class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        String arr1[][] = new String[strs.length][2];
        for(int i =0;i<strs.length;i++){
            char arr[] = strs[i].toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            arr1[i][0] = strs[i];
            arr1[i][1] = str;
        }
        Arrays.sort(arr1, (a, b) -> a[1].compareTo(b[1]));
        List<String> lst = new ArrayList<>();
        for(int i =0;i<arr1.length-1;i++){
            if(arr1[i][1].equals(arr1[i+1][1])){
                lst.add(arr1[i][0]);
            }else{
                lst.add(arr1[i][0]);
                list.add(lst);
                lst = new ArrayList<>();
            }
        }
        lst.add(arr1[arr1.length-1][0]);
        list.add(lst);
        return list;
    }
}