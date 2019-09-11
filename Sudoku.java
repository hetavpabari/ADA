import java.lang.Math;
class Sudoku
{
 int N;
 int sqrt;
 Sudoku(int N){
 this.N = N;
 sqrt = (int)Math.sqrt(N);
}
 
 boolean isSafe(int[][] grid,  
                             int row, int col,  
                             int num)  
{ 
    
    for (int d = 0; d < grid.length; d++)  
    { 
        if (grid[row][d] == num)  
        { 
            return false; 
        } 
    } 
      
    
    for (int r = 0; r < grid.length; r++) 
    { 
  
        if (grid[r][col] == num) 
        { 
            return false; 
        } 
    } 
  
 
    int boxRowStart = row - row % sqrt; 
    int boxColStart = col - col % sqrt; 
  
    for (int r = boxRowStart; 
             r < boxRowStart + sqrt; r++)  
    { 
        for (int d = boxColStart;  
                 d < boxColStart + sqrt; d++)  
        { 
            if (grid[r][d] == num)  
            { 
                return false; 
            } 
        } 
    } 
  
  
    return true; 
} 
  
 boolean solveSudoku(int[][] grid, int n)  
{ 
    int row = -1; 
    int col = -1; 
    boolean isEmpty = true; 
    for (int i = 0; i < n; i++) 
    { 
        for (int j = 0; j < n; j++)  
        { 
            if (grid[i][j] == 0)  
            { 
                row = i; 
                col = j; 
                  
                isEmpty = false;  
                break; 
            } 
        } 
        if (!isEmpty) 
        { 
            break; 
        } 
    } 
  
  
    if (isEmpty)  
    { 
        return true; 
    } 
  
  
    for (int num = 1; num <= n; num++) 
    { 
        if (isSafe(grid, row, col, num)) 
        { 
            grid[row][col] = num; 
            if (solveSudoku(grid, n))  
            { 
 
                return true; 
            }  
            else
            { 
                grid[row][col] = 0; 
            } 
        } 
    } 
    return false; 
} 
}  
  
public class Driver{
public static void main(String args[]) 
{ 
    Sudoku s = new Sudoku(4);
    int[][] grid = new int[][] 
    { 
            {0,0,3,4},{3,4,0,0},{0,0,4,3},{0,3,2,0}
    }; 
    int N = grid.length; 
  
    if (s.solveSudoku(grid, N)) 
    { 
        for(int i=0;i<N;i++){
	   for(int j=0;j<N;j++){
		System.out.print(grid[i][j]+" ");
	   }
	System.out.println();
	}
    }  
    else
    { 
        System.out.println("No solution"); 
    } 
} 
} 