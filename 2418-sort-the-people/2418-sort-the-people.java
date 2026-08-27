class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String arr[][] = new String[names.length][2];
        for(int i = 0;i < names.length ; i++){
            arr[i][0] = names[i];
            arr[i][1] = String.valueOf(heights[i]);
        }
        Arrays.sort(arr,(a,b) -> Integer.parseInt(b[1]) - Integer.parseInt(a[1]));
        for(int i =0;i<names.length;i++){
            names[i] = arr[i][0];
        }
        return names;
    }
}