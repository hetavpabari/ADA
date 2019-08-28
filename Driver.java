
class Example {
	public void inPlaceSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int min = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]) min = j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		System.out.println("The sorted array is: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
}
}
class Driver{
	public static void main(String[] args){
		int[] arr = {5,9,-1,-2,6,7};
		new Example().inPlaceSort(arr);
	}
}