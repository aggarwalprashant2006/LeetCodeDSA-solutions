class Solution {
    public void gameOfLife(int[][] board) {
        int arr[][] = new int[board.length][board[0].length];
        for(int i =0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                arr[i][j] = board[i][j];
            }
        }
        for(int i =0;i<board.length;i++){
            for(int j =0;j<board[0].length;j++){
                int max2 = 0;
                if(i+1 < board.length){
                    if(arr[i+1][j] == 1){
                        max2++;
                    }
                }
                if(j+1 < board[0].length){
                    if(arr[i][j+1] == 1){
                        max2++;
                    }
                }
                if(i+1 < board.length && j+1 < board[0].length){
                    if(arr[i+1][j+1] == 1){
                        max2++;
                    }
                }
                if(i-1 >= 0){
                    if(arr[i-1][j] == 1){
                        max2++;
                    }
                }
                if(i-1 >= 0 && j+1 < board[0].length){
                    if(arr[i-1][j+1] == 1){
                        max2++;
                    }
                }
                if(i-1 >= 0 && j-1 >= 0){
                    if(arr[i-1][j-1] == 1){
                        max2++;
                    }
                }
                if(j-1 >= 0){
                    if(arr[i][j-1] == 1){
                        max2++;
                    }
                }
                if(i+1 < board.length && j-1 >= 0){
                    if(arr[i+1][j-1] == 1){
                        max2++;
                    }
                }
                if(arr[i][j] == 1){
                    if(max2 < 2){
                        board[i][j] = 0;
                    }else if(max2 > 3){
                        board[i][j] = 0;
                    }
                }else{
                    if(max2 == 3){
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
}