import java.util.*;
//Method overloading
class MathOperation{
	public static int multiply(int a, int b) {
		return a*b;
	}
	
	public static double multiply(double x, double y) {
		return x*y;
	}
	public static double multiply(double i, int j) {
		return i*j;
	}
	public static int multiply(int r) {
		return r*r;
	}
}
//Method overriding

class user{ //Base class
	
	String name;
	int age;
	user(String n,int a){
		this.name=n;
		this.age=a;
	}
	
	public void display() {
		System.out.println("Name  : "+name);
		System.out.println("Age  : "+age);
	}
}
class MainProgrammer extends user{  // Derived class
	String CompanyName;

	MainProgrammer(String n, int a,String c) { 
		super(n, a);
		this.CompanyName =c;
		// TODO Auto-generated constructor stub
	} 
	public void display() {
		System.out.println("Name  : "+name);
		System.out.println("Age  : "+age);
		System.out.println("Company Name: "+CompanyName);
	}
	
}
public class PolymorphismEx {
	
	public static void main(String[]args) {
		
		System.out.println("Multiply 2 Integer value: "+MathOperation.multiply(25,10));
		System.out.println("Multiply 2 Integer value: "+MathOperation.multiply(2.5,8.5));
		System.out.println("Multiply 2 Integer value: "+MathOperation.multiply(2.5,25));
		System.out.println("Multiply 2 Integer value: "+MathOperation.multiply(2));

		
		MainProgrammer o = new MainProgrammer("Anwar",25,"Muthu");
		o.display();


	}
	
 
}
