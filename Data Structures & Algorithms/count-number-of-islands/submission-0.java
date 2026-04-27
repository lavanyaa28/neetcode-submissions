class Pair{
    int first;
    int second;

    public Pair(int f, int s)
    {
        this.first=f;
        this.second=s;
    }
}
class Solution {
    public int numIslands(char[][] grid) {

        boolean[][] vis = new boolean[grid.length][grid[0].length];
        int count = 0;

        for(int i = 0 ; i < grid.length; i++)
        {
            for(int j=0;j<grid[i].length; j++)
            {
                if( grid[i][j] != '0' && vis[i][j]==false)
                {
                    bfs(grid, vis, i, j);
                    count++;
                }
            }
        }

        return count;
        
    }

    public void bfs(char[][] grid, boolean[][] vis, int row, int col)
    {
        int m=grid.length;
        int n=grid[0].length;
        Queue<Pair> q= new LinkedList<>();
        Pair p1=new Pair(row, col);
        q.add(p1);

        while(!q.isEmpty())
        {
            row=q.peek().first;
            col=q.peek().second;
            q.remove();
            int[] dRow = {-1, 1, 0, 0}; // up, down
            int[] dCol = {0, 0, -1, 1}; // left, right

            for (int i = 0; i < 4; i++) {
                int nRow = row + dRow[i];
                int nCol = col + dCol[i];

                if (nRow >= 0 && nRow < m && nCol >= 0 && nCol < n &&
                    grid[nRow][nCol] != '0' && !vis[nRow][nCol]) {
                    
                    vis[nRow][nCol] = true;
                    q.add(new Pair(nRow, nCol));
                }
            }
        }        
    }
}

