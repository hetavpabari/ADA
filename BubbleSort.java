package ada2;

public class BubbleSort {
 void sort(int[] arr,int k,int n ) {
	 for(int i=0;i<k-1;i++) {
		 for(int j=0;j<n-1-i;j++) {
			 if(arr[j]>arr[j+1]) {
				 int temp = arr[j+1];
				 arr[j+1] = arr[j];
				 arr[j] = temp;
			 }
			 
		 }
	 }
	 System.out.println("The largest elements are: ");
	 for(int i=n-k;i<n;i++) {
		 System.out.println(arr[i]+ " ");
	 }
	 
}
}
class Driver{
	public static void main(String[] args) {
		int[] arr = {10,9,1,2,3,4};
		new BubbleSort().sort(arr,4,6);
	}
}