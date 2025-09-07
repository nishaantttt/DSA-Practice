class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j< n ; j++){
                board[i][j]='.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        nqueen(board,0,ans);   
        return ans;
    }
    public void nqueen(char[][] board, int row,List<List<String>> ans){
        int n = board.length;
        for(int j = 0 ; j < n ; j++){
            if(row==n){
                // copy 2d char array into ArrayList of string
                List<String> l= new ArrayList<>();
                for(int i =0 ; i<n ; i++){
                    String str = "";
                    for(int k =0 ; k<n ; k++){
                        str+=board[i][k];
                    }
                    l.add(str);
                }
                ans.add(l);
                return;
            }
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nqueen(board, row+1,ans);
                board[row][j]='.';
            }
        }
    }
    private boolean isSafe(char[][] board, int row, int col) {//col is the j from       previous fnction*/
        //we have to write 6 conditions
        //1.check row
        int n = board.length;
        for(int j = 0 ; j < n ;j++){
            if(board[row][j]=='Q') return false;
        }

        //2.check column
        for(int i = 0 ; i < n ;i++){
            if(board[i][col]=='Q') return false;
        }

        //3. check north east
        int i = row;
        int j = col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }

        //4. check south east
        i=row;
        j=col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }

        //5.south east
        i=row;
        j=col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }

        //6.south west
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }



    return true; 
    }

}