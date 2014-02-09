package day1.examples;

public class ExampleDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x = 10; //Defined here
        
        do{ 
           System.out.println("x = " + x); //Used to define each half of the equation
           x--; //Decrements by 1 
        	
        }while(x > -10);
       
	}
}

//Do-while first executes statement, THEN checks for a certain value using WHILE, as opposed to using WHILE first
//Do-while executes statement AT LEAST once