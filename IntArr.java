package adalab;
import java.util.*;
public class IntArr {
	int a;
	int arr[];
	static void printMax(int[] arr,int a){
		
		int max = arr[0];
		for(int i=0;i<a;i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("The maximum of the given numbers is: "+max);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of integers: ");
		int a = sc.nextInt();
		int[] arr = new int[a];
		System.out.println("Enter the random integers: ");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		printMax(arr,a);
		
		

}
}