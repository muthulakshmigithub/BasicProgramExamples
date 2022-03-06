import java.util.Scanner;;
public class ArrayOddEven {
	
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = sc.nextInt();
		int a[]= new int[n];
		int e=0,o=0;
		
		for(int i=0;i<n;i++) {
			
			System.out.print("Enter a["+i+"]value: ");
			a[i]= sc.nextInt();
		}
		for(int element : a) {
			
			//System.out.println(element);
			if(element%2==0) {
				e++;
				
			}else {
				o++;

			}
		}
		System.out.println("The even numbers: "+e);
		System.out.println("The odd numbers: "+o);

	}

}
