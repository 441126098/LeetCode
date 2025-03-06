public class Devide {
    public int regionsBySlashes(String[] grid) {
        int ans = 0;
        int[][] squre = new int[grid.length * 3][grid[0].length() * 3];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length(); j++) {
                switch (grid[i].charAt(j)) {
                    case ' ':
                        continue;
                    case '/':
                        for (int k = 0; k < 3; k++) {
                            squre[3 * i + 2 - k][3 * j + k] = 1;
                        }
                        ;
                        break;
                    case '\\':
                        for (int k = 0; k < 3; k++) {
                            squre[3 * i + k][3 * j + k] = 1;
                        }
                }
            }
        }
        for (int i = 0; i < squre.length; i++) {
            for (int j = 0; j < squre[i].length; j++) {
                System.out.print(squre[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < squre.length; i++) {
            for (int j = 0; j < squre[i].length; j++) {
                if (squre[i][j] == 0) {

                    dfs(squre, i, j);
                    ans += 1;
                    System.out.println(ans + ":" + i + j);
                }
            }
        }
        return ans;
    }

    void dfs(int[][] g, int i, int j) {
        if (i >= 0 && i < g.length && j >= 0 && j < g[0].length && g[i][j] == 0) {
            g[i][j] = 1;
            dfs(g, i + 1, j);
            dfs(g, i - 1, j);
            dfs(g, i, j + 1);
            dfs(g, i, j - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print(new Devide().regionsBySlashes(new String[]{"/\\", "\\/"}));
    }
}
