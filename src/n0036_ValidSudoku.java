import java.util.HashSet;
import java.util.Set;

/**
 * @author: chende
 * @date: 2019/10/26 19:32
 * @description: https://leetcode.com/problems/valid-sudoku/
 *
 * Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.

 */
public class n0036_ValidSudoku {

    /**
     *  别人的solution
     Collect the set of things we see, encoded as strings. For example:
     '4' in row 7 is encoded as "(4)7".
     '4' in column 7 is encoded as "7(4)".
     '4' in the top-right block is encoded as "0(4)2".
     * @param board
     * @return
     */
    public boolean isValidSudokuSlotion(char[][] board) {
        Set seen = new HashSet();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                if (board[i][j] != '.') {
                    String b = "(" + board[i][j] + ")";
                    if (!seen.add(b + i) || !seen.add(j + b) || !seen.add(i/3 + b + j/3))
                        return false;
                }
            }
        }
        return true;
    }


    //这样写 代码风格太low了

    public boolean isValidSudoku(char[][] board) {
      return check33(board)&&checkColumn(board)&&checkRow(board);
    }

    /**
     * 检查行
     * @return
     */
    boolean checkRow(char[][] board){

        int len=board.length;
        for (int i=0;i<len;i++){
            int[] hash=new int[10];
            for (int j=0;j<len;j++){
                char ch=board[i][j];
                if (ch=='.') continue;
                int num=ch-'0';
                if (hash[num]>0) return false;
                else {
                    hash[num]=1;
                }
            }
        }
        return true;
    }
    //检查列
    boolean checkColumn( char[][] board){
        int len=board.length;
        for (int i=0;i<len;i++){
            int[] hash=new int[10];
            for (int j=0;j<len;j++){
                char ch=board[j][i];
                if (ch=='.') continue;
                int num=ch-'0';
                if (hash[num]>0) return false;
                else {
                    hash[num]=1;
                }
            }
        }
        return true;
    }

    public boolean check33(char[][] board){

        for (int i=0;i<board.length;i=i+3){
            for (int j=0;j<board.length;j=j+3){
              if (! check3X3(i,j,board))
                  return false;
            }

        }
        return true;
    }

    boolean check3X3(int x,int y,char[][] board){
        int[] hash=new int[10];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                char ch=board[i+x][j+y];
                if (ch=='.') continue;
             int num=ch-'0';
             if (hash[num]>0) return false;
             else {
                 hash[num]=1;
             }

            }
        }

        return true;
    }
}
