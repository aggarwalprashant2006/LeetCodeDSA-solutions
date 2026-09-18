class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        char arr[][] = new char[boxGrid[0].length][boxGrid.length];
        for(int i = 0; i< boxGrid.length;i++){
            int ei = boxGrid[0].length-1;
            int si = ei-1;
            while(si >= 0){
                if(boxGrid[i][ei] == '.' && boxGrid[i][si] == '#'){
                    char str = boxGrid[i][ei];
                    boxGrid[i][ei] = boxGrid[i][si];
                    boxGrid[i][si] = str;
                    ei--;
                    si = ei-1;
                }else if(boxGrid[i][ei] == '.' && boxGrid[i][si] == '.'){
                    si--;
                }else if(boxGrid[i][si] == '*' || boxGrid[i][ei] == '*'){
                    ei = si;
                    si--;
                }
                else{
                    ei--;
                    si= ei-1;
                }
            }
        }
        for(int i =0;i<boxGrid.length;i++){
            for(int j = 0;j<boxGrid[0].length;j++){
                arr[j][boxGrid.length-1-i] = boxGrid[i][j];
            }
        }
        return arr;
    }
}