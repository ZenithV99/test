package day1.examples;

public class ExampleWhile {
//small difference between FOR and WHILE. While can be used with a BOOL, and FOR has a set of constraints that need to be defined such that the acquired operation can be found.  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int x = -10;
         while(x <= 0){
        	 System.out.println("x = " + x);
        	 //x++; OR
        	// x = x + 1; <<- another way to write
        	x += 1; // Reads X equals X 'plus' 1. This is an addition assignment.
         }
	}

}