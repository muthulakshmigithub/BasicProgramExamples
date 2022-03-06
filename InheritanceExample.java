import java.util.*;
//single inheritance

class Father{  //base class
	
	public void house() {
		
		System.out.println("have own 2bhk house.");
		
	}
}

class son extends Father{  //derived class
	
	public void car() {
		
		System.out.println("have own audi car.");
		
	}
}
//multilevel inheritance

class baby extends son{  //derived class
	
	public void land() {
		
		System.out.println("have own bike toy.");
		
	}
}


//hierarchical inheritance

class papa extends Father{
	
	public void jwel() {
		
		System.out.println("have own new jwell");
	}
}

public class InheritanceExample {
	
	public static void main(String[]args) {
		
		InheritanceExample ob = new  InheritanceExample();
		
		son s = new son();
		baby b = new baby();
		papa p = new papa();
		
		s.car();
		s.house();
		b.land();
		p.jwel();
		
		
	}

}
