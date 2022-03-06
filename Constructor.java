 import java.util.*;
 class RectangleShape{
	 
	 int length,width;
	 //default constructor
	 RectangleShape(){
		 
		 length = 8;
		 width=6;
		 
	 }
	 // parameterized constructor
	 
	 RectangleShape(int x,int y){
		 
		 length = x;
		 width=y;
		 
	 }
	 
	 
	 RectangleShape(int x){
		 
		 length = width= x;
		 
	 }
	 
	 int area() {
		 int a= length*width;
		 return a;
	 }
 }
public class Constructor {
	
	public static void main(String[]args) {
		RectangleShape m = new RectangleShape();
		System.out.println("Area of rectaangle : "+m.area());
		
		RectangleShape m1 = new RectangleShape(3,6);
		System.out.println("Area of rectaangle : "+m1.area());
		
		RectangleShape m2 = new RectangleShape(3);
		System.out.println("Area of rectaangle : "+m2.area());
	}

}
