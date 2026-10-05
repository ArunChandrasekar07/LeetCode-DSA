class Solution {
    public void change(char[][] board,int i,int j,int r,int c){
        if(i>=0 && i<r && j>=0 && j<c){
            if(board[i][j]=='O'){
                board[i][j]='T';
                change(board,i+1,j,r,c);
                change(board,i-1,j,r,c);
                change(board,i,j+1,r,c);
                change(board,i,j-1,r,c);
            }
        }
    }
    public void solve(char[][] board) {
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++){
            if(board[i][0]=='O'){
                change(board,i,0,r,c);
            }
        }
        for(int i=0;i<r;i++){
            if(board[i][c-1]=='O'){
                change(board,i,c-1,r,c);
            }
        }
        for(int j=0;j<c;j++){
            if(board[0][j]=='O'){
                change(board,0,j,r,c);
            }
        }
        for(int j=0;j<c;j++){
            if(board[r-1][j]=='O'){
                change(board,r-1,j,r,c);
            }
        }
        for(int m=0;m<r;m++){
            for(int n=0;n<c;n++){
                if(board[m][n]=='O'){
                    board[m][n]='X';
                }
                else if(board[m][n]=='T'){
                    board[m][n]='O';
                }
            }
        }
    }
}