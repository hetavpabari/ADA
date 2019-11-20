
import java.lang.Math;
class Dijk{
	int[] d,vis;
	void shortestPath(int[][] c,int s){
		d = new int[c.length];
		vis = new int[c.length];
		for(int i=0;i<c.length;i++){
			if(i==s) d[i] = 0;
			d[i]=c[s][i];
		}
		for(int i=0;i<c.length;i++){
			if(i==s) vis[i] = 1;
			vis[i] = 0;
		}
		int count = 1;
		int u = 0;
		while(count!=c.length){
			int min = 999;
			for(int i=0;i<c.length;i++){
				if(d[i]<min && vis[i]!=1){
					min = d[i];
					u = i;
				}
			}
			count = count+1;	
			vis[u] = 1;
			for(int j=0;j<c.length;j++){
				if((min+c[u][j])<d[j]){
					d[j] = min + c[u][j];
				}
			}
		}
		System.out.println("The shortest path from source to all vertices is: ");
		for(int i=0;i<c.length;i++){
			
				System.out.println(s+" "+d[i]+" "+i);
		}
	}
			
}
class Driver{
	public static void main(String[] args) 
    { 
	Dijk D = new Dijk();
        
        int graph[][] = new int[][] { { 0, 4, 1000, 1000, 1000, 1000, 1000, 8, 1000 }, 
                                      { 4, 0, 8, 1000, 1000, 1000, 1000, 11, 1000 }, 
                                      { 1000, 8, 0, 7, 1000, 4, 1000, 1000, 2 }, 
                                      { 1000, 1000, 7, 0, 9, 14, 1000, 1000, 1000 }, 
                                      { 1000, 1000, 1000, 9, 0, 10, 1000, 1000, 1000 }, 
                                      { 1000, 1000, 4, 14, 10, 0, 2, 1000, 1000 }, 
                                      { 1000, 1000, 1000, 1000, 1000, 2, 0, 1, 6 }, 
                                      { 8, 11, 1000, 1000, 1000, 1000, 1, 0, 7 }, 
                                      { 1000, 1000, 2, 1000, 1000, 1000, 6, 7, 0 } }; 
        
        D.shortestPath(graph, 0); 
    } 
} 

