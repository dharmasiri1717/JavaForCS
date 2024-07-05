import java.util.Random;

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        
        char[][] grid = new char[m][n];
        Random random = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '0';
            }
        }
        
        for (int i = 0; i < k; i++) {
            int x, y;
            do {
                x = random.nextInt(m);
                y = random.nextInt(n);
            } while (grid[x][y] == '*'); 
            grid[x][y] = '*';
        }
        
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '*') {
                    continue;
                }
                int count = 0;
                for (int d = 0; d < dx.length; d++) {
                    int ni = i + dx[d];
                    int nj = j + dy[d];
                    if (ni >= 0 && ni < m && nj >= 0 && nj < n && grid[ni][nj] == '*') {
                        count++;
                    }
                }
                grid[i][j] = (char) (count + '0');
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j]);
                if (j < n - 1) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
