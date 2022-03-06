import java.util.Scanner;
public class InputMethods {
	//a2+b2+2ab
	public static void main(String[]args) {
		System.out.println("Enter 2 numbers");
		Scanner sc= new Scanner(System.in);
		
//		float c;
//		float a= sc.nextFloat();
//		float b= sc.nextFloat();

//		double c;
//		double a= sc.nextDouble();
//		double b= sc.nextDouble();
		
  	    int c;	
    	int a= sc.nextInt();
	    int b= sc.nextInt();
	 c= (a*a)+(b*b)+2*a*b;
	 System.out.println("Result: "+ c);
	}

}
