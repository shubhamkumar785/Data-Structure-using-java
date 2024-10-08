//  backtracking "ABC"

public class ds14_backtracking {
    public static void printPermutation(String s, String perm, int index) {
        if (s.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            String newStr = s.substring(0, i) + s.substring(i + 1);
            printPermutation(newStr, perm + currChar, index + 1);
        }
    }
    public static void main(String[] args) {
        String s = "ABC";
        printPermutation(s, "", 0);
    }
}













// import java.util.ArrayList;
// import java.util.List;

// public class ds14_backtracking {
//     public boolean isSafe(int row, int col, char[][] board){
//         // horizontal check
//         for(int j=0; j<board.length; j++){
//             if(board[row][j] == 'Q'){
//                 return false;
//             }
//         }
//         // vertical check
//         for(int i=0; i<board[0].length; i++){
//             if(board[i][col] == 'Q'){
//                 return false;
//             }
//         }
//         //  upper left
//         int r = row;
//         for(int c = col; c>=0 && r>=0; c--, r--){
//             if(board[r][c] == 'Q'){
//                 return false;
//             }
//         }
//         //  upper right
//         r = row;
//         for(int c = col; col<board.length && r>=0; r--, c++){
//             if(board[r][c] == 'Q'){
//                 return false;
//             }
//         }
//         //  lower left
//         r = row;
//         for(int c = col; col>=0 && r<board.length; r++,c--){
//             if(board[r][c] == 'Q'){
//                 return false;
//             }
//         }
//         //  lower right
//         for(int c =col; col<board.length && r<board.length; c++, r++){
//             if(board[r][c] == 'Q'){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public void saveBoard(char [][] board, List<List<String> allBoards){
//         String row ="";
//         List<String> board = new ArrayList<>();

//         for(int i=0; i<board.length; i++){
//             row = "";
//             for(int j=0; j<board[0].length; j++){
//                 if(board[i][j] == 'Q'){
//                     row += 'Q';
//                 }
//                 else{
//                     row += ".";
//                 }
//             }
//             newBoard.add(row);
//         }
//         allBoards.add(newBoard);
//     }
//     public void helper(char [][] board, List<List<String> allBoards, int col){
//         if(col == board.length){
//             saveBoard(board, allBoards);
//             return;
//         }
//         for(int row =0; row<board.length; row++){
//             if(isSafe(row, col, board)){
//                 board[row][col] = 'Q';
//                 helper(board, allBoards, col+1);
//                 board[row][col] = '.';
//             }
//         }
//     }
//     public List<List<String>> solveNqueens(int n) {
//         List<List<String> allBoards = new ArrayList<>();
//         char [][] board = new board[n][n];

//         helper(board, allBoards, 0);
//         return allBoards;
//     }
// }