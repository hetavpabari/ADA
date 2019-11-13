
class CoinChange{
    int A;
    int[] C,S;
    
    CoinChange(int a){
        A = a;
        
        C = new int[A+1];
        S = new int[A+1];
        C[0]=0;
        S[0]=0;
        
    }
    int findMin(int[] d){
        int min=0;
        int coin = 0;
        int INF = 999;
        
        
        for(int p=1;p<=A;p++){
            min = INF;
            for(int i=0;i<d.length;i++){
            if(d[i] <= p) {
             if(1 + C[p - d[i]] < min) {
               min = 1 + C[p - d[i]];
               coin = i+1;
                     } 
                     }
                
            }
            C[p] = min;
            S[p] = coin;
        }
        for(int i=0;i<A+1;i++){
            System.out.print(S[i]+" ");
        }
       
        return C[A];
        
    }
    void findCoins(int[] d){
        System.out.print("Coins are: ");
        for(int i=A;i>0;i = i - d[S[i]]){
            
            
            System.out.println(d[S[i]]+" ");
            
        }
    }
}
public class Driver{
    public static void main(String[] args){
        int A = 6;
        int[] d = {1,2,5};
        CoinChange c = new CoinChange(A);
        System.out.println("The minimum number of coins are: "+c.findMin(d));
        c.findCoins(d);
    }
}
