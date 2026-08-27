class Solution {
    public int findCenter(int[][] edges) {
        int a = edges[0][0];
        int b = edges[0][1];
        for(int i = 1;i < edges.length;i++){
            if(edges[i][0] == a || edges[i][1] == a){
                b = 0;
                break;
            }else{
                a = 0;
            }
        }
        if(a == 0){
            return b;
        }
        return a;
    }
}