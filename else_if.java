import java.util.*;
public class else_if {
	public static void main(String[]args) {
		System.out.println("Enter the mark: ");
		Scanner sc= new Scanner(System.in);
		float n= sc.nextFloat();
		
		if(n>=90 && n<=100) {
			
			System.out.println("Grade A");
			
		}
		else if(n>=80 && n<=89) {
			System.out.println("Grade B");

		}
		
		else if(n>=70 && n<=79) {
			System.out.println("Grade C");

		}
		else {
			System.out.println("Grade D");

		}
		
	}

}
