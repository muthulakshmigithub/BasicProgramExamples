import java.util.*;
public class LogicalOperator {
	
	//&& any one false = false
	//|| any one true = true
	public static void main(String[]args) {
		
		int m1=25,m2=75;
		System.out.println("And && : "+ (m1>=35 && m2>=35));
		System.out.println("Or || : "+ (m1>=35 || m2>=35));

	}

}
