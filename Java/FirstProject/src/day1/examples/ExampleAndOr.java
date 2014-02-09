package day1.examples;

public class ExampleAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x, y;
        x = 10; 
        y = -10;
        
        if(x > 0 && y > 0){ // && = AND 
        	System.out.println("Both numbers are positive");
        }else if(x > 0 || y > 0){ // || = OR
        	System.out.println(" At least one number is positive");
        }else{ // Default third extraneous solution if first two are not true
        	System.out.println(" Both nums are negative");
        	
        	
        }
	}

	}
