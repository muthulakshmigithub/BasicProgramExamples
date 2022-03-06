import java.util.Arrays;
import java.util.Scanner;
public class AssendingOrder {
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int n = sc.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("Enter a["+i+"]value: ");
			a[i]=sc.nextInt();

		}
		
		System.out.println("Before sort: "+ Arrays.toString(a));

		int temp;
		for(int i=0;i<a.length;i++) {
			
			for(int j= i+1;j<a.length;j++) {
		//		> desending order,< assending order
				if(a[i]<a[j]) {
					
				
				temp= a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
		}
		
		System.out.println("After sort: "+ Arrays.toString(a));

		
	}

}
