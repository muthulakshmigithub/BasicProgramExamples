import java.util.*;
import java.util.Scanner;
public class If_else {
	
	public static void main(String[]args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter year: ");
		
		int n = sc.nextInt();
		if(n%4==0 || (n%100==0 && n%400==0)) {
			
			System.out.println("year "+ n + " is a leap year");
		}else {
			System.out.println("year "+ n + " is not a leap year");

		}
	}
	

}
