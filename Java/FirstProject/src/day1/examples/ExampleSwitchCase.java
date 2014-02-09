package day1.examples;

public class ExampleSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 5;
		switch(j){ // Looks for cases below for values that match j = 2
		case 0: 
			System.out.println("Value is 0");
			break; // If breaks in cases are not used, then the script would print all of the case parameters without checking for each case individually
		case 1: 
			System.out.println("Value is 1");
			break;
		case 2: 
			System.out.println("Value is 2");
			break;
		case 3: 
			System.out.println("Value is 3");
			break;
		default:
			System.out.println("No Value");
			break;
		}
	}

}
