import java.util.Scanner;
class SqrRoot{
	int n;
	 SqrRoot(int m) {
		int start = 1;
		int end = m;
		int mid = (start+end)/2;
		while(start<=end) {
			
			if(mid*mid<m) {
				start = mid+1;
				n = mid;				
				mid = (start+end)/2;
				
				
			}
			else if(mid*mid>m) {
				end = mid-1;
				mid = (start+end)/2;
				
			}
			else {
				n = mid;
				break;
			}
		}
		System.out.println("The square root of number is: "+n);
		
	}
}
class ADA0{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("Enter the number whose square root is to be found: ");
		n = s.nextInt();
		new SqrRoot(n);
	}
}