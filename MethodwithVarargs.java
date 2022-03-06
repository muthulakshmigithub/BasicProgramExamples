import java.util.*;
public class MethodwithVarargs {
	
	public static void getNames(String... names) {
		
		
		for(String name:names)
			System.out.println(name);
		//System.out.println(name[0]);
		//System.out.println(name[1]);
	}
	
	
	public static void main(String[]args) {
		getNames("ram","sam","sara","muthu");
		
	}

}
