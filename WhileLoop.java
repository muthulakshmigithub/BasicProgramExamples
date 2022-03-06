import java.util.*;
import java.util.Scanner;
public class WhileLoop {
	public static void maain(String[]aargs) {
		
		System.out.println("Enter the limit :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i= 1;
		//do_while
		do {
			System.out.println(i);
			i++;

		}while(i<=n);
		
		//while loop
		
//		while(i<=n) {
//			System.out.println(i);
//			i++;
//			
//		}
	}

}
