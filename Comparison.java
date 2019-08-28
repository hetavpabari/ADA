
public class Comparison {
	public int count=0;
	void bubbleSort(int[] arr){
		int count=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				count++;
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("No. of comparisons for bubble sort: "+count);
	}
	void selectionSort(int[] a){
		int count=0;
		for(int i=0;i<a.length;i++){
			int min = i;
			for(int j=i+1;j<a.length;j++){
				count++;
				if(a[min]>a[j]){
					min = j;
				}
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
		System.out.println("No. of comparisons for selection sort: "+count);
	}
	
	void divideArr(int[] arr,int low,int high){
		if(low==high)
			System.out.println(arr[low]);
		else if(low<high){
			int mid =(low+high)/2;
			divideArr(arr,low,mid);
			divideArr(arr,mid+1,high);
			combine(arr,low,mid,high);
		}
	}
	
	
	void combine(int[] arr,int low,int mid,int high){
		int c[] = new int[arr.length];
	int i = low;
	int j = mid+1;
	int k = low;
	
	while(i<=mid&&j<=high){
		count++;
		if(arr[i]>arr[j]){
			c[k] = arr[j];
			k++;
			j++;
		}
		else{
			c[k] = arr[i];
			i++;
			k++;
			
			
		}
		
		if(i>mid){
		
			while(j<=high){
				c[k] = arr[j];
				j++;
				k++;
			}}
			else if(j>high){
				while(i<=mid){
					c[k] = arr[i];
					i++;
					k++;
				}}   
				
			}
	  for(int x = low;x<=high;x++){
		  arr[x] = c[x];
		}
	
	
	
	
	}}
class Driver2{
	public static void main(String[] args){
		int[] arr = {5,4,3,2,1};
		Comparison c = new Comparison();
		c.bubbleSort(arr);
		c.selectionSort(arr);
		c.divideArr(arr,0,4);
		
	}
}
		
	