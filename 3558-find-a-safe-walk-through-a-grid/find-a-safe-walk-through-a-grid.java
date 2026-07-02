import java.util.*;

class Solution { 
    public boolean findSafeWalk(List<List<Integer>> grid, int health) { 
        int m = grid.size();
        int n = grid.get(0).size(); 
        
        // dist[i][j] stores the minimum health lost to reach cell (i, j)
        int[][] dist = new int[m][n]; 
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE); 
        }
        
        // Base case: Starting cell costs whatever is on grid
        dist[0][0] = grid.get(0).get(0); 
        
        // Double-ended queue for 0-1 BFS
        Deque<int[]> dq = new ArrayDeque<>(); 
        dq.addFirst(new int[]{0, 0}); 
        
        // Direction vectors for moving Down, Up, Right, Left
        int[] dx = {1, -1, 0, 0}; 
        int[] dy = {0, 0, 1, -1}; 
        
        while (!dq.isEmpty()) { 
            int[] cur = dq.pollFirst(); 
            int x = cur[0];
            int y = cur[1]; 
            
            // Explore all 4 adjacent neighbors
            for (int k = 0; k < 4; k++) { 
                int nx = x + dx[k];
                int ny = y + dy[k]; 
                
                // Skip out-of-bounds cells
                if (nx < 0 || ny < 0 || nx >= m || ny >= n) {
                    continue; 
                }
                
                // Weight is 0 for an empty cell, 1 for an obstacle cell
                int w = grid.get(nx).get(ny); 
                
                // Relaxation step: Check if a cheaper path to neighbor is found
                if (dist[x][y] + w < dist[nx][ny]) { 
                    dist[nx][ny] = dist[x][y] + w; 
                    
                    // 0-cost moves go to the front; 1-cost moves go to the back
                    if (w == 0) {
                        dq.addFirst(new int[]{nx, ny}); 
                    } else {
                        dq.addLast(new int[]{nx, ny}); 
                    }
                } 
            } 
        } 
        
        // Walk is safe if total health lost is strictly less than starting health
        return dist[m - 1][n - 1] < health; 
    } 
}
