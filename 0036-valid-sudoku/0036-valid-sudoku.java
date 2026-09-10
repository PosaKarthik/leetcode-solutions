class Solution {
    public boolean isValidSudoku(char[][] board) {

        List<HashSet<Character>> rows = new ArrayList<>();
        List<HashSet<Character>> columns = new ArrayList<>();
        List<HashSet<Character>> three = new ArrayList<>();

        for(int i=0;i<board.length;i++){
            HashSet<Character> hashSet = new HashSet<>();
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] != '.'){
                if(!hashSet.contains(board[i][j])){
                    hashSet.add(board[i][j]);
                }else{
                    return false;
                }
                }

            }
            // rows.add(hashSet);
        }

        for(int i=0;i<board.length;i++){
            HashSet<Character> hashSet = new HashSet<>();
            for(int j=0;j<board[0].length;j++){
                if(board[j][i] != '.'){
                if(!hashSet.contains(board[j][i])){
                    hashSet.add(board[j][i]);
                }else{
                    return false;
                }
                }

            }
            // columns.add(hashSet);
        }


        for(int startRow = 0;startRow<9;startRow+=3){
            for(int startColumn=0;startColumn<9;startColumn+=3){
                HashSet<Character> hashSet=new HashSet<>();
                for(int i=startRow;i<startRow+3;i++){
                    
                    for(int j=startColumn;j<startColumn+3;j++){
                        if(board[i][j] != '.'){
                        if(!hashSet.contains(board[i][j])){
                            hashSet.add(board[i][j]);
                        }else{
                            return false;
                        }
                        }
                        // three.add(hashSet);
                    }
                }
            }
        }

        return true;
        
    }
}