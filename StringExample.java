import  java.util.*;
public class StringExample {
	
	String name;
	int id;
public StringExample(String name, int i) {
	this.name= name;
	this.id =i;
		// TODO Auto-generated constructor stub
	}

public String toString() {
	//concatenate the value int inside the string 
	return this.name+" "+this.id;
	//return this.name;
	
}
//	
//	public String toString() {
//		
//		return "ABCD123";
//	}

	public static void main(String[]args) {
		
		 
		
//		String s = "abc";
//		System.out.println(s);
//		System.out.println(s.hashCode());
//		s = "pqr";
//		System.out.println(s);
//		System.out.println(s.hashCode());
//		string s2= "abc";
		
		//String is immutable
		
		String s1 = "Tamilnaadu";
		String s2 = "Tamilnaadu";
		String s3 = "Tamilnaadu";
		String s4 = "Tamilnaadu";
		String s5 = "Tamilnaadu";
		 
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		s1= "kerala";
		System.out.println(s1.hashCode());
		
		StringExample se = new StringExample("muthu", 123);
		System.out.println(se);
//		String s = new String("Aghha ruban");
//		System.out.println(s.length());
		/*int i=0;
		int count =0;
		//for(i=0;i<s.length();i++) {
			
			//char ch = s.charAt(i);
			if(ch=='a'||ch=='A') {
				 count++;
				
			}
		//	System.out.println(ch);
		}
		System.out.println(count);*/
 //       System.out.println(s.charAt(0));
//		System.out.println(se);
//	System.out.println(s);
		

		
	}

}
