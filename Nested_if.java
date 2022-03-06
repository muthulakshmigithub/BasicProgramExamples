import java.util.*;
public class Nested_if {
	
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marital status M/U: ");
		
		char n = sc.next().charAt(0);
		
		if(n=='u' || n=='U') {
			System.out.println("Enter the gender M/F: ");
			char gender = sc.next().charAt(0);
			System.out.println("Enter the age: ");
			int age = sc.nextInt();
		
		if((gender=='m' || gender=='M') && age>=30) {
			
			System.out.println("Youu are eligible");
		}
		
		else if((gender=='f' || gender=='F') && age>=25) {
			
			System.out.println("Youu are eligible");
		}
		else  {
			
			System.out.println("Youu are not eligible");
		
	}
		}

     else if((n=='m' || n=='M'))
    		 {
			
			System.out.println("Youu are eligible");
		}
		else  {
			
			System.out.println("Invalid input");
	
	}
}
	}
