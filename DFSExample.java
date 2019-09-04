import java.util.*; 
class Ex { 
    
    int V; 
    LinkedList<Integer>[] adjList; 
      
    
    Ex(int n) { 
        V = n; 
        
        adjList = new LinkedList[V]; 
  
        
  
        for(int i = 0; i < V ; i++){ 
            adjList[i] = new LinkedList<Integer>(); 
        } 
    } 
      
    
    void addEdge(int m,int n){       
        adjList[m].add(n); 
  
        
        adjList[n].add(m); 
    } 
      
    void DFS(int v, boolean[] visited) { 
         
        visited[v] = true; 
        System.out.print(v+" "); 
         
        for (int x : adjList[v]) { 
            if(!visited[x]) DFS(x,visited); 
        } 
  
    } 
    void connectedComponents() { 
        
        boolean[] visited = new boolean[V]; 
        for(int v = 0; v < V; ++v) { 
            if(!visited[v]) { 
                DFS(v,visited); 
                System.out.println(); 
            } 
        } 
    } 
     }
 public class DFSExample{ 
      
    
    public static void main(String[] args){ 
          
        Ex e = new Ex(5);  
          
        e.addEdge(1, 0);  
        e.addEdge(2, 3);  
        e.addEdge(3, 4); 
        
        e.connectedComponents(); 
    } 
}     
