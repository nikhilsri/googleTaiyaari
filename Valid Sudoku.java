class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set visited=new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char digit=board[i][j];
                if(digit!='.'){
                    if(!visited.add(digit+" in row "+i)||
                      !visited.add(digit+" in col "+j)||
                      !visited.add(digit+" in block "+(i/3)+"-"+(j/3))){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
