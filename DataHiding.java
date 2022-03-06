import java.util.*;
class shperectangle{
	
	private int length, width;
	//getter method
	int getLength() {
		return length;
		
	}
	int getWidth() {
		return width;
		
	}
	
	//setter method
	
	
	void setLength(int l) {
		if(l>0)
		length =l;
		else
			length =0;
	}
	
	
	
	void setWidth(int w) {
		if(w>0)
		width= w;
		else 
			width=0;
	}
	
	int area() {
		int a= length*width;
		return a;
	}
}
public class DataHiding {
	
	public static void main(String[]args) {
		
		shperectangle o = new shperectangle();
		o.setLength(10);
		o.setWidth(20);
		System.out.println("Length: "+o.getLength());
		System.out.println("Width: "+o.getWidth());

		System.out.println("Area of rectangle: "+o.area());
	}

}
