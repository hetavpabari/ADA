class NQueenProblem { 
    int N; 
    int[][] board;
    NQueenProblem(int N){
        this.N = N;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                board = new int[N][N];
                board[i][j]=0;}}        
  
    
    }
  
    
    boolean isSafe(int row, int col) 
    { 
        
        int i,j;  
        
        for (i = 0; i < col; i++) 
            if (board[row][i] == 1) 
                return false; 
  
        
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--){ 
            if (board[i][j] == 1) 
                return false;} 
  
        
        for ( i = row,  j = col; j >= 0 && i < N; i++, j--){
            if (board[i][j] == 1) 
                return false; }
  
        return true; 
    } 
  
    
    boolean solveNQUtil( int col) 
    { 
        
        if (col >= N){


     
        for (int i = 0; i < N; i++) { 
            for (int j = 0; j < N; j++) {
                System.out.print(" " + board[i][j] 
                                 + " "); }
            System.out.println(); 
        } 
      
            return true; }
  
        
        for (int i = 0; i < N; i++) { 
            
            if (isSafe( i, col)) { 
                
                board[i][col] = 1; 
  
                
                if (solveNQUtil(col + 1) == true) 
                    return true; 
  
                
                board[i][col] = 0; 
            } 
        } 
  
        
        return false; 
    } 
  
    }
    
  public class Driver{
    
    public static void main(String args[]) 
    { 
        NQueenProblem Queen = new NQueenProblem(4); 
        Queen.solveNQUtil(0);
    } 
}