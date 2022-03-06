import java.util.*;
class Student{
	public int rollno;
	public String name;
	Student(int rollno,String name){
		
		this.rollno=rollno;
		this.name=name;
	}
	
	void print() {
		
		System.out.println("Name     : "+name);
		System.out.println("Roll No     : "+rollno);
		
		System.out.println("----------------------------------");


	}
}
public class ArrayObjects {
	
	public static void main(String[] args) {
		
		Student[] ob =new Student[5];
	//	ob = new Student[5];
		ob[0]=new Student(10,"Ram");
		ob[1]=new Student(28,"Sam");
		ob[2]=new Student(45,"Ravi");
		ob[3]=new Student(50,"Kumar");
		ob[4]=new Student(23,"Vijay");
		for(int i=0;i<ob.length;i++) {
			
			ob[i].print();

		}
	}

}
