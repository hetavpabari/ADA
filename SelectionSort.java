package ada2;

public class SelectionSort {
	void sort(int[] arr,int n,int k) {
		int min;
		for(int i=0;i<k;i++) {
			min = i;
			for(int j=i;j<n;j++) {
				if(arr[min]>arr[j])
					min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;		
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("The kth smallest element is: "+arr[k-1]);
	}

}
class Ex{
	public static void main(String[] args) {
		int[] a = {1,5,-1,4,6,7};
		new SelectionSort().sort(a, 6, 5);
	}
}
