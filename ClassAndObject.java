import java.util.*;

class rectangle{
	
	int length ,width;
	void getDetails(int x,int y) {
		length = x;
		width = y;
	}
	
	int area() {
		
		int a = length*width;
		return a;
	}
}
public class ClassAndObject {
	
	public static void main(String[]args) {
		
		rectangle ob = new rectangle();
	  ob.length=10;
	  ob.width=20;
	 System.out.println( "area of rectangle: "+ob.area()); 
	  
	//  rectangle ob1 = new rectangle();
	  ob.getDetails(20,30);
	 System.out.println("Area of reectangle: "+ ob.area());
		
	}

}
