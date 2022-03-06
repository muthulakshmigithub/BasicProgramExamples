import java.util.Scanner;
public class GroupSwitch {
	
	public static void main(String[]args) {
		System.out.println("Enter character");
		Scanner sc = new Scanner(System.in); 
		char c = sc.next().charAt(0);
		switch(c) {
		
		case ('a'):
		case ('e'):
		case ('i'):
		case ('o'):
		case ('u'):
		case ('A'):
		case ('E'):
		case ('I'):
		case ('O'):
		case ('U'):
System.out.println(c + " is a vowel");
		break;
		default:
			System.out.println(c + " is a consonant");
			break;
			
		}
	}

}
