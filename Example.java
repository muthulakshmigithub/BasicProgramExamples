import java.util.*;
public class Example {
	
	
	
	public static void main(String[]args) {
		
		System.out.println("Enter the matrix dimention");
		
	Scanner sc = new Scanner(System.in);
	int m = sc.nextInt();
	int n= sc.nextInt();
	int a[][]= new int[m][n];
	int b[][] = new int[m][n];
	int c[][]= new int[m][n];
	
	System.out.println("Enter the first matrix: ");
	
	for(int i=0;i<n;i++) {
		
		for(int j=0;j<n;j++) {
			
			a[i][j]= sc.nextInt();
			
		}
	}
	System.out.println("Enter the second matrix: ");

for(int i=0;i<n;i++) {
		
		for(int j=0;j<n;j++) {
			
			b[i][j]= sc.nextInt();
			
		}
	}

System.out.println("result of  matrix: ");

for(int i=0;i<n;i++) {
		
		for(int j=0;j<n;j++) {
			
		System.out.print((c[i][j]=a[i][j]*b[i][j])+" ");
			
		}
		
		System.out.println(" ");
		
	}
	}

}
