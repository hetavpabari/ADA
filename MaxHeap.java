class MaxHeap{
  static  boolean check(int[] arr){
  int n = arr.length;
    for(int i=0;i<n/2-1;i++){
      if(arr[i]<arr[2*i+1])
        return false;
      if(arr[i]<arr[2*i+2])
        return false;
    }
    return true;
  }
 public static void main(String args[]){
   int[] a = new int[]{9,15,12,7,10,11};
   if(check(a)) System.out.println("It is max heap");
   else{
     System.out.println("It is not max heap");
                        }
   }
}
