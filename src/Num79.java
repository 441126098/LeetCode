/*给定一个 m x n 二维字符网格 board 和一个字符串单词 word 。如果 word 存在于网格中，返回 true ；否则，返回 false 。

        单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。

        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/word-search
        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

public class Num79 {
    private int [][]direction = {{-1,0},{0,-1},{1,0},{0,1}};

    public boolean exist(char[][] board, String word) {

        if (board==null)
            return false;
        boolean selceted[][] = new boolean[board.length][board[0].length];

        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                if (board[i][j]==word.charAt(0))
                    if(dfs(board,i,j,word,0,selceted))
                        return true;

            }
        }
        return false;
    }

    boolean dfs(char[][] board, int i,int j,String word,int index,boolean[][]selected){
        if (!(board[i][j]==word.charAt(index)))
            return false;
        else {
            if (index == word.length()-1)
                return true;
            selected[i][j] = true;
            for (int[] dir : direction) {
                int newi = i + dir[0];
                int newj = j + dir[1];
                if (newi < 0 || newi >= board.length)
                    continue;
                if (newj < 0 || newj >= board[i].length)
                    continue;
                if (selected[newi][newj])
                    continue;
                if(dfs(board, newi, newj, word, index + 1, selected))
                    return true;
            }
            selected[i][j] = false;
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = new char[][] {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };
        String word = "ABCCED";
        boolean exist = new Num79().exist(board, word);
        System.out.println(exist);
    }

}
