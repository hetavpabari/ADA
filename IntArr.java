package adalab;
import java.util.*;
public class IntArr {
	int a;
	int arr[];
	IntArr(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of integers: ");
		a = sc.nextInt();
		arr = new int[a];
		System.out.println("Enter the random integers: ");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		int max = arr[0];
		for(int i=0;i<a;i++) {
			if(arr[i]<max)
				max = arr[i];
		}
				
		

}
}