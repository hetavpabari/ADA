import java.util.Scanner;
public class MergeSort {
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
	int count = 0;
	
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
	}
	
		
	}
class Driver1{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n;
	int arr[];
	System.out.println("Enter the size of array: ");
	n = sc.nextInt();
	arr = new int[n];
	System.out.println("Enter the array elements: ");
	for(int i=0;i<n;i++){
		arr[i] = sc.nextInt();
	}
	new MergeSort().divideArr(arr,0,n-1);
	for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
	}
}}
